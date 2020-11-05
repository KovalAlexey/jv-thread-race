public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(100);
        MyThread thread = new MyThread(counter);
        MyRunnable runnable = new MyRunnable(counter);
        new Thread(runnable).start();
        thread.start();
    }
}
