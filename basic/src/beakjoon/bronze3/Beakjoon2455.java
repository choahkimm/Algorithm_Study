package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2455 {
    // 백준 2455. 지능형 기차
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int max=0;
        int cnt=0;
        for(int i=0; i<4; i++){
            st =new StringTokenizer(br.readLine());
            int out = Integer.parseInt(st.nextToken());
            int in = Integer.parseInt(st.nextToken());

            cnt = cnt - out + in;
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
}
