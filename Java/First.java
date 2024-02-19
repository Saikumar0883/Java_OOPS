
class test{
    static int marks;
    void setMarks(int marks)
    {
        this.marks=marks;
    }
}

class First{
    public static void main(String[] args)
    {
        // System.out.println("hello");
        // test t=new test();
        // t.setMarks(9);
        // System.out.println(test.marks);

        // for(int i=0;i<args.length;i++)
        // {
        //     System.out.println(args[i]);
        // }
       
       try{
       int a=10/1;
       System.out.println(a);
       return;
    }
    catch(Exception e)
    {
        System.out.println("error");
        System.out.println(e);
    }
    finally{
        System.out.println("Hi finally executed here");
    }
}
}