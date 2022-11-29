package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon25591 {
    // 백준 25591. 푸앙이와 종윤이
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        int a = 100 - n1;
        int b = 100 - n2;
        int c = 100 - (a+b);
        int d = a*b;
        int q = d/100;
        int r = d%100;

        System.out.println(a +" " + b +" " + c +" " + d +" " + q +" " + r );
        System.out.println(c+q +" " + r);
    }
}
