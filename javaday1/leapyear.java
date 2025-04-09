package javaday1;

public class leapyear {
    public static void main(String[] args) {
        int year =2015;
 if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
    System.out.println(" entered year is Leap year");
 else
    System.out.println(" entered year is not a leap year");
    }
}
