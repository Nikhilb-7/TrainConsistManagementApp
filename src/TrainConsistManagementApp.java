import java.util.ArrayList;
import java.util.List;
/**
 * MAIN CLASS- TrainConsistManagementApp
 * UC2: Add Passenger Bogies to Train (ArrayList Operations)
 * @author Nikhil
 * @version 2.0
 */
public class TrainConsistManagementApp {
        public static void main(String[] args) {
            System.out.println("====================================");
            System.out.println(" UC2 - Add Passenger Bogies to Train");
            System.out.println("====================================");
            List<String> passengerBogies = new ArrayList<>();
             passengerBogies.add("Sleeper");
             passengerBogies.add("AC Chair");
             passengerBogies.add("First Class");
              System.out.println("\nAfter Adding Bogies:");
              System.out.println("Passenger Bogies : " + passengerBogies);
              passengerBogies.remove("AC Chair");
              System.out.println("\nAfter Removing 'AC Chair':");
              System.out.println("Passenger Bogies : " + passengerBogies);
              System.out.println("\nChecking if 'Sleeper' exists:");
              boolean exists = passengerBogies.contains("Sleeper");
              System.out.println("Contains Sleeper? : " + exists);
            System.out.println("\nFinal Train Passenger Consist:");
            System.out.println(passengerBogies);
            System.out.println("\nUC2 operations completed successfully...");
        }
    }
