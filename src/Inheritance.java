class Base {

     int x;

    public int getX() {
        System.out.println("Returning x: ");
        return x;
    }

    public void setX(int x) {
        System.out.println("I am setting X now");
        this.x = x;
    }

    public void printMe() {
        System.out.println("I am a constructor");

    }

}

class Derived extends Base {
   public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritance {
    static void main(String[] args) {

//        Derived obj1 = new Derived();
//        obj1.printMe();
//       obj1.x = 10;
//      obj1.setX(10);
//        System.out.println(obj1.getX());

        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());


    }
}
