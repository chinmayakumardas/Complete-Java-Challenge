import java.util.*;
public class Searching 
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Array ");
int num[]=new int[5];

for(int i=0;i<num.length;i++){
   num[i]=sc.nextInt();
}
//Lenear search 
System.out.println("Searching progres.................");
for(int i=0;i<num.length;i++){

   System.out.print(num[i]+"Found at index  :  "+i+" ");
} 

//greatest number  search
int greatest=Integer.MIN_VALUE;
int smallest=Integer.MAX_VALUE;
for(int i=0;i<num.length;i++){
   if(greatest<num[i])
      greatest=num[i];
} 
for(int i=0;i<num.length;i++){
   if(smallest>num[i])
      smallest=num[i];
} 
   System.out.print("Gretest number is"+ greatest);
   System.out.print("smallest number is"+smallest);


// for(int i=0;i<num.length;i++){
//    for(int j=i+1;j<num.length;j++){
//       if(num[i]<num[j])
//       smallest=num[j];
//    }
// } 

}
}