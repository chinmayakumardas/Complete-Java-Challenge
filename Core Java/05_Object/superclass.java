import java.util.*;
class A{
   int a=5;
}
class  B extends A{
    int a=20;
    void show(){
        System.out.println(a);
        System.out.println(super.a);
    }
    
}
public class superclass 
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
    B b1=new B();
    b1.show();

}
}