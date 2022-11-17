package beakjoon.bronze5;

import java.util.Scanner;

public class Beakjoon14581 {
    // 백준 14581. 팬들에게 둘러싸인 홍준
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        System.out.println(":fan::fan::fan:");
        System.out.println(":fan::" + n +"::fan:");
        System.out.println(":fan::fan::fan:");
    }
}
