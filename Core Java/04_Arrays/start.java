import java.util.*;
public class start 
{
    //sum function
    public static int add(int a,int b){
        return (a+b);
    }
    //average function
    public static int avg(int num[]) {
        
        int sum=0;
        for (int i=0;i<num.length;i++){
            sum+=num[i];
        }
        return (sum/num.length);
    }
    //

    public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("start");

int func=add(12,13);

int num[]=new int[5];
for (int i=0;i<num.length;i++){
    num[i]=sc.nextInt();
}

System.out.println(avg(num));
}
}