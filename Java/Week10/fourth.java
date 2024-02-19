
class ticker extends Thread {
    
     public synchronized void run() {
        System.out.println(this.currentThread().getName() +" "+ "Got the ticket and entered into the hall");

    }
}

public class fourth {
    public static void main(String[] args) {
        ticker t = new ticker();
        ticker t1 = new ticker();

        ticker t2 = new ticker();
        ticker t3 = new ticker();
        t.start();
        t1.start();
        t2.start();
        t3.start();
    }
}
