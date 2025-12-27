interface Bicycle
{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle
{
    int b = 45;
    void blowHornK3g();
    void blogHornmhn();

}

class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn()
    {
        System.out.println("Horn++++");
    }

    public void applyBrake(int decrement)
    {
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment)
    {
        System.out.println("Applying SpeedUp");
    }

    public void blowHornK3g()
    {
        System.out.println("Applying Horn1");
    }
    public void blogHornmhn()
    {
        System.out.println("Applying Horn2");
    }

}

public class Interface {
    static void main(String[] args) {
        AvonCycle cycle1 = new AvonCycle();
        cycle1.applyBrake(5);
        System.out.println(cycle1.a);

//        You cannot modify teh properites in interfaces as they are final
//        cycle1.a = 54;


    }
}
