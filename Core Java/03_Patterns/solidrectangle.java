import java.util.Scanner;

public class solidrectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int n=sc.nextInt();
//solid square
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
//hollow square
for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( i==0 || i==n || j==0|| j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
