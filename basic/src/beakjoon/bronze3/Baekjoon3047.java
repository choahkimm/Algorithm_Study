package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon3047 {
    // 백준 3047. ABC
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        String n = br.readLine().trim(); // trim() : 공백 제거

        int [] arr = new int[]{a, b, c};
        Arrays.sort(arr);

        String s = "";
        if(n.equals("ABC")) s=arr[0] + " " + arr[1] + " " + arr[2];
        else if(n.equals("ACB")) s = arr[0] + " " + arr[2] + " " + arr[1];
        else if(n.equals("BAC")) s = arr[1] + " " + arr[0] + " " + arr[2];
        else if(n.equals("BCA")) s = arr[1] + " " + arr[2] + " " + arr[0];
        else if(n.equals("CAB")) s = arr[2] + " " + arr[0] + " " + arr[1];
        else if(n.equals("CBA")) s = arr[2] + " " + arr[1] + " " + arr[0];
        System.out.println(s);


        /*

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        String[] ch = br.readLine().split("");
        for (String s : ch) {
            if (s.equals("A"))
                System.out.print(arr[0] + " ");
            if (s.equals("B"))
                System.out.print(arr[1] + " ");
            if (s.equals("C"))
                System.out.print(arr[2] + " ");
        }

         */
    }
}
