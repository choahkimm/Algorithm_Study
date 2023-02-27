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
            double a = Integer.parseInt(st.nextToken());
            double b = Integer.parseInt(st.nextToken());
            double c = Integer.parseInt(st.nextToken());
            double d = Integer.parseInt(st.nextToken());
            double e = Integer.parseInt(st.nextToken());
            double f = Integer.parseInt(st.nextToken());
            if(a==0 && b==0 && c==0 && d==0 && e==0 && f==0) break;

            double [] arr = {a,b,c,d,e,f};
            Arrays.sort(arr);

            double avg = (arr[1]+arr[2]+arr[3]+arr[4])/4.0;
            if (avg == (int)avg) {
                System.out.println((int)avg);
            } else {
                System.out.println(String.format("%.1f", avg));
            }
        }
    }
}
