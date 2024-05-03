import java.util.*;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int Array[]=new int[6];
        System.out.println("Enter the Array");
        for(int i=0;i<Array.length;i++){
            Array[i]=sc.nextInt();
        }

        System.out.println("Input Array is ---");
        for(int i=0;i<Array.length;i++){
            System.out.print(Array[i]+" ");
        }
        System.out.println("Enter the key to search  ");
        int key=sc.nextInt();

        String search_result="key not found";
        int match_index=-1;
        for(int i=0;i<Array.length;i++){
            if(Array[i]==key){
                match_index=i;
                break;
            }
        }

        System.out.println(match_index<0?search_result:"key found at index "+match_index);
    }
}
