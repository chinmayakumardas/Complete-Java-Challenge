import java.util.*;
public class Obj1 
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
bankAcct acct1=new bankAcct();
acct1.setPassword(1234);
System.out.println(acct1.userid+","+acct1.password);

}
}

class bankAcct{
    public String userid="ABC123";
    public int password;
    
    void setPassword(int pass){
        this.password=pass;
    }
    int getpass(){
        return this.password;
    }
    String  getuserId(){
        return this.userid;
    }
}