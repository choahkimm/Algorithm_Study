package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon10797 {
    // 백준 10797. 10부제
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int [5];
        int cnt = 0;
        for(int i:arr){
            arr[i] = Integer.parseInt(st.nextToken());
            if(n==arr[i]) cnt++;
        }
        System.out.println(cnt);
    }
}
