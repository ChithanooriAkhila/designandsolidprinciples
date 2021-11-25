class Subject implements Topic{
    Topic t;
    Subject(Topic t){
        this.t=t;
    }
    public void read(){
        t.read();
    }
}
class Maths implements Topic{
    public void read(){
        System.out.println("reading maths.....");
    }
}
class Science implements Topic{
    public void read(){
        System.out.println("reading science.....");
    }
}
public class CouplingEx {
    public static void main(String[] args) {
        Subject sub1=new Subject(new Maths());
        sub1.read();
        Subject sub2=new Subject(new Science());
        sub2.read();
    }
}
interface Topic{
    public void read();
}
