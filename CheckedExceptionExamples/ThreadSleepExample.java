package CheckedExceptionExamples;

public class ThreadSleepExample {
    public static void main(String[] args) {
        try {
            System.out.println("Going to sleep for 2 seconds...");
            Thread.sleep(2000);
            System.out.println("Woke up!");
        } catch (InterruptedException e) {
            System.out.println("Thread is disturbed");
            System.out.println("Exception occurred because Another thread stopped this thread");
        }
        }
}
