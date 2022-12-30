package beakjoon;

import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        /*

        *****
        ****
        ***
        **
        *

         */
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        /*

         *****
          ****
           ***
            **
             *

         */
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=n; k>i; k-- ){
                System.out.print("*");
            }
            System.out.println();
        }

        /*

             *
            ***
           *****
          *******
         *********

         */
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<(i*2)+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
