package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2783 {
    // 백준 2783. 삼각 김밥
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // y그램 당 x원
        double x = Integer.parseInt(st.nextToken());
        double y = Integer.parseInt(st.nextToken());
        double min = x/y;

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            double x1 = Integer.parseInt(st.nextToken());
            double y1 = Integer.parseInt(st.nextToken());
            double val = x1/y1;
            if(min>val) min=val;
        }
        System.out.printf("%.2f", min * 1000);
    }
}
