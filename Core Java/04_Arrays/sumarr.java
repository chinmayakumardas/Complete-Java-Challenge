import java.util.*;
public class sumarr 
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter array");
int size=sc.nextInt();
int num[]=new int[size];
int sum=0;
for(int i=0;i<num.length;i++){
    num[i]=sc.nextInt();

}
for(int i=0;i<num.length;i++){
    sum+=num[i];

}
System.out.println("sum is="+sum);

}
}