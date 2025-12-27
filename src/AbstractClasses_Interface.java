abstract class Base3 {
    public Base3() {
        System.out.println("I am a constructor of base 3");
    }

    public void sayHello() {
        System.out.println("Hello User");
    }

    abstract public void greet();

    abstract public void greet2();

}

class Child1 extends Base3 {
    @Override
    public void greet() {
        System.out.println("Good Morning!");
    }

    @Override
    public void greet2() {
        System.out.println("Good Afternoon!");
    }
}

abstract class Child4 extends Base3 {
    public void th() {
        System.out.println("Just for fun");
    }

}


public class AbstractClasses_Interface {
    static void main(String[] args) {
        Child1 ch = new Child1();
        ch.greet2();
//        Base3 bs = new Base3();
    }
}
