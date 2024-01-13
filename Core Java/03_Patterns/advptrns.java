import java.util.*;
public class advptrns 
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter size");
int n=sc.nextInt();

//for hollow rectangle
for(int i=1;i<=n;i++){
    //for print
    for(int j=1;j<=n;j++){
        if(i==1 || i== n || j==1 || j==n){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
    }
    System.out.println(" ");
}
}
}