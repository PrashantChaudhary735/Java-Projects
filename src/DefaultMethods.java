interface MyCamera{
    void takeSnap();
    void recordVideo();
    default void record4KVideo()
    {
        System.out.println("Recording in 4k...");
    }
    private void greet()
    {
        System.out.println("Good Morning");
    }


}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{

    void callNumber(int phoneNumber)
    {
        System.out.println("Calling" + phoneNumber);
    }

    void pickCal()
    {
        System.out.println("Connecting..." );
    }
    void takeSnap()
    {
        System.out.println("Taking snap");
    }
}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
       public void takeSnap()
        {
            System.out.println("Taking snap");
        }

        public void recordVideo()
        {
            System.out.println("Recording video...");
        }
        public String[] getNetworks()
        {
            System.out.println("Getting List of Networks");
            String[] networkList = {"Airtel", "JIO", "Vodafone"};
            return networkList;
        }

        public void connectToNetwork(String network)
        {
            System.out.println("Connecting to " + network);
        }

        public void record4KVideo()
        {
            System.out.println("Recording in 4k through MySmartPhone");
        }


}

public class DefaultMethods {
    static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        String[] ar = ms.getNetworks();
        for(String item: ar)
        {
            System.out.println(item);
        }
        ms.record4KVideo();

    }
}
