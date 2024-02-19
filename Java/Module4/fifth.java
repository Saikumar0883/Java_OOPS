import java.util.Scanner;

interface Basar {
    String branchName = "Basar";

}

interface Nizamabad {
    String branchName = "Nizamabad";
}

class Account implements Basar, Nizamabad {
    String userName;
    int acn;
    private double bal;
    Scanner cin = new Scanner(System.in);

    Account(String branchname, int accno, String username, double bal) {
        if (branchname.compareTo("Basar") == 0) {
            this.userName = username;
            this.acn = accno;
            this.bal = bal;
        } else {

            this.userName = username;
            this.acn = accno;
            this.bal = bal;
        }
    }

    void credit(double a) {
        bal += a;
        System.out.println("current bal = " + bal);
    }

    void debit(double a) {

        bal -= a;
        System.out.println("current bal = " + bal);
    }

    double getBal() {
        return bal;
    }

    int exit() {
        System.out.println("Yes or no");
        if (cin.next().equals("Yes")) {
            return 1;
        }
        return 0;
    }

    Account() {
    }

}

public class fifth {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        Account account[]=new Account[2];
        account[0]=new Account("Basar",2688,"sai",2000);
        account[1]=new Account("Nizamabad",1111,"Rakesh",8888);

        while(true)
        {
            System.out.println("enter username and password ");
            String a=cin.next();
            int b=cin.nextInt();
            
            for(Account i:account)
            {
                if((i.userName.equals(a)) && (i.acn==b))
                {
                    do
                    {
                        System.out.println("Enter 1 for Credit");
                        System.out.println("Enter 2 to debit");
                        System.out.println("Enter 3 for checkbalance");
                        System.out.println("Enter 4 for exit");
                        int choice=cin.nextInt();
                        if(choice==1)
                        {
                            i.credit(cin.nextDouble());
                        }
                        else if(choice==2)
                        {
                            i.debit(cin.nextDouble());
                        }
                        else if(choice==3)
                        {
                            System.out.println(i.getBal());
                        }
                        else
                        {
                            int aa=i.exit();
                            if(aa==0)
                            {
                                break;
                            }
                            else{
                                return;
                            }
                        }
                    }
                    while(true);
                }
            }
        }

    }
}
