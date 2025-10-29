class employ {
    int id;
    String name;
    int salary;

    public void printdetail() {
        System.out.println("My id is :" + id);
        System.out.println("My Name is: " + name);
        System.out.println("Salary is :" + salary);
    }
}

public class oop {
    public static void main(String[] args) {
        employ detail = new employ();
        employ detail2 = new employ();
        // seting atributes for detail'
        detail.id = 11242334;
        detail.name = "Ashik";
        detail.salary = 34000;
        detail.printdetail();
        // setting Attributes for detail2;
        detail2.id = 6368842;
        detail2.name = "Rahul";
        detail2.salary = 30000;
        detail2.printdetail();

    }

}
