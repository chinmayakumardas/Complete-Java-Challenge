import java.util.Scanner;

public class D_Arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array values");
        //int arr[][]=new int[3][3];
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        int arr[][]={{11,20,30},{40,50,60},{70,80,90}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        
    }
}
