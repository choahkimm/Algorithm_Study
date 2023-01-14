package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2476 {
    // 백준 2476. 주사위 게임
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int reward=0, max=0;

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a==b && b==c){
                reward = 10000+ (a*1000);
            }else if(a!=b && b!=c && a!=c){
                reward = Math.max(Math.max(a,b),c) * 100;
            }else {
                if(a==b||a==c){
                    reward =  1000 + (a*100);
                }else {
                    reward = 1000 + (b*100);
                }
            }
            if(reward>max) max=reward;
        }
        System.out.println(max);
    }
}
