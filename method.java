// method overloading
class parent{
    void sum(int a){
        System.out.println(" mai hun don"+a);
    }
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
}



public class method {
    public static void main(String[] args) {
        parent obj=new parent();
        obj.sum(47);
        obj.sum(76,67);
        obj.sum(34,45,56);
    }
}
