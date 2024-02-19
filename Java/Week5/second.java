import java.util.*;

class circle{
    int radius;

    double circleArea(){
        return Math.PI*this.radius*this.radius;
    }

    double circlePerimeter(){
        return Math.PI*2*this.radius;
    }
}
class second {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        circle c=new circle();
        c.radius=cin.nextInt();

        System.out.println(c.circleArea());
        System.out.println(c.circlePerimeter());
    }
}