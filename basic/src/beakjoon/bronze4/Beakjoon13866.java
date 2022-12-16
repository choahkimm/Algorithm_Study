package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon13866 {
    // 백준 13866. 팀 나누기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        int c= Integer.parseInt(st.nextToken());
        int d= Integer.parseInt(st.nextToken());

        int way1 = Math.abs((a+b)-(c+d));
        int way2 = Math.abs((a+c)-(b+d));
        int way3 = Math.abs((a+d)-(b+c));
        System.out.println(Math.min(Math.min(way1,way2),way3));
    }
}
