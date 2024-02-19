// Interface defining the Vehicle methods
interface Vehicle {
    String getCompany();

    String getModel();

    String getType(); // Petrol/Diesel/CNG

    double getConsumption(); // Consumption in km/L or km/kg
}

// Class representing Four Wheelers
class FourWheeler implements Vehicle {
    private String company;
    private String model;
    private String type;
    private double Mileage;

    public FourWheeler(String company, String model, String type) {
        this.company = company;
        this.model = model;
        this.type = type;
        switch (type.toLowerCase()) {
            case "petrol":
                Mileage = 14; // km/L
                break;
            case "diesel":
                Mileage = 22; // km/L
                break;
            case "cng":
                Mileage = 18; // km/kg
                break;
            default:
                Mileage = 0;
        }
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getConsumption() {
       return Mileage;
    }
}

// Class representing Two Wheelers
class TwoWheeler implements Vehicle {
    private String company;
    private String model;
    private String type;
    private double Mileage;

    public TwoWheeler(String company, String model, String type) {
        this.company = company;
        this.model = model;
        this.type = type;
         switch (type.toLowerCase()) {
            case "petrol":
                Mileage = 62; // km/L
                break;
            case "diesel":
                Mileage = 82; // km/L
                break;
            case "cng":
                Mileage = 72; // km/kg
                break;
            default:
                Mileage = 0;
        }
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getConsumption() {
       return Mileage;
    }
}

// Demonstration
public class third {
    public static void main(String[] args) {
        // Creating instances of vehicles
        Vehicle car = new FourWheeler("Toyota", "Corolla", "Petrol");
        Vehicle truck = new FourWheeler("Ford", "Ranger", "Diesel");
        Vehicle scooter = new TwoWheeler("Honda", "Activa", "Petrol");
        Vehicle bike = new TwoWheeler("Suzuki", "Hayabusa", "CNG");

        // Displaying information and fuel consumption
        displayInfoAndConsumption(car);
        displayInfoAndConsumption(truck);
        displayInfoAndConsumption(scooter);
        displayInfoAndConsumption(bike);
    }

    private static void displayInfoAndConsumption(Vehicle vehicle) {
        System.out.println("Company: " + vehicle.getCompany());
        System.out.println("Model: " + vehicle.getModel());
        System.out.println("Type: " + vehicle.getType());
        System.out.println("Fuel Consumption: " + vehicle.getConsumption() + " km/L or km/kg");
        System.out.println("--------");
    }
}
