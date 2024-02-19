import java.util.*;

class Myobj{
    int obj;
    Myobj(int val)
    {
        this.obj=val;
    }
}
class third {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        Myobj myobj=new Myobj(10);

        System.out.println("Before value " + myobj.obj);
        changeObjValue(myobj);
        System.out.println(myobj.obj);

    }

    public static void changeObjValue(Myobj object)
    {
        object.obj=30;
        System.out.println("while changing the value " + object.obj);
    }
}
