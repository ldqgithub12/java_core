import controller.UserController;
import models.TransactionHistory;
import models.User;
import services.UserService;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.run();
    }
}
