package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon11720 {
    // 백준 11720. 숫자의 합
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char [] c = new char[n];
        String s = br.readLine();
        int sum = 0;
        for(int i=0; i<n; i++){
            c[i] = s.charAt(i);
            sum += Integer.parseInt(String.valueOf(c[i]));
        }
        System.out.println(sum);
    }
}
