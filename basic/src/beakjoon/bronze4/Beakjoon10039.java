package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon10039 {
    // 백준 10039. 평균 점수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        for(int i=0; i<5; i++){
            int score = Integer.parseInt(br.readLine());
            sum += score<40? 40: score;
        }
        System.out.println(sum/5);
    }
}
