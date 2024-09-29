/**
 * The Java program defines interfaces for a camera and Wi-Fi functionality, along with classes for a
 * cellphone and smartphone that implement these interfaces, showcasing the use of default and private
 * methods in interfaces.
 */

interface MyCamera {

    void takeSnap();

    void recordVideo();

    private void greet() {  // Private method in interface is used to provide a default implementation of the method. It has a private keyword and have a body. It is added in Java from Java 9 to ensure that the interface can have a default implementation of the method without affecting the classes that implement the interface. it can be used only within the interface.
        System.out.println("Good Morning");
    }

    default void record4KVideo() {  // Default method in interface is used to provide a default implementation of the method. It has a default keyword and have a body. It is added in Java from Java 8 to ensure backward compatibility while updating an interface.
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi {

    String[] getNetworks();

    void connectToNetwork(String network);
}

class MyCellPhone {

    void callNumber(long phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }

}

class MySmartphone extends MyCellPhone implements MyWifi, MyCamera {

    @Override
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Taking video");
    }

    @Override
    public void record4KVideo() {  // Can be overridden or not
        System.out.println("Taking snap and recording in 4k");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = {"Pragyesh", "Prashanth", "Anjali5G"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }

}

public class CWH_57_Default_Methods {

    public static void main(String[] args) {
        MySmartphone ms = new MySmartphone();
        ms.record4KVideo(); // This will call the default method
        String[] ar = ms.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }
        ms.connectToNetwork("Pragyesh");
        ms.takeSnap();
        ms.recordVideo();
        ms.callNumber(7753847898L);
        // ms.greet();  // This will give an error as greet() is a private method in MyCamera interface
        ms.pickCall();
    }
}
