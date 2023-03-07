package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Beakjoon4459 {
    // 백준 4459. Always Follow the Rules inZombieland
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());
        HashMap map = new HashMap();
        for(int i=1; i<=q; i++){
            map.put(i,br.readLine());
        }
        int r = Integer.parseInt(br.readLine());
        for(int j=0; j<r; j++){
            int num = Integer.parseInt(br.readLine());
            String s = (map.get(num)==null)? "No such rule" : String.valueOf(map.get(num));
            System.out.println("Rule "+ num+": "+ s);
        }
    }
}
