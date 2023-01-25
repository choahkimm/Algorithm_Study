package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2875 {
    // 백준 2875. 대회 or 인턴
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 여학생 수
        int m = Integer.parseInt(st.nextToken()); // 남학생 수
        int k = Integer.parseInt(st.nextToken()); // 인턴쉽에 참여해야하는 인원

        int cnt =0;

        // m+n>=3+k ==> 남학생 여학생수 합이 하나의 팀과 인턴쉽 명수와 같은지
        while (n>=2 && m>=1 && m+n>=3+k){
            n = n-2;
            m = m-1;
            cnt++; // 팀 개수
        }
        System.out.println(cnt);
    }
}
