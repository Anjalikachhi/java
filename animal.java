import java.nio.channels.Pipe.SourceChannel;

public class animal {
    void makessound(){
        System.out.println("barking ");
    }
}
class cat extends animal{
    void makesound(){
    System.out.println("meow");
    }
    public static void main(String[] args) {
       cat obj=new cat();
       obj.makessound(); 
    }
}
