import java.util.Scanner;

class books{
    String bName;
    int bcount;

    books(String a,int b){
        this.bName=a;
        this.bcount=b;
    }
}

class Customer{
    int id;
    String cName;
    Customer(int a,String b)
    {
        id=a;
        cName=b;
    }
}
public class fourteen {
    public static void main(String[] args) {
        books Books[]=new books[3];
        Books[0]=new books("hello",3);
        Books[1]=new books("Tel",4);
        Books[2]=new books("Hin",3);

        Customer c=new Customer(1,"sai");
        Scanner cin=new Scanner(System.in);

        String bn=cin.next();
       
        for(books b:Books)
        {
           
            if(bn.compareTo(b.bName)==0)
            {
                System.out.println(" These many books are available "+b.bcount);
                System.out.println("enter how many books you want to buy ");
                int ct=cin.nextInt();
                if(ct>b.bcount)
                {
                    System.out.println("thankyou visit again");
                }
                else{
                    System.out.println("You hava bought " + bn + " of quantity "+ct);
                    System.out.println("Reamining quantity is "+(b.bcount-ct));
                    b.bcount-=ct;
                }
            }
        }
    }
}
