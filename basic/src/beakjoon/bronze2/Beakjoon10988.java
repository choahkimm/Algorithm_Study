package beakjoon.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon10988 {
    // 백준 10988. 펠린드롬
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        // 헐.. 그냥 뒤집어봐서 맞는지 확인하면 된다....

        StringBuilder sb = new StringBuilder(s);
        if(s.equals(sb.reverse().toString())){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
