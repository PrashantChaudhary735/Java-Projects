class Base1 {

    Base1()
    {
        System.out.println("I am a base class constructor");
    }

    Base1(int x)
    {
        System.out.println("I am a constructor with value of a as: " + x);
    }
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}
class Derived1 extends Base1{
    int y;

    Derived1()
    {

        System.out.println("I am a derived class constructor");
    }

    Derived1(int x, int y)
    {
        super(5);
        System.out.println("I am an overloaded constructor of Derived with value of x as: " + x + " and  y as: " + y);

    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class ConstructorsInInheritance {
    static void main(String[] args) {

//        Base1 b = new Base1();
        Derived1 d = new Derived1(3,4);

    }
}
