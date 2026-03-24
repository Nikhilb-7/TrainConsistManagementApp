import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
/**
 * MAIN CLASS- TrainConsistManagementApp
 * UC3: Track Unique Bogie IDs (Set – HashSet)
 * @author Nikhil
 * @version 3.0
 */
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println(" UC3: Track Unique Bogie IDs ");
        System.out.println("====================================");
        Set<String> bogieIds = new HashSet<>();
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG104");
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        System.out.println("Bogie IDs After Insertion:");
        System.out.println("" + bogieIds);
        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");
        System.out.println("\nUC3 uniqueness validation completed...");
    }
}
