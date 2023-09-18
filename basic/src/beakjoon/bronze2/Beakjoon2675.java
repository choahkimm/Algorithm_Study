package beakjoon.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2675 {
    // 백준 2675. 문자열 반복
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            for(int j=0; j<s.length(); j++){
                char c = s.charAt(j); // j번째 문자 가져오기
                for(int k=0; k<r; k++){
                    sb.append(c);
                }
            }
            System.out.println(sb);
        }
    }
}
