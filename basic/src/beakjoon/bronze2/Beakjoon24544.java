package beakjoon.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon24544 {
    // 백준 24544. 카카오뷰 큐레이팅 효용성 분석
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            int [] contents = new int[n];
            int [] submit = new int [n];
            int sum = 0;
            int sum2 = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                contents[i]=Integer.parseInt(st.nextToken());
                sum += contents[i];
            }
            st = new StringTokenizer(br.readLine());
            for(int k=0; k<n; k++){
                submit[i]=Integer.parseInt(st.nextToken());
            }

            System.out.println(sum);

            for(int l=0; l<n; l++){
                if(submit[i] == 0) sum2+=contents[i];
            }
            System.out.println(sum2);
        }
    }
}
