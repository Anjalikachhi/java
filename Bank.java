class Atm{
    private int balance;
    void getmoney(int balance){
        this.balance=balance;
    } int setmoney(){
        return balance;
    }
}


public class Bank {
    public static void main(String[] args) {
        Atm obj=new Atm();
        obj.getmoney(4800);
        obj.setmoney();
    
        System.out.println(        obj.setmoney());
    }
}
