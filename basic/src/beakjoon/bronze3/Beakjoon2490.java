package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2490 {
    // 백준 2490. 윷놀이
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String ans = "";
        for(int i=0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int cnt = a+b+c+d;

            if(cnt==4) ans="E";
            else if(cnt==3) ans="A";
            else if(cnt==2) ans="B";
            else if(cnt==1) ans="C";
            else ans="D";

            System.out.println(ans);
        }
    }
}
