import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Input bogie names
        String[] bogies = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogies));

        // Built-in sorting
        Arrays.sort(bogies);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogies));
    }
}