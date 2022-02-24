package inflearn.B_Array;

import java.util.Scanner;

public class Array11_a {
    public static int solution(int n, int[][] arr){
        int answer=0, max=0;
        for(int i=1; i<=n; i++){ // 기준 학생
            int cnt=0;
            for(int j=1; j<=n; j++){ // 비교 학생
                for(int k=1; k<=5; k++){ // 학년
                    if(arr[i][k]==arr[j][k]){
                        cnt++;
                        break; //한번 같은 반이면
                    }
                }
            }
            if(cnt>max){
                max=cnt;
                answer=i;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr=new int[n+1][6]; //1번부터 사용하는거니까, 1~5학년이니까
        for(int i=1; i<=n; i++){ // i=학생번호
            for(int j=1; j<=5; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(solution(n, arr));
    }
}
