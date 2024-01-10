package Function;

import java.util.Scanner;

public class func1 {
    public static int calculator(int a,int b){
        return a+b;
    }
    public static int change(int a){
        return a=10;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Programmer started \n ++++++++++++++++++++++++\n");
//initialize and call a function
        // System.out.println("enter 2 number");
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // System.out.println(calculator(a,b));


//call by val reference
        int a=sc.nextInt();
        change(45);
        System.out.println(+a);
    }
    
}
