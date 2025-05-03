public class employee {
    void work(){
        System.out.println("work");
    }
}
class manager extends employee{
    void attendmeeting(){
        System.out.println("attendmeeting");
    }
    public static void main(String[] args) {
        manager obj=new manager();
        obj.work();
    }
}
