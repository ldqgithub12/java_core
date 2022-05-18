package services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.MyException;
import models.User;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserServices {
    public UserServices(){
    }
    List<User> listUser = new ArrayList<>();
    public List<User> getObjectFromJsonFile(String fileName) {
        try {
            // Khởi tạo đối tượng gson
            Gson gson = new Gson();

            // Tạo đối tượng reader để đọc file
            Reader reader = Files.newBufferedReader(Paths.get(fileName));
            // Đọc thông tin từ file và binding và class
            List<User> users = Arrays.asList(gson.fromJson(reader, User[].class));
            // Đọc file xong thì đóng lại
            // Và trả về kết quả
            reader.close();
            return users;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    private void convertObjectToJsonFile(String fileName, Object obj) {
        try {
            // Tạo đối tượng gson
            // Gson gson = new Gson();
            // Nếu muốn format JSON cho đẹp
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            // Tạo đối tượng Writer để ghi nội dung vào file
            Writer writer = Files.newBufferedWriter(Paths.get(fileName));

            // Ghi object vào file
            gson.toJson(obj, writer);

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void register() throws IOException {
        String email ="";
        String email_pattern = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        List<User> newUser = new ArrayList<>();
        listUser = getObjectFromJsonFile("list-user.json");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap user email: ");
        email = sc.nextLine();
        if (!Pattern.matches(email_pattern,email)){
            throw new MyException("Email khong dung dinh dang");
        }
        int count=0;
        for (User u:listUser) {
            if (u.getEmail().equals(email)){
                count++;
            }
        }
        if (count>0){
            throw new MyException("Email da ton tai");
        }
        System.out.print("Nhap user name: ");
        String userName = sc.nextLine();
        System.out.print("Nhap password: ");
        String password = sc.nextLine();
        User user = new User(userName, email, password);
        newUser.add(user);
        newUser.addAll(listUser);
        convertObjectToJsonFile("list-user.json",newUser);
        System.out.println("Successful Register");;
    }
    public User login(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap email: ");
        String email = sc.nextLine();
        System.out.print("Nhap mat khau: ");
        String password = sc.nextLine();
        User user = new User();
        int count =0;
        listUser = getObjectFromJsonFile("list-user.json");
        for (User u: listUser) {
            if (u.getEmail().equals(email) && u.getPassWord().equals(password)){
                user=u;
                count++;
                break;
            }
        }
        if (count == 0){
            throw new MyException("Email hoac Mat khau khong chinh xac");
        }
        return user;
    }
    public void forgetPassword(){
        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.println("Nhap email" );
        String confirmEmail = sc.nextLine();
        listUser = getObjectFromJsonFile("list-user.json");
        int count = 0;
        for (User u: listUser) {
            if (u.getEmail().equals(confirmEmail)){
                user =u;
                count++;
            }
        }
        if (count == 0){
            throw new MyException("Email khong ton tai");
        }
        else {
            System.out.println("Email hop le");
            System.out.println("Nhap mat khau moi");
            String newPassword = sc.nextLine();
            user.setPassWord(newPassword);
            for (User u: listUser) {
                if (u.getEmail().equals(confirmEmail)){
                    u = user;
                }
            }
            convertObjectToJsonFile("list-user.json",listUser);
            System.out.println("Change password successfully");
        }
    }

    public void changeUsername(User user){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten moi: ");
        String newUsername = sc.nextLine();
        user.setUserName(newUsername);
        for (User u:listUser) {
            if (user.getEmail().equals(u.getEmail())){
                u = user;
            }
        }
        convertObjectToJsonFile("list-user.json",listUser);
        System.out.println("Change user name successfully");
    }
    public void changePassword(User user){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mat khau moi: ");
        String newPassword = sc.nextLine();
        user.setPassWord(newPassword);
        for (User u:listUser) {
            if (user.getEmail().equals(u.getEmail())){
                u = user;
            }
        }
        convertObjectToJsonFile("list-user.json",listUser);
        System.out.println("Change password successfully");
    }
    public void changeEmail(User user){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap email moi: ");
        User oldUser = user;
        String newEmail = sc.nextLine();
        int count = 0;
        for (User u:listUser) {
            if (u.getEmail().equals(newEmail)){
                count++;
            }
        }
        if (count>0){
            throw new MyException("Trung email roi bro");
        }
        user.setEmail(newEmail);
        for (User u:listUser) {
            if (oldUser.getEmail().equals(u.getEmail())){
                u = user;
            }
        }
        convertObjectToJsonFile("list-user.json",listUser);
        System.out.println("Change email successfully");
    }
}
