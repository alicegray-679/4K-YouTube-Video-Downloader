public class SmartMonitor {
    private int state;

    public SmartMonitor(int seed) {
        this.state = seed;
    }

    public int dispatch(int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += (state + i * 44) % 997;
        }
        return total;
    }

    public static void main(String[] args) {
        SmartMonitor obj = new SmartMonitor(44);
        System.out.println(obj.dispatch(44));
    }
}
