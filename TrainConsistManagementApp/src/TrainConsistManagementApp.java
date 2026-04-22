import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Sample bogie IDs (unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Available Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        // Input search key
        System.out.print("\nEnter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        // Linear Search
        boolean found = linearSearch(bogieIds, searchKey);

        // Output
        if (found) {
            System.out.println("Bogie ID found ✅");
        } else {
            System.out.println("Bogie ID not found ❌");
        }

        scanner.close();
    }

    // Linear Search Method
    public static boolean linearSearch(String[] arr, String key) {

        for (String id : arr) {
            if (id.equals(key)) {  // safe comparison
                return true;       // early termination
            }
        }

        return false;
    }
}