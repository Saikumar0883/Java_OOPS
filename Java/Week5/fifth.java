
import java.util.*;
class vehicle{
    int totalTyres=4;
    int maxSpeed;

    vehicle(int maxSpeed)
    {
        this.maxSpeed=maxSpeed;
    }

    void display()
    {
        System.out.println("Total tyres vehicle has = " + totalTyres);
        System.out.println("Max speed of the vehicle is "+maxSpeed);
    }

    vehicle(){}
}

class car extends vehicle{
    int maxSpeed;
    car(int maxSpeed)
    {
        super(maxSpeed);
    }

    void carinfodisplay()
    {
        System.out.println("Car maxspeed is "+super.maxSpeed);
    }

    void vehicledisplay()
    {
        super.display();
    }
}
class fifth {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        
        car audi=new car(100);
        audi.carinfodisplay();
        audi.vehicledisplay();

    }
}