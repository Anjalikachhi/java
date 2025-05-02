public class mergearr {
    
public static void main(String[] args) {
    int[] arr={1,2,3,4};
    int[] arr1={2,3,4,5};
    int[] m=new int[arr.length+arr1.length];
    for(int i=0;i<arr.length;i++){
        m[i]=arr[i];
    }
    for(int j=0;j<arr.length;j++){
        m[arr.length+j]=arr1[j];
    }
    for(int k=0;k<arr.length;k++){

        System.out.println(m[i]);
    }
}}