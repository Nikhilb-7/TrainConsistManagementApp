/**
 * MAIN CLASS - TrainConsistManagementApp
 * UC20: Exception Handling During Search Operations
 * @author Nikhil
 * @version 20.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        String bogieIds[] = {}; // Empty train consist
        System.out.println("=======================================");


        System.out.println("UC20-Exception Handling During Search\n");
        System.out.println("=======================================");

        // Defensive validation (Fail-Fast)
        if(bogieIds.length == 0) {
            throw new IllegalStateException(
                    "Create breakpoint: No bogies available in train. Cannot perform search."
            );
        }

        // Search logic would go here (won't execute)
        System.out.println("Search started...");
    }
}
