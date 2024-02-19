import java.util.*;

class overloading{
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    void add(double a,double b)
    {
        System.out.println(a+b);
    }
}

class overriding extends overloading{
    void add(int a,int b)
    {
        System.out.println("overriding of the parent method");
        System.out.println(a);
        System.out.println(b);
        System.out.println("addition of a and b is "+ (a+b));
    }
}
class second {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        overloading a=new overloading();
        a.add(cin.nextInt(),cin.nextInt());
        a.add(cin.nextDouble(),cin.nextDouble());

        overriding b=new overriding();
        b.add(cin.nextInt(),cin.nextInt());
    }   
}