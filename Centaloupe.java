

class Vehicle{
    void run(){
        System.out.println("ye runn kerta hai runnnnnnnnn ");
    }
}
class Bike extends Vehicle{
    void run(){
    System.out.println("ye bhi chalti hai  ");
    super.run();
}}
public class Centaloupe {
    public static void main(String[] args) {
        Vehicle obj=new Bike();
obj.run();
    }
}
