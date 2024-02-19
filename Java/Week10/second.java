
class green extends Thread {
    public void run() {

        System.out.println("green");
        

    }
}

class Red extends Thread {
    public void run() {

        System.out.println("red");
       

    }
}

class yellow extends Thread {
    public void run() {
        System.out.println("yellow");
       

    }
}

public class second {
    public static void main(String[] args) {
        green g = new green();
        Red r = new Red();
        yellow y = new yellow();
        g.start();
       try {
         Thread.sleep(1000);
       } catch (Exception e) {
        // TODO: handle exception
       }
        r.start();
       try {
         Thread.sleep(1000);
       } catch (Exception e) {
        // TODO: handle exception
       }
        y.start();

    }
}
