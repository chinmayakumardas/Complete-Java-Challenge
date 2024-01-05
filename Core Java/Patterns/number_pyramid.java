//1-n print 
import java.util.*;
public class number_pyramid 
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();

//1-n pattern
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        
        System.out.print(+j);
   
    }
    System.out.println(" ");
}
System.out.println("-----------------------");

//inverted pattern
    for(int i=1;i<=n;i++){
    for(int j=1;j<=n+1-i;j++){
        System.out.print(+j);
    }
    System.out.println(" ");
}
System.out.println("-----------------------");

//1 incremental patter(Floyd triangle)
int num1=1;
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(num1+" ");
        num1++;
    }
    System.out.println("");
}
System.out.println("-----------------------");

//1-0-1 triangle
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        if((i+j)%2==0){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }
    System.out.println("");
}System.out.println("-----------------------");

//1-0-1 reverse triangle
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        if((i+j)%2==0){
            System.out.print("0");
        }else{
            System.out.print("1");
        }
    }
    System.out.println("");
}
System.out.println("-----------------------");

System.out.println("-----------------------");

}
}
