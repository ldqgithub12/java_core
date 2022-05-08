package Services;

import Model.Book;

import java.time.LocalDate;

public class BookServices {
    public Book[] getBooks(){
//        Tạo ra mảng book
        Book[] books ={
                new Book(1, "Nhung nguoi khon kho", "Bui Hien", "tieu thuyet", "Kim Dong", 2019),
                new Book(2, "dac nhan tam", "To Hoai", "trinh tham", "Tuoi tre", 2022),
                new Book(3, "Deep work", "Thu Hang", "ky nang song", "Phu nu", 2021),
                new Book(4, "Ren luyen tu duy phan bien", "Minh Duy", "tieu thuyet", "Kim Dong", 2022),
                new Book(5, "Nghin le mot dem", "Minh Tri", "trinh tham", "Phu nu", 2019)
        };
        return books;
    }

    public void findByTitle(String title){
        int cout =0;
        for (Book book:getBooks()
             ) {
            if (book.title.contains(title)){
                cout++;
                System.out.println(book);
            }
        }
        if (cout==0){
            System.out.println("Khong tim thay ket qua "+"\""+title+"\"");
        }
    }
    public void findByCategory(String category){
        int cout =0;
        for (Book book:getBooks()
        ) {
            if (book.category.contains(category)){
                cout++;
                System.out.println(book);
            }
        }
        if (cout==0){
            System.out.println("Khong tim thay ket qua "+"\""+category+"\"");
        }
    }

    public void findByPublishingOfThisYear(){
        int currentYear = LocalDate.now().getYear();
        int count = 0;
        for (Book book:getBooks()
        ) {
            if (book.year == currentYear){
                count++;
                System.out.println(book);
            }
        }
        if (count==0){
            System.out.println("Khong co sach xuat ban trong nam "+"\""+currentYear+"\"");
        }
    }
}
