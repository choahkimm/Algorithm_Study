package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon10987 {
    // 백준 10987. 모음의 개수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt =0;
        for(char c : str.toCharArray()){
            if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u')
                cnt++;
        }
        System.out.println(cnt);
    }
}
