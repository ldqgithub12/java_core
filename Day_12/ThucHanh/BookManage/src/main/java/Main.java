import controller.BookController;
import models.Book;
import services.BookServices;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookController bookController = new BookController();
        bookController.run();
    }
}
