package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon11365 {
    // 백준 11365. !밀비 급일
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true){
           String str = br.readLine();
           if(str.equals("END")) break;
           sb = new StringBuilder(str);
           System.out.println(sb.reverse());
        }
    }
}