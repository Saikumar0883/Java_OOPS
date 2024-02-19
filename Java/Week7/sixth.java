import java.util.*;

interface StudentFee {
    abstract double getAmount();

    abstract String getFirstName();

    abstract String getLastName();

    abstract String getAddress();

    abstract String getContact();
}

class Hostler implements StudentFee {
    double money;
    String firstName;
    String lastName;
    String address;
    String contact;

    Hostler(double money, String firstName, String lastName, String address, String contact) {
        this.money = money;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
    }

    public double getAmount() {
        return money;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }
}

// class NonHostler implements StudentFee {
//     double money;
//     String firstName;
//     String lastName;
//     String address;
//     String contact;

//     NonHostler(double money, String firstName, String lastName, String address, String contact) {
//         this.money = money;
//         this.firstName = firstName;
//         this.lastName = lastName;
//         this.address = address;
//         this.contact = contact;
//     }

//     public double getAmount() {
//         return money;
//     }

//     public String getFirstName() {
//         return firstName;
//     }

//     public String getLastName() {
//         return lastName;
//     }

//     public String getAddress() {
//         return address;
//     }

//     public String getContact() {
//         return contact;
//     }
// }

class NonHostler extends Hostler{
     NonHostler(double money, String firstName, String lastName, String address, String contact){
        super(money, firstName, lastName, address, contact);
     }
}
class sixth {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Hostler s1=new Hostler(59.8,"sai","kumar","Kamareddy","944088507");
        System.out.println(s1.getAmount());
        System.out.println(s1.getFirstName());
        System.out.println(s1.getLastName());
        System.out.println(s1.getAddress());
        System.out.println(s1.getContact());

    }
}