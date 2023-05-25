package beakjoon.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2902 {
    // 백준 2902. KMP는 왜 KMP일까?
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String arr[] = str.split("-");

        for(String s : arr){
            System.out.print(s.substring(0,1));
        }
    }
}
