
 class pen{
    String color;
    int price;
    void setcolor(String newcolor){
        this.color=newcolor;
    }
    void setprice(int newprice){
        this.price=newprice;
    }
} 

class bank{
    String name;
    int code;
    void setname(String name){
        this.name=name;
    }
    void setcode(int code){
        this.code=code;
    }
    int getcode(){
        return this.code;
    }
    String getname(){
        return this.name;
    }
    bank(int code){
        this.code=code;
    }
    bank(String name){
        this.name=name;
    }
    bank(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
class animal{
    boolean eat=true;
}

class dog extends animal{
    boolean run=true;
    void jump(){
        System.out.println("Dog can be jump");
    }
    
}
class doctor extends dog{
    
    void test(){
        System.out.println("doctor cheka kala");
    }
}
public class oop_march {
    public static void main(String[] args) {
        // pen p1=new pen();
        // p1.setcolor("red");
        // p1.setprice(2000);
        // System.out.println(p1.color+","+p1.price);
        bank b1=new bank( "sbi");
        b1.setcode(100);
        b1.setname("Nayapali sbi");
        System.out.println(b1.getcode());
        System.out.println(b1.getname());
        bank b2=new bank (100,"PNB");
        System.out.println(b2.getname()+","+b2.getcode());
        animal a=new animal();
        dog d=new dog();
        doctor doc=new doctor();
        System.out.println(a.eat);
        System.out.println(d.eat+","+d.run);
        System.out.println(doc.eat+","+doc.run);
        System.out.println();
        System.out.println();
       
    }
}
