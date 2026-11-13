public class FastAdapter {
    private int state;

    public FastAdapter(int seed) {
        this.state = seed;
    }

    public int build(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 87) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        FastAdapter obj = new FastAdapter(87);
        System.out.println(obj.build(87));
    }
}
