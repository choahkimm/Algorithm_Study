package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon3009 {
    // 백준 3009. 네 번째 점
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        int [] xArr = new int[3];
        int [] yArr = new int[3];

        // x, y 값들을 따로 저장, 짝을 이루지 않은 수를 찾는다.
        for(int i=0; i<3; i++){
            st = new StringTokenizer(br.readLine());
            xArr[i] = Integer.parseInt(st.nextToken());
            yArr[i] = Integer.parseInt(st.nextToken());
        }

        // x 좌표
        if(xArr[0]==xArr[1])
            System.out.print(xArr[2]+" ");
        else if(xArr[0]==xArr[2])
            System.out.print(xArr[1]+" ");
        else
            System.out.print(xArr[0]+" ");

        // y 좌표
        if(yArr[0]==yArr[1])
            System.out.print(yArr[2]);
        else if(yArr[0]==yArr[2])
            System.out.print(yArr[1]);
        else
            System.out.print(yArr[0]);
    }
}
