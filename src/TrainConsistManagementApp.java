/**
 * MAIN CLASS - TrainConsistManagementApp
 * UC18: Linear Search for Bogie ID
 * @author Nikhil
 * @version 18.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        String bogieIds[] = {"86101","86205","86309","86412","86550"};
        String searchKey = "86309";

        boolean found = false;
        System.out.println("=======================================");

        System.out.println("UC18 Linear Search for Bogie ID\n");
        System.out.println("=======================================");

        System.out.println("Available Bogie IDs:\n");

        for(int i=0; i<bogieIds.length; i++) {
            System.out.println(bogieIds[i]);
        }

        // Linear Search
        for(int i=0; i<bogieIds.length; i++) {

            if(bogieIds[i].equals(searchKey)) {
                found = true;
                break;
            }
        }

        System.out.println();

        if(found) {
            System.out.println("Bogie " + searchKey + " found in train consist.");
        }
        else {
            System.out.println("Bogie " + searchKey + " not found in train consist.");
        }

        System.out.println("\nUC1B search completed...");
    }
}