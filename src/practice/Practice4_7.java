package practice;

public class Practice4_7 {

    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;
        int j = 0;

        for (int i = 0; i < str.length(); i++) {
            j = str.charAt(i) - '0';
            sum += j;
        }
        System.out.println("sum = " + sum);
    }
}
