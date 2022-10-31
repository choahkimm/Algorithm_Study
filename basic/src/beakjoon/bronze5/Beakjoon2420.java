package beakjoon.bronze5;

import java.util.Scanner;

public class Beakjoon2420 {
    // 백준 2420. 사파리 월드
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        // Math.abs = 절대값 구하는 함수
        System.out.println(Math.abs(n-m));
    }
}

// 항상 문제의 범위를 잘 볼 것
