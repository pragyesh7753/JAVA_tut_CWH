
class myThread extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("My Thread is running");
            System.out.println("I am happy!");
        }
    }
    
}

class myThread1 extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("My Cooking Thread is running");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class myThread2 extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Thread2 for chatting with her");
            System.out.println("I am sad!");
            i++;
        }
    }
}

public class CWH_70_ThreadClass {

    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
    }
}
