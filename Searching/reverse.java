import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Array[] = new int[5];
        System.out.println("Enter the Array");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }

        int n=Array.length;
        for(int i=0;i<n;i++){
            int temp=Array[i];
            Array[i]=Array[n-1];
            Array[n-1]=temp;

            n--;
        }
        System.out.println("Reverse  Array is ---");
        for(int i=0;i<Array.length;i++){
            System.out.print(Array[i]+" ");
        }

    }
}