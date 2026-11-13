public class AsyncMonitor {
    private int state;

    public AsyncMonitor(int seed) {
        this.state = seed;
    }

    public int handle(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 88) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        AsyncMonitor obj = new AsyncMonitor(88);
        System.out.println(obj.handle(88));
    }
}
