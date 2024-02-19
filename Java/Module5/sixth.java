interface RBI {
    void credit(double amount);
    void debit(double amount);
    double displayBalance();
    double personalLoanEligibility(double annualIncome, String jobType);
    double homeLoanEligibility(double propertyValue);
    double vehicleLoanEligibility(double annualIncome, String jobType);
}


class SBI implements RBI {
    private double balance;

     
    public void credit(double amount) {
        balance += amount;
    }

     
    public void debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

   
    public double displayBalance() {
        return balance;
    }

   
    public double personalLoanEligibility(double annualIncome, String jobType) {
        double eligibility = 0;
        if (annualIncome > 500000 && jobType.equalsIgnoreCase("government")) {
            eligibility = annualIncome * 3; // Example: Three times the annual income
        }
        return eligibility;
    }

   
    public double homeLoanEligibility(double propertyValue) {
      
        double eligibility = 0;
        if (propertyValue > 1000000) {
            eligibility = propertyValue * 0.6;
        }
        return eligibility;
    }


    public double vehicleLoanEligibility(double annualIncome, String jobType) {
   
        double eligibility = 0;
        if (annualIncome > 300000 && jobType.equalsIgnoreCase("private")) {
            eligibility = annualIncome * 1.5; 
        }
        else
        {
             if (annualIncome > 400000 && jobType.equalsIgnoreCase("government")) {
            eligibility = annualIncome * 2;
        }
        }
        return eligibility;
    }
}

// HDFC Bank implementing RBI interface
class HDFC implements RBI {
    private double balance;

     
    public void credit(double amount) {
        balance += amount;
    }

     
    public void debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

   
    public double displayBalance() {
        return balance;
    }

   
    public double personalLoanEligibility(double annualIncome, String jobType) {
        double eligibility = 0;
        if (annualIncome > 500000 && jobType.equalsIgnoreCase("government")) {
            eligibility = annualIncome * 2; // Example: Three times the annual income
        }
        return eligibility;
    }

   
    public double homeLoanEligibility(double propertyValue) {
      
        double eligibility = 0;
        if (propertyValue > 1000000) {
            eligibility = propertyValue * 0.5;
        }
        return eligibility;
    }


    public double vehicleLoanEligibility(double annualIncome, String jobType) {
   
        double eligibility = 0;
        if (annualIncome > 300000 && jobType.equalsIgnoreCase("private")) {
            eligibility = annualIncome * 1; 
        }
        else
        {
             if (annualIncome > 400000 && jobType.equalsIgnoreCase("government")) {
            eligibility = annualIncome * 2;
        }
        }
        return eligibility;
    }
}

// DCB Bank implementing RBI interface
class DCB implements RBI {
     private double balance;

     
    public void credit(double amount) {
        balance += amount;
    }

     
    public void debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

   
    public double displayBalance() {
        return balance;
    }

   
    public double personalLoanEligibility(double annualIncome, String jobType) {
        double eligibility = 0;
        if (annualIncome > 500000 && jobType.equalsIgnoreCase("government")) {
            eligibility = annualIncome * 4; // Example: Three times the annual income
        }
        return eligibility;
    }

   
    public double homeLoanEligibility(double propertyValue) {
      
        double eligibility = 0;
        if (propertyValue > 1000000) {
            eligibility = propertyValue * 1.6;
        }
        return eligibility;
    }


    public double vehicleLoanEligibility(double annualIncome, String jobType) {
   
        double eligibility = 0;
        if (annualIncome > 300000 && jobType.equalsIgnoreCase("private")) {
            eligibility = annualIncome * 2.5; 
        }
        else
        {
             if (annualIncome > 400000 && jobType.equalsIgnoreCase("government")) {
            eligibility = annualIncome * 2.3;
        }
        }
        return eligibility;
    }
}
public class sixth {
    public static void main(String[] args) {
        // Usage example for SBI
        RBI sbiBank = new SBI();
        sbiBank.credit(5000);
        sbiBank.debit(2000);
        System.out.println("Current Balance in SBI: " + sbiBank.displayBalance());

        // Example loan eligibility calculations in SBI
        double sbiPersonalLoanEligibility = sbiBank.personalLoanEligibility(600000, "government");
        double sbiHomeLoanEligibility = sbiBank.homeLoanEligibility(1200000);
        double sbiVehicleLoanEligibility = sbiBank.vehicleLoanEligibility(400000, "private");

        System.out.println("SBI Personal Loan Eligibility: " + sbiPersonalLoanEligibility);
        System.out.println("SBI Home Loan Eligibility: " + sbiHomeLoanEligibility);
        System.out.println("SBI Vehicle Loan Eligibility: " + sbiVehicleLoanEligibility);

        // Usage example for HDFC
        RBI hdfcBank = new HDFC();
        hdfcBank.credit(8000);
        hdfcBank.debit(3000);
        System.out.println("Current Balance in HDFC: " + hdfcBank.displayBalance());

        // Example loan eligibility calculations in HDFC
        double hdfcPersonalLoanEligibility = hdfcBank.personalLoanEligibility(700000, "private");
        double hdfcHomeLoanEligibility = hdfcBank.homeLoanEligibility(1800000);
        double hdfcVehicleLoanEligibility = hdfcBank.vehicleLoanEligibility(500000, "government");

        System.out.println("HDFC Personal Loan Eligibility: " + hdfcPersonalLoanEligibility);
        System.out.println("HDFC Home Loan Eligibility: " + hdfcHomeLoanEligibility);
        System.out.println("HDFC Vehicle Loan Eligibility: " + hdfcVehicleLoanEligibility);

        // Usage example for DCB
        RBI dcbBank = new DCB();
        dcbBank.credit(10000);
        dcbBank.debit(4000);
        System.out.println("Current Balance in DCB: " + dcbBank.displayBalance());

        // Example loan eligibility calculations in DCB
        double dcbPersonalLoanEligibility = dcbBank.personalLoanEligibility(800000, "private");
        double dcbHomeLoanEligibility = dcbBank.homeLoanEligibility(1500000);
        double dcbVehicleLoanEligibility = dcbBank.vehicleLoanEligibility(600000, "government");

        System.out.println("DCB Personal Loan Eligibility: " + dcbPersonalLoanEligibility);
        System.out.println("DCB Home Loan Eligibility: " + dcbHomeLoanEligibility);
        System.out.println("DCB Vehicle Loan Eligibility: " + dcbVehicleLoanEligibility);
    }
}
