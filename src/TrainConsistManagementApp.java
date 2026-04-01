import java.util.*;

/**
 * MAIN CLASS- TrainConsistManagementApp
 * UC10: Count Total Seats in Train (reduce)
 * @author Nikhil
 * @version 10.0
 */
import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " -> " + capacity;
    }
}
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();
        System.out.println("======================");
        System.out.println("UC10: Count Total Seats in Train (reduce)");
        System.out.println("======================\n");


        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("Bogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        int totalSeats = bogies.stream()
                .map(b -> b.getCapacity())
                .reduce(0, Integer::sum);

        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        System.out.println("\nUC10 aggregation completed...");
    }
}
