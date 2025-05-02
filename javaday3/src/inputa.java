import java.util.Scanner;
public class inputa {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter arr size");
        int n=sc.nextInt();
        System.out.println("enter elements");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }for(int j=0;j<arr.length;j++){
            System.out.print(arr[j ]);
        }
    }
}
