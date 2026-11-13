public class SharedEngine {
    private int state;

    public SharedEngine(int seed) {
        this.state = seed;
    }

    public int resolve(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 64) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        SharedEngine obj = new SharedEngine(64);
        System.out.println(obj.resolve(64));
    }
}
