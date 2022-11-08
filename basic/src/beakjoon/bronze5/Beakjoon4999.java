package beakjoon.bronze5;

import java.util.Scanner;

public class Beakjoon4999 {
    // 백준 4999. 아!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jh = sc.next();
        String dr = sc.next();

        if(jh.length()>=dr.length()) System.out.println("go");
        else System.out.println("no");
    }
        }
