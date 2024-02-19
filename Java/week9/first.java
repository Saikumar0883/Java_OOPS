import java.util.*;
class MyException extends Exception{
    public MyException(String a)
    {
        super(a);
    }
}
class first{
    public static void main(String[] args) throws MyException{
        try{
            throw new MyException("Its my first exceptoin");
        }
        catch (MyException e) {
            System.out.println(e);
        }
        finally{
            System.out.println("Finally here");
        }
    }
}