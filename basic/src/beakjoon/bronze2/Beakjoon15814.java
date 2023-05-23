package beakjoon.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon15814 {
    // 백준 15814. 야바위 대장
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int t = Integer.parseInt(br.readLine());

        char [] chars = s.toCharArray();
        char temp;

        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
           int a = Integer.parseInt(st.nextToken());
           int b = Integer.parseInt(st.nextToken());
           temp = chars[a];
           chars[a]= chars[b];
           chars[b] = temp;
        }

        for(char c: chars){
            System.out.print(c);
        }
    }
}
