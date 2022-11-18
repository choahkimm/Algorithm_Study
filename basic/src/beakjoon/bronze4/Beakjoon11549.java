package beakjoon.bronze4;

import java.io.IOException;
import java.util.Scanner;

public class Beakjoon11549 {
    // 백준 11549. Identifying tea
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
//        int n = br.read();
        int n = sc.nextInt();
        int[] arrays = new int[5];

        int cnt=0;

        for(int i=0; i<arrays.length; i++){
//            arrays[i] = br.read();
            arrays[i] = sc.nextInt();
            if(arrays[i]==n) cnt++;
        }
        System.out.println(cnt);
    }
    // 왜 BufferedReader로 받으면 틀렸다고 나오는지 모르겠다.
}
