
class Practice13 extends Thread {

    @Override
    public void run() {
        // while (true) {
        //     try {
        //         Practice13.sleep(200);
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        //     System.out.println("Good Morning");
        // }

    }
}

class Practice13b extends Thread {

    @Override
    public void run() {
        // while (true) {
        //     System.out.println("Welcome");
        // }

    }
}

public class CWH_76_Practice_Set13 {

    public static void main(String[] args) {
        Practice13 t1 = new Practice13();
        Practice13b t2 = new Practice13b();
        t1.start();
        t1.setPriority(6);
        t2.setPriority(9);
        System.out.println(t2.getPriority());
        System.out.println(t1.getPriority());
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread().getState());
        t2.start();
    }
}
