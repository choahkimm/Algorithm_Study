package beakjoon.bronze5;
import java.util.Scanner;

public class Beakjoon25238 {
    // 백준 25238. 기회와 방어율 무시
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a * (100-b) >= 10000){
                System.out.println("0");
            }else System.out.println("1");
        }
}
