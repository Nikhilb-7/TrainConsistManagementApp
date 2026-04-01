import java.util.*;

/**
 * MAIN CLASS- TrainConsistManagementApp
 * UC11: Validate Train ID & Cargo Codes (Regex)
 * @author Nikhil
 * @version 11.0
 */
import java.util.*;
import java.util.regex.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("UC11: Validate Train ID & Cargo Codes (Regex)");
        System.out.println("=============================================\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = sc.nextLine();

        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);
        System.out.println("\nValidation Results:");

        if (trainMatcher.matches()) {
            System.out.println("Train ID is valid: true");
        } else {
            System.out.println("Train ID is invalid");
        }

        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is valid: true");
        } else {
            System.out.println("Cargo Code is invalid");
        }

        System.out.println("\nUC11 validation completed...");
    }
}