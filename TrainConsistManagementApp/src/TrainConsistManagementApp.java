// Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie Class
class PassengerBogie {
    private String type;
    private int capacity;

    // Constructor with validation (FAIL-FAST)
    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void display() {
        System.out.println(type + " Bogie -> Capacity: " + capacity);
    }
}

// Main Class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        try {
            // VALID CASE
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            b1.display();

            // INVALID CASE (Negative)
            PassengerBogie b2 = new PassengerBogie("AC Chair", -10);
            b2.display(); // won't execute

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // INVALID CASE (Zero)
            PassengerBogie b3 = new PassengerBogie("First Class", 0);
            b3.display(); // won't execute

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}