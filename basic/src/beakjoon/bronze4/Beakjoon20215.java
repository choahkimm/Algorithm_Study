package beakjoon.bronze4;

import java.util.Scanner;

public class Beakjoon20215 {
    // 백준 20215. Cutting Corners
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        double cutting_corners = Math.sqrt(h*h + w*w);
        // 제곱근(루트 구하기) Math.sqrt()
        System.out.println(h+w - cutting_corners);
    }
}
