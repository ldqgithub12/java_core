import models.User;
import services.UserService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User u = userService.login();
        System.out.println(u);
    }
}
