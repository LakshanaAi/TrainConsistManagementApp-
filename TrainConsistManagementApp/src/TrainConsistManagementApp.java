import java.util.HashMap;
import java.util.Map;

public class TrainConsistUC6 {
    public static void main(String[] args) {

        // Create HashMap for bogie-capacity mapping
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogie capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 54);
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Cargo Rectangular", 100);
        bogieCapacity.put("Cargo Cylindrical", 80);

        System.out.println("Train Bogie Capacity Mapping:\n");

        // Iterate using entrySet()
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        System.out.println("\nProgram completed.");
    }
}
