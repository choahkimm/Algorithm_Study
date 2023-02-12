package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon4153 {
    // 백준 4153. 직각삼각형
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a==0 && b==0 && c==0) break;

            int lengths [] = new int[]{a,b,c};
            Arrays.sort(lengths);
            if(lengths[2]*lengths[2]== lengths[0]*lengths[0] + lengths[1]*lengths[1])
                System.out.println("right");
            else System.out.println("wrong");
        }
    }
}
