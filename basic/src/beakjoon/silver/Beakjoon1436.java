package beakjoon.silver;
import java.io.*;

public class Beakjoon1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int count = 0;
        int number = 0;

        while (true) {
            String numStr = Integer.toString(number);
            if (numStr.contains("666")) {
                count++;
                if (count == n) {
                    bw.write(String.valueOf(number));
                    break;
                }
            }
            number++;
        }

        bw.close();
    }
}
