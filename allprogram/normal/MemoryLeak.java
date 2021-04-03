package allprogram.normal;

import java.util.Vector;

public class MemoryLeak {
    public static void main(String[] args) {
        Vector v = new Vector(214444);
        Vector v1 = new Vector(214744444);
        Vector v2 = new Vector(214444);
        System.out.println("Memory Leaks");
    }
}
