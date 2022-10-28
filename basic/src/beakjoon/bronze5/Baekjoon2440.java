package beakjoon.bronze5;

import java.util.Scanner;

public class Baekjoon2440 {
    public static void main(String[] args) {
        // 2440.별 찍기 3

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 5
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println("");
            }
    }
}
