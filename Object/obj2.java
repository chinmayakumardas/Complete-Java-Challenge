import java.util.*;
public class obj2 
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
  //Student s1=new Student( );
Student s2=new Student("chinmaya", 100);
System.out.println(s2.name+","+s2.roll);
}
}
 class Student{
    int roll;
    String name;
    //constructor function
    Student(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    String getname(){
    return this.name;
    }
    int getroll(){
        return this.roll;
    }

}