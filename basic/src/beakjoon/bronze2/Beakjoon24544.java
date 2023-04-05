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

        int [] contents = new int[n];
        int [] submit = new int [n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        int sum2 = 0;

        for(int j=0; j<n; j++){
            contents[j]=Integer.parseInt(st.nextToken());
            sum += contents[j];
        }
        st = new StringTokenizer(br.readLine());

        for(int k=0; k<n; k++){
            submit[k]=Integer.parseInt(st.nextToken());
            if(submit[k] == 0) sum2+=contents[k];
        }

        System.out.println(sum);
        System.out.println(sum2);

    }
}
