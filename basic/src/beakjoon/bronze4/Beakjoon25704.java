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

    int minP = p;
    switch (n/5) { // n 입력은 6까지니까
            case 1 : minP = Math.min(minP, p-500); break;
            case 2 : minP = Math.min(p-500, (int)(p*0.9)); break;
            case 3 : minP = Math.min((int)(p*0.9), p-2000); break;
            case 4 : minP = Math.min(p-2000, (int)(p*0.75)); break;
            case 5 : minP = Math.min(p-2000, (int)(p*0.75)); break;
            case 6 : minP = Math.min(p-2000, (int)(p*0.75)); break;
    }

    System.out.println(minP<0? 0 : minP);
    br.close();
    }
}

// 다른 풀이 참고
// https://nahwasa.com/entry/%EC%9E%90%EB%B0%94-%EB%B0%B1%EC%A4%80-25704-%EC%B6%9C%EC%84%9D-%EC%9D%B4%EB%B2%A4%ED%8A%B8-java


