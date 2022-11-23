package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon18408 {
    // 백준 18408. Three Integers
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        StringTokenizer st = new StringTokenizer(n);

        int cnt1=0, cnt2=0;
        for(int i=0; i<3; i++){
            if(st.nextToken().equals("1")) cnt1 ++;
            else cnt2++;
        }

        if(cnt1>cnt2) System.out.println(1);
        else System.out.println(2);
    }
}
