package beakjoon.bronze4;

import java.util.Scanner;

public class Beakjoon25858 {
    // 백준 25858. Divide the Cash
    public static void main(String[] args) {

        // 팀 멤버 / 달러 총액
        // problems a team member has solved

        Scanner sc = new Scanner(System.in);
        int teamMembers = sc.nextInt();
        int dollor = sc.nextInt();

        int [] solvedProblems = new int[teamMembers];
        int problems = 0;

        // 문제 총 수 및 맞춘 문제 저장
        for(int i=0; i<teamMembers; i++){
            solvedProblems[i] = sc.nextInt();
            problems += solvedProblems[i];
        }

        // 상금 계산
        for(int i=0; i<teamMembers; i++) {
            System.out.println(dollor / problems * solvedProblems[i]);
        }
    }
}
