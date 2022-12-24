package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon4589 {
    // 백준 4589. Gnome Sequencing
    // 오름차순이거나, 내림차순이거나
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println("Gnomes:");
        for(int i=0; i<n; i++){
            StringTokenizer st =new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if((a>b && b>c) || ((a<b) && (b<c)))
                System.out.println("Ordered");
            else System.out.println("Unordered");
         }
    }
}