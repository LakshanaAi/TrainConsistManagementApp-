import java.util.LinkedList;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Create LinkedList for train consist
        LinkedList<String> consist = new LinkedList<>();

        // Add bogies
        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(consist);

        // Insert Pantry Car at position 2
        consist.add(2, "Pantry");

        System.out.println("\nAfter inserting Pantry at position 2:");
        System.out.println(consist);

        // Remove first and last bogie
        consist.removeFirst();
        consist.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(consist);

        // Final ordered train consist
        System.out.println("\nFinal Train Consist:");
        for(String bogie : consist) {
            System.out.println(bogie);
        }
    }
}
