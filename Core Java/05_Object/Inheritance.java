import java.util.*;
class class1{
     String name="Ajju";
}
class class2 extends class1{
     String Address="BBSr";
}
class class3 extends class2{
    int Age=22;//
}
public class Inheritance 
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
 class1 c1=new class1();
 System.out.println(c1.name);

 class2 c2=new class2();
 System.out.println(c2.name+","+c2.Address);

 class3 c3=new class3();
 System.out.println(c3.name+","+ c3.Age+","+c3.Address);
}
}