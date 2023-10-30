package beakjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2018 {
    // 백준 2018. 수들의 합 5
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 1; // N 을 선택했을 때도 포함되므로
        int lp = 1;
        int rp = 1; // 인덱스 1부터
        int sum =1;

        // 굳이 배열까지 선언하고 넣지 않아도 되는 문제 1~ 나열되니까
        while (rp!=N){
            if(sum == N) {
                count ++;
                rp++;
                sum = sum+rp;
            }else if(sum > N){
                sum = sum-lp;
                lp++;
            }else { // 현재 연속 합이 N 보다 작은 경우
                rp++;
                sum = sum+rp;
            }
        }
        System.out.println(count);
    }
}
