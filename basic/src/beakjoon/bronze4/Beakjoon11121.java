package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon11121 {
    // 백준 11121. Communication Channels
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            if(st.nextToken().equals(st.nextToken())) System.out.println("OK");
            else System.out.println("ERROR");
        }
    }
}
