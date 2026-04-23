/**
 * MAIN CLASS - TrainConsistManagementApp
 * UC16: Sort Passenger Bogies by Capacity (Bubble Sort)
 * @author Nikhil
 * @version 16.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        int capacities[] = {72, 56, 24, 70, 60};
        System.out.println("=======================================");
        System.out.println("UC16 Manual Sorting using Bubble Sort\n");
        System.out.println("=======================================");

        System.out.println("Original Capacities:\n");

        for(int i=0; i<capacities.length; i++) {
            System.out.print(capacities[i] + " ");
        }

        // Bubble Sort Logic
        for(int i=0; i<capacities.length-1; i++) {
            for(int j=0; j<capacities.length-1-i; j++) {

                if(capacities[j] > capacities[j+1]) {

                    int temp = capacities[j];
                    capacities[j] = capacities[j+1];
                    capacities[j+1] = temp;
                }
            }
        }

        System.out.println("\n");
        System.out.print("Sorted Capacities (Ascending): ");

        for(int i=0; i<capacities.length; i++) {
            System.out.print(capacities[i] + " ");
        }

        System.out.println("\n");
        System.out.println("UC16 sorting completed.");
    }
}