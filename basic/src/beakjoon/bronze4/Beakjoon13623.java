package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon13623 {
    // 백준 13623. Zero or One
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        String answer="";
        if(a==b && b==c && c==a)
        {
            answer = "*";
        }
        else {
            if(a==b) answer = "C";
            else if(a==c) answer = "B";
            else if(b==c) answer = "A";
        }
        System.out.println(answer);

    }
}
