/**
 * MAIN CLASS- TrainConsistManagementApp
 * UC14: Handle Invalid Bogie Capacity (Custom Exception)
 * @author Nikhil
 * @version 14.0
 */
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {
    private String name;
    private int capacity;

    public PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + "-> " + capacity;
    }
}
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("UC14: Handle Invalid Bogie Capacity (Custom Exception)");
        System.out.println("=============================================\n");
        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Created Bogie: " + b1);

            PassengerBogie b2 = new PassengerBogie("AC Chair", 0);
            System.out.println("Created Bogie: " + b2);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed...");
    }
}