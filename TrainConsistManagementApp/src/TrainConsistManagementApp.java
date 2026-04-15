import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Reuse bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 54));

        System.out.println("Original Bogie List:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " - " + b.capacity);
        }

        // Group using groupingBy
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        System.out.println("\nGrouped Bogies By Type:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\n" + entry.getKey() + ":");

            for (Bogie b : entry.getValue()) {
                System.out.println("Capacity: " + b.capacity);
            }
        }

        // original list unchanged
        System.out.println("\nOriginal List Size: " + bogies.size());
    }
}
