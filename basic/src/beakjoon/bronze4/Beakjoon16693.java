package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon16693 {
    // 백준 16693. Pizza Deal
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 슬라이스 피자 크기당 가격
        StringTokenizer st = new StringTokenizer(br.readLine());
        Double a1 = Double.parseDouble(st.nextToken());
        Double p1 = Double.parseDouble(st.nextToken());
        double x = a1/p1;

        // 홀 피자 크기당 가격
        st = new StringTokenizer(br.readLine());
        Double r1 = Double.parseDouble(st.nextToken());
        Double p2 = Double.parseDouble(st.nextToken());
        double y = (Math.PI * r1 * r1) / p2;

        System.out.println(x>y? "Slice of pizza" : "Whole pizza");

    }
}
