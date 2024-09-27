
class Phone {

    public void showTime() {
        System.out.println("Time is 8 am");
    }

    public void on() {
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone {

    public void music() {
        System.out.println("Playing music...");
    }

    @Override
    public void on() {
        // super.on();
        System.out.println("Turning on SmartPhone...");
    }

}

public class CWH_49_Dynamic_Method_Dispatch {

    public static void main(String[] args) {
        // Phone obj = new Phone();
        // Smartphone smobj = new Smartphone();
        // obj.name();
        Phone obj = new SmartPhone();  // Allowed
        // SmartPhone obj2 = new Phone();  //Not allowed
        obj.showTime();
        obj.on();
        // obj.music();  // Not allowed if reference is of Phone class
    }
}
