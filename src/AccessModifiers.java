class MyEmployee
{
    private int id;
    private String name;

    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }

    public int getID()
    {
        return id;
    }

    public void setId(int i)
    {
        id = i;
    }

}

public class AccessModifiers {
    static void main(String[] args) {
        MyEmployee emp1 = new MyEmployee();
//        emp1.id = 1;   Throws an error due to private access modifier.
        emp1.setName("Marnus");
        System.out.println(emp1.getName());

        emp1.setId(1);
        System.out.println(emp1.getID());








    }
}
