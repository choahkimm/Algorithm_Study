package beakjoon.bronze5;

import java.util.Scanner;

public class Beakjoon2438 {
    // 백준 2438. 별 찍기 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
