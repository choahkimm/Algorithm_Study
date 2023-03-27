package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beajoon5220 {
    // 백준 5220. Error Detection
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for(int i=0; i<testCase; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());

            int r = 0;
            while (true){
                r+= n%2;
                n= n/2;
                if(n==1) break;
            }
            if((r%2==0 && p==0)||(r%2==1 && p==1)) {
                System.out.println("Corrupt");
            }else System.out.println("Valid");
        }
    }
}
