class Filedownload{
    public static void file(String file) {
       for(int i=1;i<=5;i++){
        System.out.println(file+ " " + "downloading....."+(i*20)+"%");
        try{
            Thread.sleep(2000);
        } catch(Exception e ){

        }
       }
       System.out.println(file+ "done"); 
    }
}
public class Multi {
    public static void main(String[] args) {
        Filedownload obj=new Filedownload();
       obj.file("file A");
       obj.file("file B");
            

    }
}
