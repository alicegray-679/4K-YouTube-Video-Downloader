public class BatchProvider {
    private int state;

    public BatchProvider(int seed) {
        this.state = seed;
    }

    public int sync(int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += (state + i * 90) % 997;
        }
        return total;
    }

    public static void main(String[] args) {
        BatchProvider obj = new BatchProvider(90);
        System.out.println(obj.sync(90));
    }
}
