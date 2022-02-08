package Main;

public class Main_Class {
    public static void main(String[] args) {
        System.out.println(Math.abs(-1));
        System.out.println(Math.abs(-1.345d));
        System.out.println(Math.abs(12323421L));
        System.out.println(Math.abs(12.3567f));

        System.out.println(Math.sin(Math.toRadians(0)));
        System.out.println(Math.sin(Math.toRadians(30)));
        System.out.println(Math.sin(Math.toRadians(90)));
        System.out.println(Math.cos(Math.toRadians(0)));
        System.out.println(Math.cos(Math.toRadians(30)));
        System.out.println(Math.cos(Math.toRadians(90)));

        System.out.println(Math.pow(1,2));
        System.out.println(Math.pow(2,2));
        System.out.println(Math.pow(3,2));
        System.out.println(Math.pow(4,2));
        System.out.println(Math.pow(5,2));
        System.out.println(Math.pow(1,3));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.pow(3,3));
        System.out.println(Math.pow(4,3));
        System.out.println(Math.pow(5,3));

        System.out.println(Math.sqrt(4));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.cbrt(8));
        System.out.println(Math.cbrt(27));
        System.out.println(Math.cbrt(125));

        for (int i = 0; i < 5; i++) {
            System.out.println(Math.random());
        }
    }
}
