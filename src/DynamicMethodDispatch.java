class One{
     public void name(){
         System.out.println("My name is Java");
    }

    public void greet()
    {
        System.out.println("Good Morning!");
    }

    public void music()
    {
        System.out.println("Playing music..");
    }

    public void on()
    {
        System.out.println("Turning on phone...");
    }
}
class Two extends One{
    public void name()
    {
        System.out.println("My name is Java in class two");
    }

    public void greet2()
    {
        System.out.println("Welcome back!");
    }
    public void on()
    {
        System.out.println("Turning on Smartphone...");
    }
}



public class DynamicMethodDispatch {
    static void main(String[] args) {
//        One obj1 = new One();
//        obj1.name();
//        Two obj2 = new Two();
//        obj2.name();

        One obj3 = new Two();
        obj3.greet();
        obj3.name();
        obj3.on();
        obj3.music();



    }
}
