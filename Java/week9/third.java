
public class third {
    public static void two() throws Exception
    {
        // try{
            throw new Exception("Hello");
        // }
        // catch (Exception e){
        //     System.out.println(e);
        // }
    }
    public static void one() throws Exception
    {
        try{
            two();
        }
        catch(Exception e)
        {
            throw new Exception(e);
        }

    }
    public static void main(String[] args) {
    try{
        one();
    }
    catch(Exception e)
    {
        System.out.println(e);
        System.out.println("hello");
    }
   }
}
