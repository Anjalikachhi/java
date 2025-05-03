public class person {
    void displayName(){
        System.out.println("displaying the name");
    }
}
class student extends person{
    void displayclass(){
        System.out.println("displaying class");
    }
}
class monitor extends student{
    void checkdiscipline(){
        System.out.println("checking the discipline ");
    }
    public static void main(String[] args) {
        monitor obj=new monitor();
        obj.checkdiscipline();
        obj.displayclass();
        obj.displayName();
    }
}