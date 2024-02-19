// Interface defining the Fare methods
interface Fare {
    double getFare(); // Fare amount paid for traveling
    String getAmenities(); // Amenities provided during the journey
}

// Class representing Bus Fare
class BusFare implements Fare {
    private String type; // Type of Bus
    private double distance; // Distance traveled in kilometers

    public BusFare(String type, double distance) {
        this.type = type;
        this.distance = distance;
    }

    @Override
    public double getFare() {
        double farePerKm;
        // Assumed fare per kilometer based on the type of Bus
        switch (type.toLowerCase()) {
            case "a/c":
                farePerKm = 10; // Example fare for A/C Bus
                break;
            case "non a/c":
                farePerKm = 8; // Example fare for Non A/C Bus
                break;
            case "sleeper":
                farePerKm = 12; // Example fare for Sleeper Bus
                break;
            // Add more cases for other types of buses if needed
            default:
                farePerKm = 0; // Default fare
        }
        return farePerKm * distance;
    }

    @Override
    public String getAmenities() {
        // Assumed amenities provided in a Bus based on type
        switch (type.toLowerCase()) {
            case "a/c":
                return "Air Conditioning, Comfortable Seats";
            case "non a/c":
                return "Regular Seats";
            case "sleeper":
                return "Sleeper Berths";
            default:
                return "Basic Amenities";
        }
    }
}

// Class representing Train Fare
class TrainFare implements Fare {
    private String type; // Type of Train
    private double distance; // Distance traveled in kilometers

    public TrainFare(String type, double distance) {
        this.type = type;
        this.distance = distance;
    }

    @Override
    public double getFare() {
        double farePerKm;
        // Assumed fare per kilometer based on the type of Train
        switch (type.toLowerCase()) {
            case "general":
                farePerKm = 5; // Example fare for General Train
                break;
            case "sleeper":
                farePerKm = 8; // Example fare for Sleeper Train
                break;
            case "a/c":
                farePerKm = 15; // Example fare for A/C Train
                break;
            default:
                farePerKm = 0; // Default fare
        }
        return farePerKm * distance;
    }

    @Override
    public String getAmenities() {
        // Assumed amenities provided in a Train based on type
        switch (type.toLowerCase()) {
            case "general":
                return "Basic Seats";
            case "sleeper":
                return "Sleeper Berths";
            case "a/c":
                return "Air Conditioning, Comfortable Seats";
            default:
                return "Basic Amenities";
        }
    }
}

// Class representing Flight Fare
class FlightFare implements Fare {
    private String classType; // Economy/Business class
    private double distance; // Distance traveled in kilometers

    public FlightFare(String classType, double distance) {
        this.classType = classType;
        this.distance = distance;
    }

    @Override
    public double getFare() {
        double farePerKm;
        // Assumed fare per kilometer based on the class of Flight
        switch (classType.toLowerCase()) {
            case "economy":
                farePerKm = 50; // Example fare for Economy Flight
                break;
            case "business":
                farePerKm = 150; // Example fare for Business Flight
                break;
            default:
                farePerKm = 0; // Default fare
        }
        return farePerKm * distance;
    }

    @Override
    public String getAmenities() {
        // Assumed amenities provided in a Flight based on class
        switch (classType.toLowerCase()) {
            case "economy":
                return "Standard Seating, Meal";
            case "business":
                return "Business Class Seating, Premium Meal, Lounge Access";
            default:
                return "Basic Amenities";
        }
    }
}

// Demonstration
public class fourth {
    public static void main(String[] args) {
        // Assuming a distance of 500 km for all cases
        double distance = 500;

        // Creating instances of different fares
        Fare busFare = new BusFare("A/C", distance);
        Fare trainFare = new TrainFare("A/C", distance);
        Fare flightFare = new FlightFare("Economy", distance);

        // Displaying fare and amenities
        System.out.println("Bus");
        displayFareAndAmenities(busFare);
        System.out.println("Train");
        displayFareAndAmenities(trainFare);
        System.out.println("Flght");
        displayFareAndAmenities(flightFare);
    }

    private static void displayFareAndAmenities(Fare fare) {
        System.out.println("Fare: $" + fare.getFare());
        System.out.println("Amenities: " + fare.getAmenities());
        System.out.println("--------");
    }
}
