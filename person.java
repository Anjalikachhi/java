public class Person {
    void displayName(){
        System.out.println("displaying the name");
    }
}
class Student extends Person{
    void displayclass(){
        System.out.println("displaying class");
    }
}
class Monitor extends Student{
    void checkdiscipline(){
        System.out.println("checking the discipline ");
    }
    public static void main(String[] args) {
        Monitor obj=new Monitor();
        obj.checkdiscipline();
        obj.displayclass();
        obj.displayName();
    }
}