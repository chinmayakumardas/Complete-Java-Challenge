import java.util.*;
public class Binary_search 
{
     public static int binarysearch(int arr[],int key){
        
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid =(start+end)/2;
            if(arr[mid]==key)
            {
                System.out.print("Key matched  at index :");
                return mid;
            }
            if(key>mid){
                start=mid+1;
            }else{
                end =mid-1;
            }
        }
        return -1;
    }


    public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);

        System.out.println("enter array of size ?");
        int  size=sc.nextInt();
         System.out.println("enter array value");
         int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the key ?");
        int key=sc.nextInt();
    System.out.println(binarysearch(arr,key));
 

}
}