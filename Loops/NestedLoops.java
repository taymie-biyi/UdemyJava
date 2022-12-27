public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("run code: " + i);

            for (int j = 0; j < 3; j++) {
                System.out.println("run: "+ j);
                for (int k = 0; k < 3; k++) {
                    System.out.println(k);
                }
            }
        }
    }
}
