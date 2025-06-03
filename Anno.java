
class MyThread extends  Thread{
    public void run(){
        System.out.println("hello");
        try{
            Thread.sleep(4000);
        }catch(Exception e){
            System.out.println("hiii");
        }
    }
        
    
}
class Anno{
    public static void main(String[] args) {
       MyThread t1=new MyThread();
       MyThread t2=new MyThread();
       t1.start();
       t2.start();


    }
}