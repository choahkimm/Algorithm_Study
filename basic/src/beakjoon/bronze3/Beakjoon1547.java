package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon1547 {
    // 백준 1547. 공
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());

        int [] cup = new int[3]; // 컵 3개
        cup[0]=1;
        cup[1]=2;
        cup[2]=3;

        for(int i=0; i<m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            // index 번호 구하는 거니까 -1
            int x = Integer.parseInt(st.nextToken())-1;
            int y = Integer.parseInt(st.nextToken())-1;
            int temp=0;

            temp = cup[x];
            cup[x] = cup[y];
            cup[y] = temp;
        }
            for(int i=0; i<3; i++){
                if(cup[i] == 1)
                    System.out.println(i+1);
            }
    }
}
