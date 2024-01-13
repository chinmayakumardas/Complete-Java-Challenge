import java.util.*;
public class practice 
{
    //print at index
    public static void index(int num[]) {
        for(int i=0;i<num.length;i++){
            System.out.println("Index of "+num[i]+"is:"+i);
        }        
    }
    //insert element at specific position
    public static void insertion(int position,int num[]) {
               
    }
    

    public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("start");
// int num[]={11,55,2,7,6};
// index(num);

System.out.println("size of array");
int size=sc.nextInt();
System.out.println("enter Array input");
int arr[]=new int[size];
for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
}
insertion(size,arr);

}
}