package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon3276 {
    // 백준 3276. ICONS
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 1;
        int b = 1;
        while (a*b < n){
            if(a >= b) b++;
            else a++;
        }
        System.out.println(a + " " + b);
//        a=0; b=0;
    }
}

//Brute force 알고리즘
        //- 브루트 포스 알고리즘 = 완전탐색 알고리즘
        //- 가능한 모든 경우의 수를 탐색하면서 요구조건에 충족된 결과만 가져온다
