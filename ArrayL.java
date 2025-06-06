import java.util.ArrayList;
import java.util.stream.*;
public class ArrayL {
    public static void main(String[] args) {
       ArrayList<Integer> list =new ArrayList <> ();
       list.add(4);
       list.add(6);
       list .add(3);
       list.add(2);
       list.add(9);
     //  ArrayList<Integer> data =(ArrayList<Integer>) list.stream().map(a->a*5).collect(Collectors.toList());
            //  ArrayList<Integer> data =(ArrayList<Integer>) list.stream().filter(a->a>6).collect(Collectors.toList());
int sum= list.stream().reduce(0,(a,b)->a+b);
            System.out.println(sum);
    }
}
