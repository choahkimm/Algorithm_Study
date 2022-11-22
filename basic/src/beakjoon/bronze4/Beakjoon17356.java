package beakjoon.bronze4;

import java.util.Scanner;

public class Beakjoon17356 {
    // 백준 17356. 욱 제
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        double answer = 1 / (1+ Math.pow(10,(B-A)/400.0));
        System.out.println(answer);
    }
}
