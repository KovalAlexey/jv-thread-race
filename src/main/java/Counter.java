public class Counter {
    private long value;

    public Counter(long value) {
        this.value = 0;
    }

    public void increment() {
        value++;
    }

    public long getValue() {
        return value;
    }
}
