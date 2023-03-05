package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon5217 {
    // 백준 5217. 쌍의 합
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            String s = "";
            for(int j=1; j<=n/2; j++){
                    int a= j;
                    int b= n-j;
                    if(a!=b){
                        s+= (b-a>n/2)? " "+a+" "+b+"," : " "+a+" "+b;
                    }
            }
            System.out.println("Paris for " + n +":" + s );
        }
    }
}
