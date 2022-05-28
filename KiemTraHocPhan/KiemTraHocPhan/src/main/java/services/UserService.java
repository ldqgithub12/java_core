package services;

import com.google.gson.Gson;
import models.User;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class UserService {
    List<User> userList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public UserService() {
        userList = getObjectFromJsonFile("user.json");
    }

    private List<User> getObjectFromJsonFile(String filename){
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(filename));
            List<User> users = Arrays.asList(gson.fromJson(reader,User[].class));
            reader.close();
            return users;
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        return null;
    }
    public List<User> getUserList(){
        return userList;
    }
    public User login(){
        User user = new User();
        System.out.print("Enter your phone number: ");
        String phoneNumber =sc.nextLine();
        System.out.print("Enter your password: ");
        String password =sc.nextLine();
        return user = (User) userList.stream().filter(user1 -> user1.getPhone().equals(phoneNumber) && user1.getPassword().equals(password));
    }
}
