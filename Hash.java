import java.util.HashMap;
public class Hash {
    public static void main(String[] args) {
      HashMap<String,Integer> map=new HashMap<>();
map.put("Anjali",1);
map.put("ankush",2);
map.put("Gayatri",3);
map.put("Prakash",4);
System.out.println(map.getOrDefault("Anjali", null));
System.out.println(map.keySet());
System.out.println(map.values());
map.forEach((key ,value) ->{
System.out.println(key + value);
});
//int arr={3,21,4,4,67,87,64};
//HashSet<Integer> set=new HashSet();
//Treeset<Integer> set =new Treeset();
//for(int i:arr){


//}
    }
}
