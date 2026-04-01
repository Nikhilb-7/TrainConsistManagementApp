import java.util.*;

/**
 * MAIN CLASS- TrainConsistManagementApp
 * UC9: Group Bogies by Type (Collectors.groupingBy)
 * @author Nikhil
 * @version 9.0
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
        System.out.println("UC9: Group Bogies by Type (Collectors.groupingBy)");
        System.out.println("======================\n");
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC Chair", 50));

        System.out.println("All Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getName));

        System.out.println("\nGrouped Bogies:\n");
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("Bogie Type: "+entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
        }

        System.out.println("\nUC9 grouping completed...");
    }
}
