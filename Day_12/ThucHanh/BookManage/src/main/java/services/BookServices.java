package services;

import com.google.gson.Gson;
import exception.NotFoundException;
import models.Book;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class BookServices {
    List<Book> bookList = getObjectFromJsonFile("book.json");
    Scanner sc = new Scanner(System.in);
    public List<Book> getObjectFromJsonFile(String fileName) {
        try {
            // Khởi tạo đối tượng gson
            Gson gson = new Gson();
            // Tạo đối tượng reader để đọc file
            Reader reader = Files.newBufferedReader(Paths.get(fileName));
            // Đọc thông tin từ file và binding và class
            List<Book> users = Arrays.asList(gson.fromJson(reader, Book[].class));
            // Đọc file xong thì đóng lại
            // Và trả về kết quả
            reader.close();
            return users;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<Book> findByName(){
        List<Book> nameList = new ArrayList<>();
        System.out.println("Nhap ten sach can tim: ");
        String searchString = sc.nextLine();
        for (Book b:bookList) {
            if (b.getTitle().toLowerCase().contains(searchString.toLowerCase())){
                nameList.add(b);
            }
        }
        if (nameList.isEmpty()){
            throw new NotFoundException("Khong tim thay sach nay roi bro oi");
        }
        return nameList;
    }
    public List<Book> findByCategory(){
        List<Book> result = new ArrayList<>();
        System.out.println("Nhap category muon tim: ");
        String category = sc.nextLine();
        for (Book book:bookList) {
            for (String name:book.getCategory()) {
                if (name.toLowerCase().equals(category.toLowerCase())){
                    result.add(book);
                }
            }
        }
        if (result == null){
            throw new NotFoundException("Khong tim thay sach nay roi bro oi");
        }
        return result;
    }
    public void sortByPageNumber(){
        bookList.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPage_number()-o2.getPage_number();
            }
        });
        System.out.println("Danh sach sach sau khi sap xep la: ");
        for (Book b:bookList) {
            System.out.println(b);
        }
    }

    public void sortByReleaseYear(){
        bookList.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getRelease_year()-o2.getRelease_year();
            }
        });
        System.out.println("Danh sach sach sau khi sap xep la: ");
        for (Book b:bookList) {
            System.out.println(b);
        }
    }
}
