package beakjoon.bronze4;

import java.util.Scanner;

public class Baekjoon17874 {
    // 백준 17874. Piece of Cake!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), h = sc.nextInt(), v = sc.nextInt();

        int case1 = (n-h)>h? n-h : h;
        int case2 = (n-v)>v? n-v : v;
        System.out.println(case1 * case2 * 4);
    }
}
