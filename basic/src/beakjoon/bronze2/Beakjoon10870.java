package beakjoon.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon10870 {
    // 백준 10870. 피보나치 수 5
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(Fibonacci(n));
    }

    // 피보나치 함수 구하기 (재귀함수)
    static int Fibonacci(int n){
        // 0과 1은 고정
        if(n==0) return 0;
        if(n==1) return 1;

        return Fibonacci(n-1) + Fibonacci(n-2);
    }
}
