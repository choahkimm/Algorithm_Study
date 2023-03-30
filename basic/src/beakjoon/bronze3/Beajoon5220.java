package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beajoon5220 {
    // 백준 5220. Error Detection
    private static boolean solveErrorDetection(int n, int p) {
        boolean valid = false;

        /* ------------------- INSERT CODE HERE ---------------------*/
        int r = 0;

        String binaryString = Integer.toBinaryString(n);

        for(char c : binaryString.toCharArray()){
            r += c -'0';
        }

        if((r%2==0 && p==0)||(r%2==1 && p==1)) {
            valid = true;
        }else {
            valid = false;
        }
        /* -------------------- END OF INSERTION --------------------*/

        return valid;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numCases = Integer.parseInt(br.readLine());

        for(int i = 0; i < numCases; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int value = Integer.parseInt(st.nextToken());
            int checkbit = Integer.parseInt(st.nextToken());

            if (solveErrorDetection(value, checkbit)) {
                System.out.println("Valid");
            }
            else {
                System.out.println("Corrupt");
            }
        }
    }
}
