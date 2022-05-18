import com.google.gson.Gson;
import controller.UserController;
import models.User;
import services.UserServices;

import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        UserController userController = new UserController();
        userController.run();
    }
}
