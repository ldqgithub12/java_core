public class MathClass {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.min(10,20));
        System.out.println(Math.abs(-15));
        System.out.println((int)Math.sqrt(25));
        System.out.println(Math.ceil(1.1));
        System.out.println(Math.round(1.4));
        System.out.println(Math.round(1.5));
        System.out.println(Math.pow(2,3));
        System.out.println("In random từ 1 đến 10");
//        Random 1 số từ 0 đến 10

        for(int i =0; i<10; i++)
        {
            int randomNumber = (int) Math.round(Math.random()*(100-10+1)+10);
            System.out.println(randomNumber);
        }
    }
}
