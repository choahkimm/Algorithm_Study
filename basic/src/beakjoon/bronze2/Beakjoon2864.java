package beakjoon.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2864 {
    // 백준 2864. 5와 6의 차이
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n1 = st.nextToken();
        String n2 = st.nextToken();

        // n1, n2 한글자씩 쪼개기
        //  5인 경우 : 그대로(최소), 더하기(최대)
        //  6인 경우 : 빼기(최소),  그대로(최대)
        int n1_min = 0;
        int n1_max = 0;
        for(int i=0; i<n1.length(); i++){
            if((n1.charAt(i) == '5')) {
                n1_max += Math.pow(10,n1.length()-1-i); // n1이 최대일 때 더해야 할 값
            }
            else if((n1.charAt(i) == '6')) {
                n1_min += Math.pow(10,n1.length()-1-i); // n1이 최소일 때 빼야할 값
            }
        }

        int n2_min = 0;
        int n2_max = 0;
        for(int i=0; i<n2.length(); i++){
            if((n2.charAt(i) == '5')) {
                n2_max += Math.pow(10,n2.length()-1-i); // n2가 최대일 때 더해야 할 값
            }
            else if((n2.charAt(i) == '6')) {
                n2_min += Math.pow(10,n2.length()-1-i); // n2가 최소일 때 빼야할 값
            }
        }

        int sum = Integer.parseInt(n1)+Integer.parseInt(n2);
        System.out.print(sum-n1_min-n2_min);
        System.out.print(" ");
        System.out.println(sum+n1_max+n2_max);


        // 더 유식한(?) 방법
        /*

        int minSum = Integer.parseInt(n1.replaceAll("6", "5")) + Integer.parseInt(n2.replaceAll("6", "5"));
        int maxSum = Integer.parseInt(n1.replaceAll("5", "6")) + Integer.parseInt(n2.replaceAll("5", "6"));

        System.out.println(minSum);
        System.out.println(maxSum);


         */
    }
}
