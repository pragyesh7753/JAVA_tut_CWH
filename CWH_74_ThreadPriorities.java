
class MyThr1 extends Thread {

    public MyThr1(String name) {
        super(name);
    }

    @Override
    public void run() {
        // int i = 34;
        while (true) {
            // System.out.println("I am a thread");
            System.out.println("Thank You " + this.getName());
        }

    }

}

public class CWH_74_ThreadPriorities {

    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Pragyesh1");
        MyThr1 t2 = new MyThr1("Pragyesh2");
        MyThr1 t3 = new MyThr1("Pragyesh3");
        MyThr1 t4 = new MyThr1("Pragyesh4");
        MyThr1 t5 = new MyThr1("Pragyesh5 (most important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
