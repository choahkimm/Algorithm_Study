package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2525 {
    // 백준 2525. 오븐 시계
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());

        // 입력 시간과 더하고자 하는 시간을 각각 배열에 입력
        int [] input = {a,b};
        int [] plus = {c/60, c%60};

        int mixA= input[0]+plus[0]; // 시
        int mixB= input[1]+plus[1]; // 분

        int h = mixA;
        int m = mixB % 60;
        if(mixB>=60) { // 분이 60이 넘어갈 때
            h += mixB/60; // 시+분에서 넘어온 시
        }
        System.out.println(h>=24? (h-24 + " " +m) : (h + " " +m));

    }
}

