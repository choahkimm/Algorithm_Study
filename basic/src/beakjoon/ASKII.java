package beakjoon;

import java.util.Scanner;

public class ASKII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // char 타입의 문자 변수는 내부적으로 아스키 코드 값을 가지고 있다.
        // 문자 <-> 숫자

        // 1. 문자 -> 숫자
        char ch = sc.nextLine().charAt(0);
        System.out.println("문자열로 숫자가 들어온다? 그냥 char만 보면 " +ch);
        int num = ch;
        System.out.println("문자->숫자 아스키 코드 값 " + num);
        System.out.println("문자를 int형으로 변환하고 싶다 " + (num-'0')); // charcter 0의 아스키 코드는 48, 1의 아스키 코드는 49 이므로

        // 2. 숫자 -> 문자
        int num1 = sc.nextInt();
        char ch1 = (char)num1;
        System.out.println("숫자->문자 아스키 코드 값" + ch1);

    }
}
