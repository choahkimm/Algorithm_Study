package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon4299 {
    // 백준 4299. AFC 윔블던
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); // 합
        int b = Integer.parseInt(st.nextToken()); // 차

        // 두 수의 합이 차보다 커야함 , 두
        if(a<b || (a+b)%2!=0) System.out.println(-1);
        else {
            int x = (a+b)/2;
            int y = (a-b)/2;
            System.out.println(x + " "+ y);
        }
//뭔가 잘 안풀렸었음.
    }
}
