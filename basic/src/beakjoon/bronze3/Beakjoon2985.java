package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2985 {
    // 백준 2985. 세 수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        String sign1 = "";
        String sign2 = "";

        // C가 답일 때
        if(A + B == C) {
            sign1="+"; sign2="=";
        }else if(A - B == C) {
            sign1="-"; sign2="=";
        }else if(A * B == C) {
            sign1="*"; sign2="=";
        }else if(A / B == C) {
            sign1="/"; sign2="=";
        }
        // A가 답일 때
        else if(A == B + C) {
            sign1="="; sign2="+";
        }else if(A == B - C) {
            sign1="="; sign2="-";
        }else if(A == B * C) {
            sign1="="; sign2="*";
        }else if(A == B / C) {
            sign1="="; sign2="/";
        }
        System.out.println(A + sign1 + B + sign2 + C);
    }
}
