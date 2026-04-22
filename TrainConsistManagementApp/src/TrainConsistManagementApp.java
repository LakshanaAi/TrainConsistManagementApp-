import java.util.*;

// Goods Bogie Class
class GoodsBogie {
    private String type;
    private String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return type + " -> " + cargo;
    }
}

// Main Class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        List<GoodsBogie> bogies = new ArrayList<>();

        // Sample Data (you can tweak for testing)
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        // bogies.add(new GoodsBogie("Cylindrical", "Coal")); // ← Uncomment to FAIL

        // STREAM VALIDATION (Core Logic)
        boolean isSafe = bogies.stream().allMatch(bogie ->
                !bogie.getType().equalsIgnoreCase("Cylindrical")
                        || bogie.getCargo().equalsIgnoreCase("Petroleum")
        );

        // Output
        System.out.println("Bogie List:");
        bogies.forEach(System.out::println);

        if (isSafe) {
            System.out.println("Train is SAFE ✅");
        } else {
            System.out.println("Train is UNSAFE ❌");
        }
    }
}