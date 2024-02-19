
class Mythread extends Thread{
    public void run()
    {
        System.out.println("hello");
    }
}
public class first {
    public static void main(String[] args) {
        Mythread t=new Mythread();
        t.start();
        
    }
}
