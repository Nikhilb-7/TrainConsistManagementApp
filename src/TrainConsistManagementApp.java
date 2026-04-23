/**
 * MAIN CLASS - TrainConsistManagementApp
 * UC19: Binary Search for Bogie ID
 * @author Nikhil
 * @version 19.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        String bogieIds[] = {
                "B6101",
                "B6205",
                "B6309",
                "B6412",
                "B6550"
        };

        String searchKey = "B6309";

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;
        System.out.println("=======================================");

        System.out.println("UC19 Binary Search for Bogie ID\n");
        System.out.println("=======================================");

        System.out.println("Sorted Bogie IDs:\n");

        for(int i=0; i<bogieIds.length; i++) {
            System.out.println(bogieIds[i]);
        }

        // Binary Search
        while(low <= high) {

            int mid = (low + high) / 2;

            if(searchKey.compareTo(bogieIds[mid]) == 0) {
                found = true;
                break;
            }

            else if(searchKey.compareTo(bogieIds[mid]) < 0) {
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }

        System.out.println();

        if(found) {
            System.out.println("Bogie " + searchKey + " found using Binary Search.");
        }
        else {
            System.out.println("Bogie " + searchKey + " not found.");
        }

        System.out.println("\nUC19 search completed...");
    }
}