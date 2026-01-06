import org.w3c.dom.ls.LSOutput;

class C1{
    public int x = 5;
    protected int y = 45;
    int z = 6;
    private int a = 78;
    public void meth1() {
        System.out.println(x);
    }


}
class C2 extends C1
{
    int a1 = 45;
    public void meth2()
    {
        System.out.println(a1);
    }
}
public class Modifiers {
    static void main(String[] args) {
    C1 c = new C1();
        System.out.println(c.x);
        System.out.println(c.y);
//        System.out.println(c.a);
        System.out.println(c.z);
        C2 c2 = new C2();
        System.out.println(c2.z);

    }
}
