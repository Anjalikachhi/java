public class student {
    int age=3;
    void data()
    {
        System.out.println(this);
    }
    public static void main(String[] args){
        student obj=new student();
        obj.data();
        System.out.println(obj.age);
    }
}
