package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2566 {
    // 백준 2566. 최댓값
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [][] table = new int[9][9];

        int max =0, x=0, y=0;
        for(int i=0; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++){
                table[i][j] = Integer.parseInt(st.nextToken());
                if(table[i][j] >max){
                    max= table[i][j];
                    x=i;
                    y=j;
                }
            }
        }
        System.out.println(max);
        System.out.println((x+1) + " " + (y+1));

        // 기억 !
        // 배열에 모든 수를 다 담을 필요는 없다.
    }
}
