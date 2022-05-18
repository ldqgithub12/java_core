import models.User;
import services.UserServices;

import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        UserServices userServices = new UserServices();
        try{
            List<User> listUser = new ArrayList<User>();
            listUser = userServices.getObjectFromJsonFile("list-user.json");
            listUser.add(new User("Quang1","quang1@gmail.com","123456"));
            Writer writer = Files.newBufferedWriter(Paths.get("list-user.json"));
            writer.close();
        }
        catch (RuntimeException e){
            e.printStackTrace();
        }
    }
}
