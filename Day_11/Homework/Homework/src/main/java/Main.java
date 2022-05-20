import com.google.gson.Gson;
import controller.UserController;
import models.User;
import services.UserServices;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        UserController userController = new UserController();
        userController.run();
    }
}
