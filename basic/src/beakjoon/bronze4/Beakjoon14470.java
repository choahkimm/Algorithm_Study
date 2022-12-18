package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon14470 {
    // 백준 14470. 전자레인지
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine()); // 원래 고기 온도
        int b = Integer.parseInt(br.readLine()); // 목표 온도
        int c = Integer.parseInt(br.readLine()); // 언 고기 ->  1도 데우는 시간
        int d = Integer.parseInt(br.readLine()); // 언 고기 -> 해동 시간
        int e = Integer.parseInt(br.readLine()); // 얼지 않은 고기 -> 1도 데우는 시간
        // 고기가 b도까지 데워지는 데 몇 초?

        if(a<0) System.out.println(Math.abs(a)*c + d + b*e); // 얼어있는
        else if(a==0) System.out.println(d); // 0도
        else System.out.println((b-a)*e); // 상온
    }
}
