public class pallindrome {
    public static void main(String[] args) {
        int a=232;
        int original=a;
        int res=0;
        while(a>0)
        {
            
            res=res*10+a%10;
            a=a/10;
        }
        if(original==res){
            System.out.println("pallindrome");
        }
        else{
            System.out.println("not pallindome");
        }
    }
}
