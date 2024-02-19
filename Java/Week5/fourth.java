import java.util.*;

class Account {
   double bal;
   String accName;
   int accNumber;
   String accAdress;

   Account(double initialBalance, String accName, int accNumber, String accAdress) {
      if (initialBalance > 0) {
         bal = initialBalance;
         this.accName = accName;
         this.accNumber = accNumber;
         this.accAdress = accAdress;
      } else {
         System.out.println("Intial Balance should be greater than zero");
      }
   }

   void credit(double money)
   {
      if(money>0)
      {
         bal+=money;
         System.out.println("Your present bal = "+ bal);
      }
      else{
         System.out.println("Invalid Credit");
      }
   }

   double debit(double money)
   {
      if(money<=bal)
      {
         bal-=money;
         System.out.println("Your present bal = "+ bal);
         return money;
      }
      else
      System.out.println("Debit amount exceeded amount balance");
      return 0;
   }
}

class fourth {
   public static void main(String[] args) {
      Scanner cin = new Scanner(System.in);

      Account myAccount=new Account(cin.nextDouble(),cin.next(),cin.nextInt(),cin.nextLine());
      // System.out.println(myAccount);
      myAccount.credit(300);
      myAccount.debit(100);
   }
}