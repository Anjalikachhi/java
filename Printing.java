
    interface Shape{
     void  area(double r);
}
class Circle implements Shape{
    public void area( double r){
        System.out.println(3.14*r*r);
    }
}
public class Printing {
    public static void main(String[] args) {
        Circle obj=new Circle();
        obj.area(5);
    }
}


