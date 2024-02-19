import java.util.*;
import second.shapes2;
import second.circle.circle;
import second.square.square;
class second {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        shapes2 shape1=new circle();
        shape1.printShape();
        shapes2 shape2=new square();
        shape2.printShape();
    }
}