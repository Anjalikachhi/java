interface Animal{
    void makesound();
}
class Dog implements Animal{
   public void makesound(){
    System.out.println("Bark");
   } 
}
public class Beagle {
    public static void main(String[] args) {
        Animal obj=new Dog();
        obj.makesound();
    }
}
