public class Expect4 {
    

    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } finally {
            System.out.println("Finally block executed");
        }}}