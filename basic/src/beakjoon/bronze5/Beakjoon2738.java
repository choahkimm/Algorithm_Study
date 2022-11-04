package beakjoon.bronze5;

import java.util.Scanner;

public class Beakjoon2738 {
    // 백준 2738. 행렬 덧셈
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        // i 0~2 배열1에 담기
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr1[i][j]= sc.nextInt();
            }
        }

        // i 3~5 배열2에 담기
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr2[i][j]= sc.nextInt();
            }
        }

        // 배열1 + 배열2
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr1[i][j] + arr2[i][j] + " ");

                if(j==m-1){
                    System.out.println();
                }
            }
        }

    }
}
