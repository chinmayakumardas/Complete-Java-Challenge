import java.util.*;
public class polymerphism 
{
    //method over load
    public static int  calc(int a,int b){
        return a+b;
    }
    public static double  calc(double a,double b){
        return a+b;
    }

    
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println(calc(5,6));
System.out.println(calc(3.1454555,564.544564546));

overload2 ol2=new overload2();
System.out.println(ol2.calc(1,2));
}
}
class overload{
    //method over ridding
    public static int  calc(int a,int b){
        
        return a+b;
    }
   
}
class overload2 extends overload{
    //method over ridding
    public static int  calc(int a,int b){
        
        return 5+a+b;
    }
   
}