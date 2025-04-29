public class reversestr {
    public static void main(String[] args) {
        String str="hello";
        String rev="";
        for(int i=0;i<str.length();i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev);
        if(str.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not");
        }
    }
}
