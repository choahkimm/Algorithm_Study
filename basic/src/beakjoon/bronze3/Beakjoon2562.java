package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Beakjoon2562 {
    // 백준 2562. 최댓값
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        Map<Integer,Integer> map = new HashMap();
        for(int i=0; i<9; i++){
            map.put(Integer.parseInt(br.readLine()),i);
        }
        int maxKey = Collections.max(map.keySet());
        System.out.println(maxKey);
        System.out.println(map.get(maxKey)+1);

        /*
        		int max_data = 0;
		int max_at = 0;
		for(int i = 0; i < 9; i++) {
			int now_data = Integer.parseInt(br.readLine());
			if (max_data < now_data) {
				max_data = now_data;
				max_at = i;
			}
		}
		System.out.println(max_data);
		System.out.println(max_at + 1);

         */
    }
}
