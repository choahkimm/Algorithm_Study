package practice;

public class Assignment2_2 {
    public static void main(String[] args) {
        // print ~100 unsing loop

        // for
        for(int i=1; i<101 ; i++){
            System.out.println(i);
        }

        // while
        int j=0;
        while (j < 100){
            j++;
            System.out.println(j);
        }

        // do while
        int k = 1;
        do{ // an execution statement
            System.out.println(k);
            k++;
        }while (k < 101); // a conditional statement
    }
}
