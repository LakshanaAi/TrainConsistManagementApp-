import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Try with empty list first
        List<String> bogieIds = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Bogie ID to search: ");
            String key = scanner.nextLine();

            boolean found = searchBogie(bogieIds, key);

            if (found) {
                System.out.println("Bogie found ✅");
            } else {
                System.out.println("Bogie not found ❌");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    // Search method with defensive check
    public static boolean searchBogie(List<String> bogies, String key) {

        // FAIL-FAST VALIDATION
        if (bogies == null || bogies.isEmpty()) {
            throw new IllegalStateException("No bogies available to search.");
        }

        // Linear search (can be binary if sorted)
        for (String id : bogies) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }
}