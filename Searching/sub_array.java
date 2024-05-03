import java.util.*;
public class  sub_array
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
//input 
int Array[] = new int[5];
System.out.println("Enter the Array");
for (int i = 0; i < Array.length; i++) {
    Array[i] = sc.nextInt();
}


//output
System.out.println("Sub array are ");
for (int i = 0; i < Array.length; i++) {
    //strat pos
    int start=i;
    for (int j= i; j < Array.length; j++) {
        //end pos
        int end=j;
                    //print ARRAY
                    for (int k = start; k <=end; k++) {
                       System.out.print(Array[k]+",");
                    }
                    System.out.println();
    }
}

}
}