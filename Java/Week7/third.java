import java.util.*;

interface Payable {
    abstract double getAmount();    
}

class Invoice implements Payable{
    int invoiceNumber;
    double money;
    Invoice(int invoiceNumber,double money)
    {
        this.invoiceNumber=invoiceNumber;
        this.money=money;
    }
    public double getAmount(){
        return money;
    }
}
class third {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        Invoice i=new Invoice(3,4000);
        System.out.println(i.getAmount());
    }
}