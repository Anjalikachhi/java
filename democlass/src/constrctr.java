public class constrctr {
    String firstname="pari";
    int age=30;
    constrctr(){
        System.out.println("hello");
    }
    constrctr(String firstname){
        this();
        System.out.println(firstname);
    }
    constrctr(String firstname,int age){
    this(firstname);
        firstname=firstname;

      age=age;
       System.out.println(firstname+"  "+age); 
    }
}
    class main{
        public static void main(String[] args) {
            constrctr obj=new constrctr("anjali",19);
           // constrctr obj1=new constrctr("saniya",18);
           // System.out.println(obj.firstname);
            // System.out.println(obj.age);
        }
    }

