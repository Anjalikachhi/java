class Rectangle {
    private int l;
    private int b;
    void setLength(int l){
        this.l=l;
    }
    
    void setBreadth(int b){
        this.b=b;
    }
    int getArea(){
        return l*b;
    }
    int getPerimeter(){
        return 2*(l+b);
    }
}
public class Find {
    public static void main(String[] args) {
        Rectangle obj=new Rectangle();
        obj.setLength(3);
        obj.setBreadth(9);
      //  obj.getArea();
        System.out.println(obj.getArea());
        
       // obj.Perimeter();
        System.out.println(obj.getPerimeter());
    }
}
