package practice;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Assignment2_7 {
    public static void main(String[] args) {
        // Write a program to find and print
        // the maximum element in the array down below
        int[] arr = {2,6,1,4,8,-1,3,3,-10,-23,21,23,-2,0,1};

        System.out.println(way1(arr));
        System.out.println(way2(arr));

    }

    public static int way1(int[] arr){
        int maxNum = arr[0];
        for(int i : arr){
            if(i > maxNum) maxNum=i;
        }
        return maxNum;
    }

    public static int way2(int[] arr){
        IntStream intStream = Arrays.stream(arr);
        OptionalInt optionalInt = intStream.max();
        int max = optionalInt.getAsInt();
        return max;
    }
}
