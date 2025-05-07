class Animal{
    void talk(){
        System.out.println("ye apni apni matrabhasha me baat kerte hai ");
    }
}
class Dog extends Animal {
    void talk(){
        System.out.println("ye bhokta hai  ");
        super.talk();
    }
}
 public class Pashu {
    public static void main(String[] args) {
        Animal obj=new Dog();
        obj.talk();
    }
}
