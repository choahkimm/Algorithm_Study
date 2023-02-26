package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon4880 {
    // 백준 4880. 다음수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            Integer a1 = Integer.parseInt(st.nextToken());
            Integer a2 = Integer.parseInt(st.nextToken());
            Integer a3 = Integer.parseInt(st.nextToken());

            if(a1==0 && a2==0 & a3==0) break;

            if((a2-a1)==(a3-a2)) System.out.println("AP " + (a3+(a3-a2)));
            else if((a2/a1)==(a3/a2)) System.out.println("GP " + (a3*(a3/a2)));
        }
    }
}
