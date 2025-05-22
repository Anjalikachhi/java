public class except2 {
    public static void main(String[] args) {
       try {
        String str = null;
        System.out.println(str.length());
       } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
       } 
       System.out.println("hello");
    }}
