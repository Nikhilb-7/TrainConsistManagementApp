import java.util.ArrayList;
import java.util.List;
/**
 * MAIN CLASS- TrainConsistManagementApp
 * UC1: Initialize Train and Display Consist Summary
 * @author Nikhil
 * @version 1.0
 */
public class TrainConsistManagementApp {
        public static void main(String[] args) {
            System.out.println("====================================");
            System.out.println("=== Train Consist Management App ===");
            System.out.println("====================================");
            List<String> trainConsist = new ArrayList<>();
            System.out.println("Train initialized successsfully...");
            System.out.println("Initial Bogie Count : " + trainConsist.size());
            System.out.println("Current Train Consist : " + trainConsist);
            System.out.println("\nSystem ready for operations...");
        }
    }
