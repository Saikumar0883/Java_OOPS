import java.util.*;

class Employee {
    private String firstName;
    private String lastName;

    Employee(String firstName,String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    Employee(){}
}

class ContractEmployee extends Employee {
    private String department;
    private String designation;
    private double salary;

    ContractEmployee(){}
    ContractEmployee(String firstName,String lastName)
    {
        super(firstName, lastName);
    }

    void setDepartment(String department)
    {
        this.department=department;
    }

    void setDesignation(String designation)
    {
        this.designation=designation;
    }

    void setSalary(double salary)
    {
        this.salary=salary;
    }

    String getDepartment(){
        return this.department;
    }
    String getDesig()
    {
        return this.designation;
    }

    void displayFUllName()
    {
        System.out.println(this.getFirstName()+this.getLastName());
    }

    void printSalary()
    {
        System.out.println(this.salary);
    }
}

class RegularEmployee extends ContractEmployee{
    RegularEmployee(String firstName,String lastName)
    {
        super(firstName,lastName);
    }
}

class third {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        ContractEmployee emp1=new ContractEmployee(cin.nextLine(),cin.nextLine());
        emp1.setDepartment(cin.nextLine());
        emp1.setDesignation(cin.nextLine());
        emp1.setSalary(1000);
        emp1.displayFUllName();
        emp1.printSalary();

        System.out.println(emp1.getDepartment());
        System.out.println(emp1.getDesig());

        System.out.println();

        RegularEmployee emp2=new RegularEmployee(cin.nextLine(),cin.nextLine());
        emp2.setDepartment(cin.nextLine());
        emp2.setDesignation(cin.nextLine());
        emp2.setSalary(1000);
        emp2.displayFUllName();
        emp2.printSalary();

        System.out.println(emp2.getDepartment());
        System.out.println(emp2.getDesig());
    }
}