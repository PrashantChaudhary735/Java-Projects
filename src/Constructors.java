class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee(String myName, int i)
    {
        id = i;
        name = myName;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getID() {
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }
}

public class Constructors {
    static void main(String[] args) {
        MyMainEmployee emp1 = new MyMainEmployee("Thomas",1);
        MyMainEmployee emp2 = new MyMainEmployee("Roger",2);

//        emp1.setName("Cutting");
//        System.out.println(emp1.getName());
        System.out.println(emp1.getID());
        System.out.println(emp1.getName());

        System.out.println(emp2.getID());
        System.out.println(emp2.getName());








    }

}

