package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Beakjoon11948 {
    // 백준 11948. 과목선택
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        // 4중 3
        int e = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());
        // 2중 1

        int [] arr = new int[]{a, b, c, d};
        Arrays.sort(arr);
        System.out.println(arr[3]+arr[2]+arr[1] + Math.max(e,f));
    }
}
