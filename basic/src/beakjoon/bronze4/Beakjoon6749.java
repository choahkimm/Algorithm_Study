package beakjoon.bronze4;

import java.util.Scanner;

public class Beakjoon6749 {
    // 백준 6749. Next in line
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int last = sc.nextInt();
        int second = sc.nextInt();

        System.out.println(second + (second-last));

    }
}
