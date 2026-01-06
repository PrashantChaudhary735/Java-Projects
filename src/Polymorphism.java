interface MyCamera2 {
    void takeSnap();

    void recordVideo();

    default void record4KVideo() {
        System.out.println("Recording in 4k...");
    }

    private void greet() {
        System.out.println("Good Morning");
    }


}

interface MyWifi2 {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class MyCellPhone2 {

    void callNumber(int phoneNumber) {
        System.out.println("Calling" + phoneNumber);
    }

    void pickCal() {
        System.out.println("Connecting...");
    }

    void takeSnap() {
        System.out.println("Taking snap");
    }
}

class MySmartPhone2 extends MyCellPhone implements MyWifi2, MyCamera2 {
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordVideo() {
        System.out.println("Recording video...");
    }

    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = {"Airtel", "JIO", "Vodafone"};
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }

    public void record4KVideo() {
        System.out.println("Recording in 4k through MySmartPhone");
    }


}


public class Polymorphism {
    static void main(String[] args) {
        MyCamera2 cam1 = new MySmartPhone2();
//        cam1.getNetworks(); -- This is not allowed
            cam1.record4KVideo();


    }
}
