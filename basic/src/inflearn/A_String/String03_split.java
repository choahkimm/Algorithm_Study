package inflearn.A_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String03_split {
    // 내가 이해하기 더 쉬운 방법 - Split()

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis(); //시작하는 시점 계산

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String answer = "";
        for(String s : str.split(" ")){
            if(s.length() > answer.length()){
                answer = s;
            }
        }
        System.out.println(answer);

        long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
        System.out.println( "실행 시간 : " + ( end - start )/1000.0 + "초"); //실행 시간 계산 및 출력

    }
}
