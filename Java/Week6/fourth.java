import java.util.*;

class Employee {
    private String firstName;
    private String lastName;

    Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    Employee() {
    }
}

class ContractEmployee extends Employee {
    private String department;
    private String designation;

    ContractEmployee() {
    }

    ContractEmployee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    void setDepartment(String department) {
        this.department = department;
    }

    void setDesignation(String designation) {
        this.designation = designation;
    }

    String getDepartment() {
        return this.department;
    }

    String getDesig() {
        return this.designation;
    }

    void displayFUllName() {
        System.out.println(this.getFirstName() + this.getLastName());
    }

}

class HourlyEmployee extends ContractEmployee {
    double numberOfHours;
    double wagesPerHour;

    HourlyEmployee(String firstName, String lastName, double numberOfHours, double wagesPerHour) {
        super(firstName, lastName);
        this.numberOfHours = numberOfHours;
        this.wagesPerHour = wagesPerHour;
    }

    String getDesig() {
        return "Hourly Employee";
    }

    double calculateWages() {
        return numberOfHours * wagesPerHour * 4;
    }
}

class WeeklyEmployee extends ContractEmployee {
    double numberOfWeeks;
    double wagesPerWeeks;

    WeeklyEmployee(String firsName, String lastName, double numberOfWeeks, double wagesPerWeeks) {
        super(firsName, lastName);
        this.numberOfWeeks = numberOfWeeks;
        this.wagesPerWeeks = wagesPerWeeks;
    }

    String getDesig() {
        return "Weekly Employee";
    }

    double calculateWages() {
        return numberOfWeeks * wagesPerWeeks;
    }
}

class fourth {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter employee 1 data");
        HourlyEmployee e1 = new HourlyEmployee(cin.nextLine(), cin.nextLine(), cin.nextDouble(), cin.nextDouble());
        System.out.println("enter department");
        e1.setDepartment(cin.nextLine());
        System.out.println("enter designation");
        e1.setDesignation(cin.nextLine());

        System.out.println(e1.calculateWages());

        System.out.println("Enter employee 2 data");
        WeeklyEmployee e2 = new WeeklyEmployee(cin.nextLine(), cin.nextLine(), cin.nextDouble(), cin.nextDouble());
        System.out.println("enter department");
        e2.setDepartment(cin.nextLine());
        System.out.println("enter designation");
        e2.setDesignation(cin.nextLine());

        System.out.println(e2.calculateWages());

    }
}