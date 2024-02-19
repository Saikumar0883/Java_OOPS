import java.util.*;
interface Bank{
    void credentialsCheck(String Username, String password) throws Exception; 
    void debit(double a) throws Exception;
    void exit();
}
class user implements Bank{
    String username="Sai";
    String password="sai2688";
    double bal=100.88;

    public void credentialsCheck(String username,String password) throws Exception
    {
        if(this.username.equals(username) && this.password.equals(password))
        {
            throw new Exception("Valid check");
        }
        else
        throw new Exception("error");
        
    }
    public void debit(double a) throws Exception
    {
        if(a>bal)
        throw new Exception("error");
        else throw new Exception("Valid debit");
    }
    public void exit(){
       System.out.println("Thank you visit again"); 
    }
    
}
public class second {
    public static void main(String[] args) {
        user a=new user();
        Scanner cin=new Scanner(System.in);

        while(true)
        {
            System.out.println("enter 1 for checkcreditials");
            System.out.println("Enter 2 for debit ");
            System.out.println("enter 3 for exit");
            int choice=0;
            try{
                choice=cin.nextInt();
                if(choice==1)
                {
                    try{
                        a.credentialsCheck(cin.next(),cin.next());
                    }
                    catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                }
                else if(choice==2)
                {
                    try{
                        a.debit(cin.nextDouble());
                    }
                    catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                }
                else {
                    a.exit();
                    break;
                }
           }
           catch(Exception e)
           {
            System.out.println("Ener valid input");
           }
        }
    }
}
