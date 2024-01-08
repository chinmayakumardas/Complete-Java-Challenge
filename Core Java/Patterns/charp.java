import java.util.*;
public class charp
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
 System.out.println("enter a number");
 int n=sc.nextInt();
char ch='A';
//outer loop
 for(int i=1;i<=n;i++){
    //innor loop
    for(int j=1;j<=i;j++){
        System.out.print(ch);
        ch++;
    }
    System.out.println("");
 }
}
}