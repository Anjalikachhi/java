import java.util.*;
public class factorial {
   static void fact(int a){
    
    int i=1;
    int sum=1;
    while(i<=a){
sum=sum*i;
i++;

    }System.out.println(sum);
    }
    public static void main(String[] args) {Scanner in=  new  Scanner(System.in);
        System.out.println("enter your number");
        int  a= in.nextInt();
         fact(a);
    }
}
