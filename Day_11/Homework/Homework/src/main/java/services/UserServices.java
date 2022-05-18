package services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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

public class UserServices {
    public UserServices() throws IOException {
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
//    public void convertObjectToJsonFile(String fileName, Object obj) {
//        try {
//            // Tạo đối tượng gson
//            // Gson gson = new Gson();
//
//            // Nếu muốn format JSON cho đẹp
//            Gson gson = new GsonBuilder().setPrettyPrinting().create();
//
//            // Tạo đối tượng Writer để ghi nội dung vào file
//            Writer writer = Files.newBufferedWriter(Paths.get(fileName));
//
//            // Ghi object vào file
//            gson.toJson(obj, writer);
//
//            writer.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    public User register(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap user email: ");
            String email = sc.nextLine();
            System.out.print("Nhap user name: ");
            String userName = sc.nextLine();
            System.out.print("Nhap password: ");
            String password = sc.nextLine();
            User user = new User(userName, email, password);
            listUser = getObjectFromJsonFile("list-user.json");
            listUser.add(user);
            Writer writer = Files.newBufferedWriter(Paths.get("list-user.json"));
            writer.close();
            return user;
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
