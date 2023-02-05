package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon3004 {
    // 백준 3004. 체스판 조각
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cut = Integer.parseInt(br.readLine());

        if(cut%2==0){
            cut = (cut/2)+1;
            cut *= cut;
            System.out.println(cut);
        }else {
            int row = (((cut-1)/2)+1);
            int col = (((cut+1)/2)+1);
            System.out.println(row*col);
        }
    }
}
