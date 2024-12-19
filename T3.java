class Employee1{
    private int id;
    private String name;
    private double salary;
    public Employee1(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void raiseSalary(double percent){
        if(percent>0){
            double increment=salary*percent/100;
            salary=salary+increment;
            System.out.println("New salary"+salary);
        }
        else{
            System.out.println("Salary"+salary);
        }
    }
    public void getEmpDetails(){
        System.out.println(id+" "+name+" "+salary);
    }

}
public class T3 {
    public static void main(String[] args) {
        Employee1 emp=new Employee1(1,"poorvik",90000);
        emp.getEmpDetails();
        emp.raiseSalary(10);
        emp.getEmpDetails();
    }
}
