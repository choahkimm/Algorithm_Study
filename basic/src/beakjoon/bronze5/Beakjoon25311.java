package beakjoon.bronze5;

import java.util.Scanner;

public class Beakjoon25311 {
    // 백준 25311. UCPC에서 가장 쉬운 문제 번호는?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        if(y >= 2018 && y <= 2022){
            System.out.println("A");
        }
    }
}
