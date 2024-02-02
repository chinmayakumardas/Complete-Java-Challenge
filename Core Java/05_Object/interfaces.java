interface chessplayer{
   void moves();
}

class queen implements chessplayer{
    public void moves(){
        System.out.println("UP,Down,Left,Right");
    }
}
class rook implements chessplayer{
    public void moves(){
        System.out.println("UP,Down,Left,Right but exception");
    }
}
class king implements chessplayer{
    public void moves(){
        System.out.println("UP,Down,Left,Right no restrictions");
    }
}

public class  interfaces 
{
public static void main(String[]args)
{


queen q1=new queen();
q1.moves();
king k =new king();
k.moves();
rook  r1=new rook();
r1.moves();
}
} 
