public class DemoCustomUncheck {
    public static boolean findElement(int value){
        int[] numbers ={1,2,3,4,5,6};
        for (int number:numbers) {
            if (number == value) {
                return true;
            }
        }
        throw new NotFoundException("Khong tim thay phan tu co gia tri ="+value);
    }

    public static void main(String[] args) {
        try {
            findElement(9);
        }catch (NotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
