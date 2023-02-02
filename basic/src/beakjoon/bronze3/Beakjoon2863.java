package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2863 {
    // 백준 2863. 이게 분수?
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        double c = Double.parseDouble(st.nextToken());
        double d = Double.parseDouble(st.nextToken());

        double [] arr = new double[]{(a/c+b/d), (c/d+a/b), (d/b+c/a), (b/a+d/c)};
        double max = 0;
        int n=0;

        for(int i=0; i<4; i++){
            if(max<arr[i]) {
                max = arr[i];
                n = i;
            }
        }
        System.out.println(n);

    }
}
