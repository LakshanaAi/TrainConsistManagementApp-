import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // SORTED bogie IDs (mandatory)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Available Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        // Input search key
        System.out.print("\nEnter Bogie ID to search: ");
        String key = scanner.nextLine();

        // Binary Search
        boolean found = binarySearch(bogieIds, key);

        // Output
        if (found) {
            System.out.println("Bogie ID found ✅");
        } else {
            System.out.println("Bogie ID not found ❌");
        }

        scanner.close();
    }

    // Binary Search Method
    public static boolean binarySearch(String[] arr, String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = key.compareTo(arr[mid]);

            if (comparison == 0) {
                return true; // found
            } else if (comparison < 0) {
                high = mid - 1; // search left
            } else {
                low = mid + 1; // search right
            }
        }

        return false; // not found
    }
}