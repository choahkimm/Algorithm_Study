package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2953 {
    // 백준 2953. 나는 요리사다
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxSum = 0;
        int cnt = 0;

        for(int i=0; i<5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;

            for(int j=0; j<4; j++){
                sum += Integer.parseInt(st.nextToken());
            }
            if(maxSum<sum){
                cnt = i;
                maxSum = sum;
            }
        }
        System.out.println(cnt+1 + " " +maxSum);
    }
}
