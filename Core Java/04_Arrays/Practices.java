import java.util.Scanner;

public class Practices 
{
public static void main(String[]args)
{
   Scanner sc=new Scanner(System.in);
//creation
   int num[]=new int[5];
   int nums[]=new int[4];
   nums[0]=1;
   nums[1]=2;
   System.out.println(nums[0+1]);

//Read
System.out.println("Enter the array");
for(int i=0;i<num.length;i++){
    num[i]=sc.nextInt();
}   

//print array
System.out.println("out put is");
for(int i=0;i<num.length;i++){
   System.out.print(num[i]+" ");
} 

//update 
System.out.println("changes is");
for(int i=0;i<num.length;i++){
   if(i%2==0)
   num[i]+=1;
} 
System.out.println("out put is");
for(int i=0;i<num.length;i++){
   System.out.print(num[i]+" ");
} 

//delete
System.out.println("Deleting s");
for(int i=0;i<num.length;i++){
   if(i%2<0)
   num[i]=0;
} 
System.out.println("out put is after delete");
for(int i=0;i<num.length;i++){
   System.out.print(num[i]+" ");
} 
}



}