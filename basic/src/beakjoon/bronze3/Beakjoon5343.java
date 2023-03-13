package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon5343 {
    // 백준 5343. Parity Bit
    public static void main(String[] args) throws IOException {
        /*
        패리티 비트는 앞의 7비트의 1개의 수가 홀수이면 1로 설정되고,
        앞의 7비트의 1개의 수가 짝수이면 0으로 설정,
        각 행의 패리티 오류 수를 확인하는 작업
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++){
            String s = br.readLine();
            int [] arr = new int[s.length()];
            int sum=0;
            for(int j=0; j<s.length(); j++){
                arr[j] = s.charAt(j);
                sum+=arr[j];
            }
//            sum = arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5]+arr[6];
            if(s.length()>8) System.out.println(3);
            else {
                if(sum%2==0) System.out.println(0);
                else System.out.println(1);
            }
        }
    }
}
