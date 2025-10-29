//problem 1;
class Employ{
    int salary ;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
}
//problem 2;
 class CellPhone{
    public void ringing(){
        System.out.println("Ringiing -----");
    }
public void vibrating(){
    System.out.println("Vibratiing-----");
}



    public static void main(String[] args) {
        //for problem 1
        //Employ detail = new Employ();
        // detail.salary = 350000;
        // detail.setname("Rahul");
        // System.out.println("Salary is :"+ detail.getsalary());
        // System.out.println("Employ name :" +detail.getname());
        //for problem 2;
        CellPhone phone = new CellPhone();
        phone.ringing();
        phone.vibrating();


    }
    
}
