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
    private String type;
    private String name;

    TwoWheeler() {
    }

    TwoWheeler(int vehicleNumber, int insuranceNumber, String color, String type, String name) {
        super(vehicleNumber, insuranceNumber, color);
        this.type = type;
        this.name = name;
    }

    String getType() {
        return this.type;
    }

    String getName() {
        return this.name;
    }

}

class Geared extends TwoWheeler {
    Geared(int vehicleNumber, int insuranceNumber, String color, String name) {
        super(vehicleNumber, insuranceNumber, color, "Geared", name);
    }

    void average() {
        System.out.println("Average details of the geared two wheeler");
    }
}

class nonGeared extends TwoWheeler {
    nonGeared(int vehicleNumber, int insuranceNumber, String color, String name) {
        super(vehicleNumber, insuranceNumber, color, "nonGeared", name);
    }

    void average() {
        System.out.println("Average details of the nongeared two wheeler");
    }
}

class sixth {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        Geared bike = new Geared(cin.nextInt(), cin.nextInt(), cin.nextLine(), cin.nextLine());
        bike.average();
        System.out.println(bike.getName());
        System.out.println(bike.getType());

        nonGeared scooty = new nonGeared(cin.nextInt(), cin.nextInt(), cin.nextLine(), cin.nextLine());
        scooty.average();
        System.out.println(scooty.getType());
        System.out.println(scooty.getName());
    }
}