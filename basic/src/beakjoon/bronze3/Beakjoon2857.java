package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2857 {
    // 백준 2857. FBI
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int index = 0;
        for(int i=0; i<5; i++){
            StringTokenizer st =new StringTokenizer(br.readLine());
            if(st.nextToken().contains("FBI")){
                index=i+1;
                System.out.print(index +" ");
            }
        }
        if(index==0) System.out.println("HE GOT AWAY!");
    }
}
