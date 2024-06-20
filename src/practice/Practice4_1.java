package practice;

import java.util.Scanner;

public class Practice4_1 {
    static Scanner sc =  new Scanner(System.in);

    public static void main(String[] args) {
        Practice4_1 p4 = new Practice4_1();

        p4.isBetween10And20();
        p4.isNotSpaceOrTab();
        p4.isXorx();
        p4.isDigit();
        p4.isLetter();
        p4.isLeapYear();
        p4.isPowerOff();
        p4.isYes();
    }

    // 4-1_1 int형 변수 x가 10보다 크고 20보다 작을 때 true 조건식
    void isBetween10And20() {
        System.out.print("1. 숫자를 입력하세요.(11~19) ");
        int x = sc.nextInt();
        if (10 < x && x < 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    // 4-1_2 char형 변수 ch가 공백이나 탭이 아닐 때 true 조건식
    void isNotSpaceOrTab() {
        System.out.print("2. 공백이나 탭을 입력하지 마세요. ");
        char ch = sc.nextLine().charAt(0);
        if (!(ch == 32 || ch == 9)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    // 4-1_3 char형 변수 ch가 'x' 또는 'X'일 때 true 조건식
    void isXorx() {
        System.out.print("3. 'x' 또는 'X'를 입력하세요. ");
        char ch = sc.next().charAt(0);
        if (ch == 88 || ch == 120) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    // 4-1_4 char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식
    void isDigit() {
        System.out.print("4. 숫자를 입력하세요.( 0~9 ) ");
        char ch = sc.next().charAt(0);
        if (48 <= ch && ch <= 57) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    // 4-1_5 char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
    void isLetter() {
        System.out.print("5. 영문자를 입력하세요. ");
        char ch = sc.next().charAt(0);
        if (65 <= ch && ch <= 90 || 97 <= ch && ch <= 122) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    // 4-1_6 int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않 을 때 true인 조건식
    void isLeapYear() {
        System.out.print("6. 윤년을 입력하세요. ");
        int year = sc.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    // 4-1_7 boolean형 변수 powerOn가 false일 때 true인 조건식
    void isPowerOff() {
        System.out.print("7. 'false'를 입력하세요. ");
        boolean powerOn = sc.nextBoolean();
        if (!powerOn) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    // 4-1_8 문자열 참조변수 str이 "yes"일 때 true인 조건식
    void isYes() {
        System.out.print("8. 'yes'를 입력하세요. ");
        String str = sc.next();
        if (str.equals("yes")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
