/*
LSP:
Liskov substitution principle:
Use inheritance only when supplies fully can substitute the superclass,
otherwise do not use the inheritance which will violate liskov substitution principle

example :
create a class bird and create another subclass Sparrow and another subclass ostrich.
but class contains the method fly.
if both the subclasses Sparrow and ostrich extends class bird.
There will be no issue regarding the subclass Sparrow because Sparrow can fly.
But in the ostrich class it will not fly but it is a bird.
Here ostrich class violates liskov substitution principle.
so following liskov substitution principle,  create  another class flying bird which extends class Bird.
class but contains a method in four and the flying but contains a method fly.
now create a subclass sparrow which extends class flying bird which already  extended the class   Bird.
create a subclass Ostrich which extends the class Bird which cannot fly.
 */
class Bird{
    public void getInfo(){
        System.out.println("I am a bird");
    }
}
class FlyingBird extends Bird{
    public void fly(){
        System.out.println("I am a flying bird");
    }
}
class Sparrow extends FlyingBird{

}
class Ostrich extends Bird{

}
public class LSPex {
    public static void main(String[] args) {
        Ostrich bird=new Ostrich();
        bird.getInfo();
        Sparrow flyingbird=new Sparrow();
        flyingbird.fly();
    }
}
