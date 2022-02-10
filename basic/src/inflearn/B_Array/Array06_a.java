package inflearn.B_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array06_a {
    public static boolean isPrime(int num){ // 소수 판별
        if(num==1) return false;
        for(int i=2; i<num; i++){
            if(num%i==0) return false;
        }
        return true;
    }

    public static ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            int tmp=arr[i]; //tmp=153
            int res=0;
            while(tmp>0){ // 숫자 뒤집기
                int t = tmp%10; // t= 3, 5, 1
                res=res*10+t; // res = 3, 30+5, 35*10 +1 = 351
                tmp=tmp/10; // tmp = 15, 1
            }
            if(isPrime(res)) answer.add(res);
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x : solution(n, arr)){
            System.out.print(x+" ");
        }
    }
}
