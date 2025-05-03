public class book {
    void read(){
       System.out.println("reading"); 
    }
}
class Novel extends book{
    void storyine(){
        System.out.println("the storyline");
    }
    public static void main(String[] args) {
        Novel obj=new Novel();
        obj.storyine();
        obj.read();
    }
}
