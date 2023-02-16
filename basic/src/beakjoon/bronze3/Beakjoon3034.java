package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon3034 {
    // 백준 3034. 앵그리 창영
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        for(int i=0; i<n; i++){
            int length = Integer.parseInt(br.readLine());
            // 성냥이 들어가는 경우 : 가로, 세로, 대각선
            // 대각선의 길이는 피타고라스 정리 이용
            if(length*length <= Math.abs(w*w + h*h)){
                System.out.println("DA");
            }else System.out.println("NE");
        }
    }
}
