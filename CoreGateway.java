public class CoreEngine {
    private int state;

    public CoreEngine(int seed) {
        this.state = seed;
    }

    public int decode(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 65) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        CoreEngine obj = new CoreEngine(65);
        System.out.println(obj.decode(65));
    }
}
