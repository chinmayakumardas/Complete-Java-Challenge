import java.util.*;
public class simplearr 
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Size and Input value to start");
int num=sc.nextInt();
int nums[]=new int[num];
// //initializing Array
// int num[]=new int[5];
// int nums[]={1,2,3,4,5,6};
// String s[]={"chinmaya","22","ctc"};

//input an array
for(int i=0;i<nums.length;i++){
    nums[i]=sc.nextInt();
}

//print an array
for(int i=0;i<nums.length;i++){
    System.out.print(+nums[i]+" ");
}




}
}