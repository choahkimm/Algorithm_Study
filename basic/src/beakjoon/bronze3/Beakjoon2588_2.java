package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2588_2 {
    // 백준 2588. 곱셈
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        char[] b = br.readLine().toCharArray();

        int sum =0;
        int su = 1;
        for(int i=2; i>=0; i--){
            int temp = Integer.parseInt(String.valueOf(b[i]));
            System.out.println(a*temp);
            sum += (a*temp)*su;
            su *= 10;
        }
        System.out.println(sum);
    }
}
