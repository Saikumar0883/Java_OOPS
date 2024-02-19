import java.util.*;
abstract class Employee{
    abstract double getAmount();
}

class WeeklyEmployee extends Employee{
    double hours;
    double amountPerHour;
    WeeklyEmployee(double hours,double amountPerHour)
    {
        this.hours=hours;
        this.amountPerHour=amountPerHour;
    }

    double getAmount()
    {
        return hours*amountPerHour;
    }
}

class HourlyEmployee extends Employee{
    double weeks;
    double amountPerWeek;
    HourlyEmployee(double weeks,double amountPerHour)
    {
        this.weeks=weeks;
        this.amountPerWeek=amountPerHour;
    }

    double getAmount(){
        return weeks*amountPerWeek;
    }
}
class second {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        HourlyEmployee e1= new HourlyEmployee(4,60);
        System.out.println(e1.getAmount());

        WeeklyEmployee e2=new WeeklyEmployee(5,300);
        System.out.println(e2.getAmount());
    }
}