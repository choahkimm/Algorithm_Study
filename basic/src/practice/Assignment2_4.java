package practice;

public class Assignment2_4 {
    public static void main(String[] args) {

        for(int i=1; i<5; i++){
            if(i==3) break;
            System.out.println(i);
        }
        System.out.println("fin");
        // output : 1 2 fin


        for(int i=1; i<5; i++){
            if(i==3) continue;
            System.out.println(i);
        }
        System.out.println("fin");
        // output : 1 2 4 fin


    }
}
