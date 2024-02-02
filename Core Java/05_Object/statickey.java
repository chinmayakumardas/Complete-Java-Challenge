import java.util.*;
public class statickey 
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
branch b1=new branch("MCA");
branch b2=new branch("MBA");
System.out.println("seats in "+b1.branchname+"-"+b1.seats);
System.out.println("seats in "+b2.branchname+"-"+b2.seats);
}
}
class branch{
    //static example
    static int seats=60;
    int branchno;
    String branchname;
    branch(int branchno){
        this.branchno=branchno;
    }
    branch(String branchname){
        this.branchname=branchname;
    }
}