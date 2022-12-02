package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon2480 {
    // 백준 2480. 주사위 세 개
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if(a==b && b==c) // 같은 눈 3개
            System.out.println(10000 + a*1000);
        else if(a==b || a==c) // 같은 눈 2개, a
            System.out.println(1000 + a*100);
        else if(b==c) // 같은 눈 2개, b
            System.out.println(1000 + b*100);
        else // 모두 다른 눈
        {
            int [] arr = {a,b,c};
            Arrays.sort(arr);
            System.out.println(arr[2] * 100);
        }

    }
}

//1차 실패 기록
