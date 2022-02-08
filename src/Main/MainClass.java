package Main;

public class MainClass {
    public static void main(String[] args) {
        int[] mas = {12, 54, 23, 96, 1, 65};
        for (int num : mas) {
            if (num % 2 == 0) {
                System.out.println(num + 4);
            } else {
                System.out.println(num + 1);
            }
        }
    }
}
