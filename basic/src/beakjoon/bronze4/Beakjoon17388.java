package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Beakjoon17388 {
    // 백준 17388. 와글와글 숭고한
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(s,"Soongsil");
        map.put(k,"Korea");
        map.put(h,"Hanyang");

        if (s+k+h >= 100) {
            System.out.println("OK");
        }else{
            System.out.println(map.get(Math.min(Math.min(s,k), h)));
        }
    }
}
