import java.util.ArrayList;
import java.util.Collections;
public class Try {
    public static void main(String[] args) {
       // int[] arr={1,-2,3,4,-5,0};
       ArrayList<Integer> arr=new ArrayList<>();
       arr.add(-4);
       arr.add(6);
       arr.add(8);
       arr.add(-7);
       arr.add(0);
       arr.add(-8);
       arr.add(2);
       Collections.sort(arr);
       System.out.println(arr);
       int c=0;
       for(int n:arr){
        if(n>0){
            c=c+n;
        }
        
       }
       System.out.println(c); 
       
      //  arr.remove(0);
       // arr.remove(0);
      //  arr.remove(0);
     //   arr.remove(0);
     //   System.out.println(arr);
      //  arr.add()
    }
}
