package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon23795 {
    // 백준 23795. 사장님 도박은 재미로 하셔야 합니다
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while(true){
            int a = Integer.parseInt(br.readLine());
            if(a == -1) break;
            sum += a;
        }
        System.out.println(sum);
    }
}
