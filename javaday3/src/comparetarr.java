import java.lang.classfile.attribute.SourceIDAttribute;

public class comparetarr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] arr1={2,3,4,5};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr[i]=arr1[j]){
                    System.out.println("array are equal");
                }else{
                    System.out.println("NOT EQUAL");
                }
                i++;
                }
            }
        }
    }

