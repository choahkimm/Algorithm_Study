package beakjoon.bronze5;

import java.util.Scanner;

public class Baekjoon3003 {
    // 백준 3003번. 킹, 퀸, 룩, 비숍, 나이트, 폰
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] chess = new int[]{1, 1, 2, 2, 2, 8}; // 기준점
        int[] array = new int[chess.length];

        // 입력받은 값 저장
        for (int i = 0; i < chess.length; i++) {
            array[i] = sc.nextInt();
        }
        // 비교 후 출력
        for (int i = 0; i < chess.length; i++) {
            array[i] = chess[i]-array[i];
            System.out.print(array[i] + " ");
        }
    }
}
