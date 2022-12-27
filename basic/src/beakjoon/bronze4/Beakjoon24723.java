package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon24723 {
    // 백준 24723. 녹색거탑
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 1;
        for(int i=0; i<n; i++){
            sum *=2;
        }
        System.out.println(sum);
    }
}
