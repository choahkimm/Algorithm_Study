package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon17362 {
    // 백준 17362. 수학은 체육과목 입니다 2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int remainder = n%8;
        int finger;

        if(remainder==1) finger=1;
        else if(remainder==2 || remainder==0) finger=2;
        else if(remainder==3 || remainder==7) finger=3;
        else if(remainder==4 || remainder==6) finger=4;
        else finger=5;
        System.out.println(finger);
    }
}

