package beakjoon.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon10821 {
    // 백준 10821. 정수의 개수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, ",");

        int count = 0;
        while (st.hasMoreTokens()) {
            st.nextToken();
            count++;
        }
        System.out.println(count);
    }
}

// 그냥 , 단위로 끊어서 토큰의 개수를 구해봄
