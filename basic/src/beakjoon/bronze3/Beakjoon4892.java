package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon4892 {
    // 백준 4892. 숫자 맞추기 게임
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int cnt =0;
        while (true){
            int n0 = Integer.parseInt(br.readLine());
            if(n0==0) break;

            int n1 = n0*3;
            int n2;

            boolean isEven = (n1%2==0);
            if(isEven) n2=n1/2;
            else n2=(n1+1)/2;

            int n3 = 3*n2;
            int n4 = n3/9;

            cnt++;
            if(isEven) n0=2*n4;
            else n0=2*n4+1;

            System.out.println(isEven? cnt + ". even " + n4 :
                    cnt + ". odd " + n4 );
        }
    }
}
