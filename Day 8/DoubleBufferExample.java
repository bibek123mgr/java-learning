import java.util.*;

public class DoubleBufferExample {
    public static void main(String[] args) {
        // DoubleBuffer db = DoubleBuffer.allocate(6);
        java.nio.DoubleBuffer db = java.nio.DoubleBuffer.allocate(6);
        db.put(10.3);
        db.put(20.1);
        db.put(10.10);

        System.out.println(Arrays.toString(db.array()));

        db.limit(2);
        try {
            System.out.println(db.get(3));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
