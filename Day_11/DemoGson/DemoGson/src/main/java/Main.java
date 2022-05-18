import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.Student;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1,"Quang",22,"quang@gmail.com");
        System.out.println(student);
        //Chuyển object sang Gson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String studentJason=gson.toJson(student);
        System.out.println("Chuoi GSon");
        System.out.println(studentJason);

        //Chuyển từ Gson sang object
        String studentJson1= """
                {
                    "id" : 3,
                    "name": "Nguyen Van A",
                    "age": 30,
                    "email": a@gmail.com
                }
                """;
        Student student1 = gson.fromJson(studentJson1,Student.class);
        System.out.println(student1);

        try {
            Reader reader = Files.newBufferedReader(Paths.get("list-student.json"));
            List<Student> students = Arrays.asList(gson.fromJson(reader,Student[].class));
            for (Student s:students){
                System.out.println(s);
            }
            reader.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        try {
            List<Student> otherList = new ArrayList<>();
            otherList.add(student);
            otherList.add(student1);
            Writer writer = Files.newBufferedWriter(Paths.get("list-student.json"));
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
