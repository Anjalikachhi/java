class Student {
    private int marks;
    private String name;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    void setMarks(int  marks){
        this.marks=marks;
    }
    int  getMarks(){
        return marks;
    }
}

public class Details {
    public static void main(String[] args) {
        Student obj=new Student();
        obj.setName("Anjali");
      //  obj.getName();
        System.out.println(obj.getName());
        obj.setMarks(23);
       // obj.getMarks();
        System.out.println(obj.getMarks());
    }
}
