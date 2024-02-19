
class MyException extends Exception{
   
    MyException(String a)
    {
        super(a);
    }
}
class sixth{
    public static void main(String[] args) {
        try {
            throw new MyException("Its my first exceptoin");
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}