package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2506 {
    // 백준 2506. 점수계산
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int score = 0;
        int answer= 0;

        for(int i=0; i<n; i++){
            int s = Integer.parseInt(st.nextToken());
            if(s == 1){
                score++;
                answer += score;
            }else {
                // 문제를 틀렸다. score 리셋
                score=0;
            }
        }
        System.out.println(answer);
    }
}
