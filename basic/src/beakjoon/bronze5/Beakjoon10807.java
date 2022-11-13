package beakjoon.bronze5;

import java.util.Scanner;

public class Beakjoon10807 {
    // 백준 10807. 개수 세기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] input = new int[n];
        for(int i=0; i<n; i++){
            input[i]=sc.nextInt();
        }
        int v = sc.nextInt();
        int answer = 0;
        for(int j=0; j<input.length; j++){
            if(input[j] == v) answer++;
        }
        System.out.println(answer);
    }
}
