import java.util.Scanner;

public class spiral_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  array");
        int arr[][] = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // System.out.println("spiral array is");
        // int start_row=0;
        // int end_row=arr.length-1;
        // int start_col=0;
        // int end_col=arr[0].length-1;
        // while(start_row <= end_row && start_col <= end_col){
        //     //top print
        //     for(int i=start_col;i<=end_col;i++){
        //         System.out.print(arr[start_row][i]+" ");
        //     }

        //     //right
        //     for(int i=start_row+1;i<=end_row;i++){
        //         System.out.print(arr[i][end_col]+" ");
        //     }
        //     //bootom
        //     for(int i=end_col-1;i>=start_col;i--){
        //         System.out.print(arr[end_row][i]+" ");
        //     }
        //      //left
        //      for(int i=end_row-1;i>=start_row+1;i--){
        //         System.out.print(arr[i][start_row]+" ");
        //     }
        //     start_row++;
        //     end_row--;
        //     start_col++;
        //     end_col--;
        //     System.out.println();
        // }



        //diagonal sum of array
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j ){
                    sum+=arr[i][j];
                }else if(i+j==arr.length-1){
                    sum+=arr[i][j];

                }
            }
        }
        System.out.println(sum);

        
    }
}
