package practice;

public class Practice4_9 {

    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        for (int i = 10000; i > 0; i /= 10) {
            sum += num / i;
            num -= i * (num / i);
        }
        System.out.println("sum: " + sum);
    }
}
