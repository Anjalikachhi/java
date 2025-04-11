public class nonstatic{
    void hello{
        System.out.println("hello");
    }
    public static void main(String[] args) {
        nonstatic obj = new nonstatic();
obj.hello();

    }
}

