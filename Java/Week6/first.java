import java.util.*;

class Shape{
    double getArea()
    {
        return 0.0;
    }
    double getPerimeter()
    {
        return 0.0;
    }
}
class circle extends Shape{
    int radius;
    circle(int radius)
    {
        this.radius=radius;
    }

    double getArea()
    {
        return Math.PI*radius*radius;
    }
    double getPerimeter()
    {
        return 2*Math.PI*radius;
    }
}
class rectangle extends Shape{
    double length;
    double breadth;

    rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
    double getArea()
    {
        return length*breadth;
    }
    double getPerimeter()
    {
        return 2*(length+breadth);
    }
}

class first {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Shape shapes[]=new Shape[2];
        shapes[0]=new circle(3);
        shapes[1]=new rectangle(4,6);

        for(Shape i:shapes)
        {
            System.out.println(i.getArea());
            System.out.println(i.getPerimeter());
        }
    }
}