package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon5543 {
    // 백준 5543. 상근날드
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int coke = Integer.parseInt(br.readLine());
        int sprite = Integer.parseInt(br.readLine());

        System.out.println(Math.min(Math.min(a,b),c) + Math.min(coke,sprite)-50);
    }
}
