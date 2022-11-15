package beakjoon.bronze5;

import java.util.Scanner;

public class Beakjoon25314 {
    // 백준 25314. 코딩은 체육과목 입니다
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = n/4;

        for(int i=0; i<x; i++){
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
