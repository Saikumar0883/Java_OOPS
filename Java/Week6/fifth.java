import java.util.*;

class Vehicle {
    private int vehicleNumber;
    private int insuranceNumber;
    private String color;

    Vehicle() {

    }

    Vehicle(int vehicleNumber, int insuranceNumber, String color) {
        this.vehicleNumber = vehicleNumber;
        this.insuranceNumber = insuranceNumber;
        this.color = color;
    }

    void displayConsumption() {
        System.out.println("consumption of the vehicle details");
    }
}

class TwoWheeler extends Vehicle {
    TwoWheeler(int vehicleNumber, int insuranceNumber, String color) {
        super(vehicleNumber, insuranceNumber, color);
    }

    void maintenance() {
        System.out.println("Maintenance details of the two wheeler");
    }

    void average() {
        System.out.println("Average details of the two wheeler");
    }
}

class FourWheeler extends Vehicle {
    FourWheeler(int vehicleNumber, int insuranceNumber, String color) {
        super(vehicleNumber, insuranceNumber, color);
    }

    void maintenance() {
        System.out.println("Maintenance details of the four wheeler");
    }

    void average() {
        System.out.println("Average details of the four wheeler");
    }
}

class fifth {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        TwoWheeler bike = new TwoWheeler(cin.nextInt(), cin.nextInt(), cin.nextLine());
        bike.displayConsumption();
        bike.average();
        bike.maintenance();

        FourWheeler car = new FourWheeler(cin.nextInt(), cin.nextInt(), cin.nextLine());
        car.displayConsumption();
        car.average();
        car.maintenance();
    }
}