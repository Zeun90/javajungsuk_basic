package practice;

public class Practice4_5 {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;

        while (num1 <= 10) {
            while (num2 <= num1) {
                System.out.print("*");
                num2++;
            }
            System.out.println();
            num1++;
            num2 = 0;
        }
    }
}
