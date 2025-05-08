
    abstract class Shapes {
        abstract void area(int a);
        void draw(){
            System.out.println("drawing done ");
        }
    }
    class Circle extends Shapes{
        void area(int a){
           System.out.println("this is circle"+a); 
        }
    }
    class Rectangle extends Shapes{
        void area(int b){
            System.out.println("this is rectangle  "+b);
        }
    }
       public class Emmaly{
        public static void main(String[] args) {
            Shapes obj=new Circle();
            obj.area(5);
            Shapes onj=new Rectangle();
            onj.area(7);
        }
       }
    

