package beakjoon.bronze5;

import java.util.Scanner;

public class Beakjoon20492 {
    // 백준 20492. 세금
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        System.out.println((int)(price*0.78));
        System.out.println((int)(price - price*0.2*0.22));
    }
}
