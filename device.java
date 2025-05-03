public class device {
    void powerOn(){
        System.out.println("powering on the device");
    }
}
class laptop extends device{
    void boot(){
        System.out.println("booting ");
    }
}
class Gaming extends laptop{
    void Startgame()
    {
        System.out.println("Starting the game");
    }
    public static void main(String[] args) {
        Gaming obj=new Gaming();
        obj.Startgame();
        obj.boot();
    }
}
