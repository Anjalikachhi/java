import java.util.ArrayList;
public class Dynamic {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Anjala");
        arr.add("jelly");
        arr.add("jili");
        arr.add("baiyo");
        arr.add(0,"mitthu");//to  add an element in the particular index
        arr.set(1,"bael");//to replace an element
        System.out.println(arr.get(1));//to print particular index value
    }
}
