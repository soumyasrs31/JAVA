public class Interface {
    public static void main(String[] args) {
        Hook h = new Hook();
        h.moves();

        Bear b = new Bear();
        b.eatGrass();
        b.eatMeat();
    }
}

//by default all methods in interface are public and abstract..
interface ChessBoard{
    void moves();
}

class king implements ChessBoard{
    public void moves(){
        System.out.println("up,down,right,left by one move");
    }
}
class Queen implements ChessBoard{
    public void moves(){
        System.out.println("up, down, right, left, diagonal(in all direction)");
    }
}
class Hook implements ChessBoard{
    public void moves(){
        System.out.println("up, down, right, left");
    }
}

//multiple inheritance...
interface Herbivore{
    void eatGrass();
}

interface Carnivore{
    void eatMeat();
}

class Bear implements Herbivore,Carnivore{
    public void eatGrass(){
        System.out.println("Bear eats grass");
    }
    public void eatMeat(){
        System.out.println("Bear eats Meat");
    }
}
