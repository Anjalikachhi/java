import java.util.ArrayList;
import java.util.Collections;
public class Arrayyy {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList();
        list.add("Mohit");
        list.add("rahul");
        list.add("Rohit");
        Collections.sort(list,(a,b)->a.compareTo(b));
        System.out.println(list);;


    }
    
}
