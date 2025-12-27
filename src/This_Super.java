class Base2 {
    int a;

    public int getA() {
        return a;
    }

    Base2(int c) {
        this.a = c;
        System.out.println(this.a);
    }

    public int returnOne() {
        return 1;
    }
}

class Derived2 extends Base2 {
    Derived2 (int c)
    {
        super(c);
        System.out.println("I am a construtor of Derived2 class " + c);
    }
}

public class This_Super {
    static void main(String[] args) {
//        Base2 b = new Base2(5);
//        System.out.println(b.a);
//        System.out.println(b.returnOne());
//        System.out.println(b.getA());
            Derived2 d = new Derived2(6);

    }

}
