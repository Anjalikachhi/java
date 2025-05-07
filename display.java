

class area{
    void findarea(int a ){
        System.out.println("area of square"+a*a);
    }
    void findarea(int a,int b){
        System.out.println("area of rectangle"+a*b);
    }
   // void findarea(int a,int b){
    //    System.out.println("area of triangle"+1/2(a*b));
   // }
}
public class display {
    public static void main(String[] args) {
        area obj=new area();
        obj.findarea(3);
      obj.findarea(3,4);
      obj.findarea(3,7);
    }
}
