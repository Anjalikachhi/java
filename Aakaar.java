class Shape{
    void draw(){
        System.out.println("it has any shape");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("this is circle ");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("this is square");
    }
}



public class Aakaar {
    public static void main(String[] args) {
        Shape obj=new Circle();
        Shape obj1=new Square();
        obj.draw();
        obj1.draw();
    }
}
