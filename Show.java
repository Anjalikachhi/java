interface A{
    void Display();
}
interface B {
    void Display();
}
class Demo implements A,B{
   public void Display (){
       System.out.println("displaying"); 
    }

}
public class Show {
    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.Display();
        
    }
}
