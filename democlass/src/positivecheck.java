import java.util.*;
public class positivecheck {
public static void main( String[] args){
    Scanner in=  new  Scanner(System.in);
    System.out.println("enter your number");
    int  a= in.nextInt();
    if (a<0)
    System.out.println("number is negative");
    else if (a>0)
    System.out.println("number is positive");
    else 
    System.out.println("zero");
} 
}

