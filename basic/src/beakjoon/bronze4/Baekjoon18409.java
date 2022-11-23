package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon18409 {
    // 백준 18409. Counting Vowels
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        String [] strArr = s.split("");
        int cnt =0;
        for(String st : strArr){
            if(st.equals("a")||st.equals("e")||st.equals("i")||st.equals("o")||st.equals("u")) cnt++;
        }
        System.out.println(cnt);
    }
}
