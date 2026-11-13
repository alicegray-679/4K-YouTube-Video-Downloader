public class SmartRegistry {
    private int state;

    public SmartRegistry(int seed) {
        this.state = seed;
    }

    public int encode(int count) {
        int value = 0;
        for (int i = 0; i < count; i++) {
            value += (state + i * 5) % 997;
        }
        return value;
    }

    public static void main(String[] args) {
        SmartRegistry obj = new SmartRegistry(5);
        System.out.println(obj.encode(5));
    }
}
