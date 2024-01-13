import java.util.*;
public class diamond 
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter size");
int n=sc.nextInt();
//top
for(int i=1;i<=n;i++){
    //space
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
    //* 
    for(int j=1;j<=(2*i-1);j++){
        System.out.print("*");
    }
    System.out.println();
}
//bottom
for(int i=n;i>=1;i--){
    //space
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
    //* 
    for(int j=1;j<=(2*i-1);j++){
        System.out.print("*");
    }
    System.out.println();
}

}
}