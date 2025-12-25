class Employee {
    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.println("My id is " + id);
//        System.out.println("My salary is " + salary);
        System.out.println("My name is " + name);
    }
    public int getSalary()
    {
        return salary;
    }
}

public class Class {
    static void main(String[] args) {
        System.out.println("This is our custom class \n");
        // Instantiating a new employee object
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
//        Setting attributes
        emp1.id = 1;
        emp1.salary = 34000;
        emp1.name = "David";

        emp2.id = 2;
        emp2.salary= 30000;
        emp2.name = "Steven";

//        Print the attributes
        emp1.printDetails();
        System.out.println(emp1.getSalary());
        emp2.printDetails();
        emp2.getSalary();
        System.out.println(emp1.getSalary());


    }

}