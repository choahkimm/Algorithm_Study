package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon14924 {
    // 백준 14924. 폰 노이만과 파리
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        System.out.println((D/(S*2))*T);
    }
}
