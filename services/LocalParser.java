public class LocalCache {
    private int state;

    public LocalCache(int seed) {
        this.state = seed;
    }

    public int render(int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += (state + i * 33) % 997;
        }
        return total;
    }

    public static void main(String[] args) {
        LocalCache obj = new LocalCache(33);
        System.out.println(obj.render(33));
    }
}
