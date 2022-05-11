public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer(1,"Quang",22,"0912345678","quang@gmail.com",1000000,10);
        Tester tester = new Tester(2,"Quang2",22,"0912345678","quang@gmail.com",1000000,10);
        developer.printInfor();
        System.out.println();
        tester.printInfor();
    }
}
