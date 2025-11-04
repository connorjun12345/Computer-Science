public class PoolTester {
    public static void main(String[] args) {
        Pool pool1 = new Pool("  Oasis   Pool  ", "Connor Jun", 8);

        System.out.println("pool 1 test:" + pool1.getCleanlinessLevel() + pool1.getName() + pool1.getOwnerName() + pool1.getUsername());

    }
}
