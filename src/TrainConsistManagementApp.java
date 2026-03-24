import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
/**
 * MAIN CLASS- TrainConsistManagementApp
 * UC4: Maintain Ordered Bogie IDs (TreeSet & SortedSet)
 * @author Nikhil
 * @version 4.0
 */
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println(" UC4: Maintain Ordered Bogie Consist ");
        System.out.println("====================================");
        LinkedList<String> trainConsist = new LinkedList<>();
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");
        System.out.println("Initial Train Consist:\n " + trainConsist);
        trainConsist.add(2, "Pantry Car");
        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:\n " + trainConsist);
        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("\nAfter Removing First and Last Bogie:\n " + trainConsist);
        System.out.println("\nUC4 ordered consist operations completed...");
    }
}