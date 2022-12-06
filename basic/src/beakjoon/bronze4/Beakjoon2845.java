package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2845 {
    // 백준 2845. 파티가 끝나고 난 뒤
    public static void main(String[] args) throws IOException {
        // 1제곱미터 당 사람 수 L, 장소 넓이 P
        // 각 기사에 실려있는 참가자의 수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int [] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            System.out.print(arr[i] - L*P + " ");
        }
    }
}
