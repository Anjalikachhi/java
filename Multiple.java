interface Client1{
void show();
}
interface Client2{
    void print();

}

public class Multiple implements Client1,Client2 {
    public void show(){
    System.out.println("this is for you sir");
    }
    public void print(){
    System.out.println("lets print something for you sir ");
    }

    public static void main(String[] args){
        Multiple obj=new Multiple();
        obj.show();
        obj.print();
    }
}
