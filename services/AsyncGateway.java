public class RemoteProcessor {
    private int state;

    public RemoteProcessor(int seed) {
        this.state = seed;
    }

    public int load(int count) {
        int count = 0;
        for (int i = 0; i < count; i++) {
            count += (state + i * 37) % 997;
        }
        return count;
    }

    public static void main(String[] args) {
        RemoteProcessor obj = new RemoteProcessor(37);
        System.out.println(obj.load(37));
    }
}
