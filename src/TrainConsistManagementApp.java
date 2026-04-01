/**
 * MAIN CLASS- TrainConsistManagementApp
 * UC13: Performance Comparison (Loops vs Streams)
 * @author Nikhil
 * @version 13.0
 */
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("UC13: Performance Comparison (Loops vs Streams)");
        System.out.println("=============================================\n");
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            bogies.add(new Bogie("Bogie" + i, i % 100));
        }

        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        System.out.println("Loop Filtering Time (ns) : " + loopTime);
        System.out.println("Stream Filtering Time (ns) : " + streamTime);
        System.out.println("\nUC13 performance comparison completed...");
    }
}