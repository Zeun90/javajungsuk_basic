package practice;

// 1+ (-2) +3+ (-4) +... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상이 되는지 구하시오.
public class Practice4_4 {

    public static void main(String[] args) {
        int sum = 0;
        int num = 1;

        while (sum < 100) {
            sum += num;
            if (num > 0) {
                num++;
            } else if (num < 0) {
                num--;
            }
            num = -num;
        }

        System.out.println(num);
    }
}
