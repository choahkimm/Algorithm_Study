package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon25704 {
// 백준 25704. 출석 이밴트
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int p = Integer.parseInt(br.readLine());

    int cnt = n/5;
    int minP = p;
    for(int i=1; i<=cnt; i++ ){
        if(i*5>n) break;
        switch (i) {
            case 1 : minP = Math.min(minP,p-500); break;
            case 2 : minP = Math.min(minP, (int)(p*0.9)); break;
            case 3 : minP = Math.min(minP, p-2000); break;
            case 4 : minP = Math.min(minP, (int)(p*0.75)); break;
        }
    }

    System.out.println(minP<0? 0 : minP);
    br.close();
    }
}

// 다른 사람 참고해서 푼 문제
// https://nahwasa.com/entry/%EC%9E%90%EB%B0%94-%EB%B0%B1%EC%A4%80-25704-%EC%B6%9C%EC%84%9D-%EC%9D%B4%EB%B2%A4%ED%8A%B8-java


