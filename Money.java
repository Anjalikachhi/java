 class Atm {
    private int a;
    void setrupees(int a){
this.a=a;
    }
    int getrupees(){
return a;
    }
}
class Money {
    public static void main(String[] args) {
        Atm obj=new Atm();
        obj.setrupees(3000);
        obj.getrupees();
        System.out.println("Rupees in atm  " + obj.getrupees());
    }
}
