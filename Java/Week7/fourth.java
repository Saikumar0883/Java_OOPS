import java.util.*;

interface vehicle {
    abstract String getColor();

    abstract int getNumber();

    abstract double getConsumption();
}

class twoWheeler implements vehicle {
    String color;
    int number;
    double Consumption;

    twoWheeler(String color, int number, double Consumption) {
        this.color = color;
        this.number = number;
        this.Consumption = Consumption;
    }

    public String getColor() {
        return this.color;
    }

    public int getNumber() {
        return this.number;
    }

    public double getConsumption() {
        return Consumption;
    }
}

class fourWheeler implements vehicle {
    String color;
    int number;
    double Consumption;

    fourWheeler(String color, int number, double Consumption) {
        this.color = color;
        this.number = number;
        this.Consumption = Consumption;
    }

    public String getColor() {
        return this.color;
    }

    public int getNumber() {
        return this.number;
    }

    public double getConsumption() {
        return Consumption;
    }
}

class fourth {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
     
        twoWheeler bike=new twoWheeler("black",8885,905);
        System.out.println(bike.getColor());
        System.out.println(bike.getConsumption());
        System.out.println(bike.getNumber());

        fourWheeler car=new fourWheeler("black",8885,905);
        System.out.println(car.getColor());
        System.out.println(car.getConsumption());
        System.out.println(car.getNumber());

        
    }
}
