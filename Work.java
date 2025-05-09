 class Employee{
   private int id;
   private int salary;
   private   String name; 
   void getId(int id){
this.id=id;
   }
   int setId(){
    return id;
   }
   void getSalary(int salary){
    this.salary=salary;
   }
   int setSalary(){
    return salary;
   }
   void getName(String name){
    this.name=name;
   }
   String setName(){
    return name;
   }
 }
public class Work {
    public static void main(String[] args){
        Employee obj=new Employee();
        obj.getId(1);
        obj.setId();
        System.out.println(obj.setId());
        obj.getSalary(100000);
        obj.setSalary();
        System.out.println(obj.setSalary());
        obj.getName("Anjali");
        obj.setName();
        System.out.println(obj.setName());
    }
}
