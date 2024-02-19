import java.util.*;
interface Fare{
    abstract double getAmount();
}

class bus implements Fare{
    double distance;
    double farePerKm;

    bus(double distance,double farePerKm)
    {
        this.distance=distance;
        this.farePerKm=farePerKm;
    }

    public double getAmount()
    {
        return distance*farePerKm;
    }
}
class train implements Fare{
    double distance;
    double farePerKm;

    train(double distance,double farePerKm)
    {
        this.distance=distance;
        this.farePerKm=farePerKm;
    }

    public double getAmount()
    {
        return distance*farePerKm;
    }
}
class fifth {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        bus b=new bus(20,300);
        System.out.println(b.getAmount());

        train t=new train(3,300);
        System.out.println(t.getAmount());
    }
}