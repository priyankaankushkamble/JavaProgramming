// Class that extends Thread
class MyThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(10000); // Delay of 10000 milliseconds (10 seconds)
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e);
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t = new MyThread(); // Create thread object
        t.start(); // Start the thread
    }
}
