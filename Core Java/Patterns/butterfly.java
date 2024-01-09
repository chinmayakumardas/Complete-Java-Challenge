import java.util.*;
public class butterfly 
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println(" enter size");
int n=sc.nextInt();
//fot top
for(int i=1;i<=n;i++){
    //left part
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
     //space part
    for(int j=1;j<=2*(n-i);j++){
        System.out.print(" ");
    }
    //for right part
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}


//for bottom
for(int i=n;i>=1;i--){
    //left part
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
     //space part
     int space=2*(n-i);
    for(int j=1;j<=space;j++){
        System.out.print(" ");
    }
    //for right part
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
}
}