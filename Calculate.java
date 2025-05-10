class Temperature{
    private  int celsius;
     void setTemperatue( int celsius){
        this.celsius=celsius;

    }
     double getTemperatue(){
        return celsius *1.8+32;
    }
}
public class Calculate {
    public static void main(String[] args) {
        Temperature obj=new Temperature();
        obj.setTemperatue(7);
        obj.getTemperatue();
        System.out.println( obj.getTemperatue());
    }
}
