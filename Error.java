public class Error {
    public static void main(String[] args) {
        int a=10,b=0;
        try {  int c=a/b;
            System.out.println(c);
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("cannot divide by zero");
        }
        System.out.println("hello jelly");
        System.out.println("hello alisia");
    }
}
