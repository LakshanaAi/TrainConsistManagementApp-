import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies in order
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // محاولة إضافة عنصر مكرر (duplicate)
        trainFormation.add("Sleeper"); // duplicate, will be ignored

        // Display final formation
        System.out.println("\nTrain Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);
    }
}