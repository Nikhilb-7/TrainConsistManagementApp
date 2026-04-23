/**
 * MAIN CLASS - TrainConsistManagementApp
 * UC17: Sort Bogie Names Using Arrays.sort()
 * @author Nikhil
 * @version 17.0
 */

import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        String bogies[] = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };
        System.out.println("=======================================");

        System.out.println("UC17 Sort Bogie Names Using Arrays.sort()\n");
        System.out.println("=======================================");

        System.out.println("Original Bogie Names:\n");
        System.out.println(Arrays.toString(bogies));

        Arrays.sort(bogies);

        System.out.println("\nSorted Bogie Names (Alphabetical):\n");
        System.out.println(Arrays.toString(bogies));

        System.out.println("\nUC17 sorting completed...");
    }
}