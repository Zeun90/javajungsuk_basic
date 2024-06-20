package practice;

import java.util.Scanner;

public class Practice4_10 {

    public static void main(String[] args) {
        int answer = (int) (Math.random() * 100 + 1);
        int input = 0;
        int count = 0;
        System.out.println(answer);
        java.util.Scanner s = new Scanner(System.in);

        do {
            count++;
            System.out.print("1과 100 사이의 값을 입력하세요 : ");
            input = s.nextInt();

            if (input < answer) {
                System.out.println("더 큰 수를 입력하세요.");
            } else if (input > answer) {
                System.out.println("더 작은 수를 입력하세요.");
            } else {
                System.out.println("맞혔습니다.");
                System.out.println("시도횟수는 " + count + "번입니다.");
                break;
            }
        } while (true);
    }
}
