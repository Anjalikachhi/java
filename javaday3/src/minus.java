public class minus {
    public static void main(String[] args) {
        int a=234;
        int s=a%10;
        a=a/10;
        while(a>0){
s= s-a%10;
a=a/10;
        }
        System.out.println(s);
    }
}
