package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Beakjoon2501 {
    // 백준 2501. 약수 구하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayList arr = new ArrayList();
        for(int i=1; i<=n; i++){
            int rest = n%i;
            if(rest==0) arr.add(i);
        }
        System.out.println(arr.size()>=k? arr.get(k-1) : "0");
    }
}
