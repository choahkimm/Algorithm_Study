package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon15963 {
    // 백준 15963. CASIO
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        if(a==b) System.out.println("1");
        else System.out.println("0");
        // 다만 확인해야할 부분이 N과 M의 범위가
        // 10자리  정수까지 들어올 수 있으니 int의 범위를 넘어서게 됨
    }
}
