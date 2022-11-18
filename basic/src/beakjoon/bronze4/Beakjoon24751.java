package beakjoon.bronze4;

import java.util.Scanner;

public class Beakjoon24751 {
    // 백준 24751. Betting
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 실수를 다뤄야 하니까 double 사용
        // - 실수 표현 자료형 : float, double
        // int 는 정수만 리턴한다
        double a = sc.nextInt();

        double winP = 100/a;
        double loseP = 100/(100-a);
        System.out.printf(String.format("%.10f",winP));
        System.out.println();
        System.out.printf(String.format("%.10f",loseP));
    }
}
