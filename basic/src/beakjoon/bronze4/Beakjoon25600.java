package beakjoon.bronze4;

import java.util.Arrays;
import java.util.Scanner;

public class Beakjoon25600 {
    // 백준 25600. Triathlon
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int array[] = new int[n];

        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int d = sc.nextInt();
            int g = sc.nextInt();

            int sum = a * (d + g);
            if (a == (d + g)) array[i] = sum * 2;
            else array[i] = sum;
        }

        Arrays.sort(array); // 배열 정렬
        System.out.println(array[array.length-1]);
    }
}
/*
public class Main {
	public static void main(String[] args)throws IOException   {

		Scanner sc = new Scanner(System.in);


		int n = sc.nextInt();

		int a = 0;
		int d = 0;
		int g = 0;
		int compare = 0;
		int total = 0;

		for(int i = 0; i < n ; i++) {
			a = sc.nextInt();

			d = sc.nextInt();

			g = sc.nextInt();



			if(a==(d+g)) {
				compare = 2*(a*(d+g));
			}
			else {
				compare = a*(d+g);
			}

			if(compare> total) {
				total = compare;
			}
		}
		System.out.println(total);
		sc.close();
	}
}
 */