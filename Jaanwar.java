abstract class Animal{
abstract void sound(int a);
void  eat(){
    System.out.println("Animal eat food");
}
}
class Dog extends Animal{
    void sound(int a){
        System.out.println("boou boou" + a);
    }
}
class Cat extends Animal{
    void sound( int b){
        System.out.println("meow meow"+b);
    }
}



public class Jaanwar {
    public static void main(String[] args) {
        Animal obj=new Dog();
        obj.sound(2);
        Animal obj1= new Cat();
        obj1.sound(6);
    }
}
