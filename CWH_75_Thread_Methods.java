/**
 * This Java program creates two custom threads that continuously print messages and demonstrates the
 * usage of thread methods like sleep, join, and setDaemon.
 */

class MyNewThr1 extends Thread {

    // @Override
    // public void run() {
    //     int i=0;
    //     while (true) {
    //         // System.out.println("I am a thread");
    //         System.out.println("Thank You");
    //         try {
    //             Thread.sleep(455);  // Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.
    //         } catch (InterruptedException e) {
    //             e.printStackTrace();
    //         }
    //         i++;
    //     }

    // }

}

class MyNewThr2 extends Thread {

    @Override
    public void run() {
        while (true) {
            // System.out.println("I am a thread");
            System.out.println(" My Thank You");
        }

    }

}

public class CWH_75_Thread_Methods {

    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        // try {
        //     t1.join();  // Waits for this thread to die.
        // }
        // catch (Exception e) {
        //     System.out.println(e);
        // }
        t2.start();
        t2.setDaemon(false);  // Marks this thread as either a daemon thread or a user thread.
    }
}
