// Class implementing Runnable
class MyRunnable implements Runnable {
    public void run() {
        // Code to be executed in the thread
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        // Create Runnable object
        MyRunnable runnable = new MyRunnable();

        // Create Thread object and pass Runnable
        Thread t = new Thread(runnable);

        // Start the thread
        t.start();
    }
}
