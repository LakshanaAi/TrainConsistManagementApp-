// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie Class
class GoodsBogie {
    private String type;
    private String cargo;

    public GoodsBogie(String type) {
        this.type = type;
    }

    public void assignCargo(String cargo) {

        try {
            // VALIDATION (Runtime check)
            if (type.equalsIgnoreCase("Rectangular") &&
                    cargo.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Unsafe Assignment: Rectangular bogie cannot carry Petroleum"
                );
            }

            // SAFE ASSIGNMENT
            this.cargo = cargo;
            System.out.println(type + " bogie assigned with " + cargo);

        } catch (CargoSafetyException e) {
            // HANDLE ERROR (Graceful failure)
            System.out.println("Error: " + e.getMessage());

        } finally {
            // ALWAYS EXECUTES
            System.out.println("Assignment attempt completed for " + type);
        }
    }

    public void display() {
        System.out.println(type + " -> " + (cargo != null ? cargo : "No Cargo"));
    }
}

// Main Class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Safe case
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");

        System.out.println();

        // Unsafe case
        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");

        System.out.println();

        // Another safe case (program continues)
        GoodsBogie b3 = new GoodsBogie("Rectangular");
        b3.assignCargo("Coal");

        System.out.println("\nFinal State:");
        b1.display();
        b2.display();
        b3.display();
    }
}