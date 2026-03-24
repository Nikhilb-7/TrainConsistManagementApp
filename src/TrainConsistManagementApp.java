import java.util.Set;
import java.util.LinkedHashSet;
/**
 * MAIN CLASS- TrainConsistManagementApp
 * UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
 * @author Nikhil
 * @version 5.0
 */
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("====================================");
        Set<String> trainFormation = new LinkedHashSet<>();
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        trainFormation.add("Sleeper");
        System.out.println("\nFinal Train Formation:");
        System.out.println(trainFormation);
        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");
        System.out.println("\nUC5 Formation setup completed...");
    }
}
