/**
 * MAIN CLASS - TrainConsistManagementApp
 * UC15: Safe Cargo Assignment Using try-catch-finally
 * @author Nikhil
 * @version 15.0
 */

class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    private String shape;
    private String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargoType) {

        try {

            if(shape.equalsIgnoreCase("Rectangular") &&
                    cargoType.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Unsafe cargo assignment!"
                );
            }

            cargo = cargoType;
            System.out.println("Cargo assigned successfully ->");
            System.out.println(cargo);

        }

        catch(CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        }

        finally {
            System.out.println("Cargo validation completed for "
                    + shape + " bogie\n");
        }
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UC15 Safe Cargo Assignment\n");

        GoodsBogie g1 = new GoodsBogie("Cylindrical");
        g1.assignCargo("Petroleum");

        GoodsBogie g2 = new GoodsBogie("Rectangular");
        g2.assignCargo("Petroleum");

        System.out.println("UC15 runtime handling completed.");
    }
}