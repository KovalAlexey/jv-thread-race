import org.apache.log4j.Logger;

public class MyThread extends Thread{
    private Counter counter;
    private static final Logger logger = Logger.getLogger(MyThread.class);

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while(counter.getValue() < 100) {
            counter.increment();
            logger.info("Thread " + Thread.currentThread().getName() + "current value " + counter.getValue());
        }
    }
}
