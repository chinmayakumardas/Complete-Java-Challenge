import java.util.*;

public class pair_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input 
        int Array[] = new int[5];
        System.out.println("Enter the Array");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }



        //process

        //output
        System.out.println("Pairs of the array is");
        for(int i=0;i<Array.length;i++){
            int current=Array[i];
            for(int j=i+1;j<Array.length;j++){
                System.out.print("("+current+","+Array[j]+")");
            }
            System.out.println();
        }
    }
}