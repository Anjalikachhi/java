abstract  class Payment {
  abstract void pay(int a);
void success(){
  System.out.println("payment done ");
}
  }  
class Upipayment extends Payment{
    void pay(int a){
System.out.println("PAY VI upi"+a);
    }
}
class Netbanking extends Payment{
  void pay(int b){
    System.out.println("pay via netbanking "+b);
  }
}
 class Bank{
  public static void main(String[] args) {
    
  
Payment obj=new Upipayment();
obj.pay(25000);
obj.success();
Payment obj1=new Netbanking();
obj1.pay(4566);
obj1.success();
}
 }
