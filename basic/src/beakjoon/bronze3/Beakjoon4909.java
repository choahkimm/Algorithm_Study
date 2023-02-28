package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon4909 {
    // 백준 4909. Judging Olympia
    // 최대와 최소 점수를 제외한 나머지 점수들의 평균을 구하는 문제
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            double [] arr = new double[6];

            double sum = 0;
            for(int i=0; i<6; i++){
                arr[i] = Double.parseDouble(st.nextToken());
                sum += arr[i];
            }

            if(sum==0) break;

            // 값을 순차적으로 정렬
            Arrays.sort(arr);
            // 최소 최대값을 제외한 값들을 더함
            sum -= arr[0] + arr[5];

            if(sum%4 == 0) System.out.printf("%.0f\n", sum/4); // 첫 번째 소수점자리수에서 반올림
            else System.out.println(sum/4);
        }
    }
}
