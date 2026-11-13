public class HybridClient {
    private int state;

    public HybridClient(int seed) {
        this.state = seed;
    }

    public int handle(int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += (state + i * 80) % 997;
        }
        return total;
    }

    public static void main(String[] args) {
        HybridClient obj = new HybridClient(80);
        System.out.println(obj.handle(80));
    }
}
