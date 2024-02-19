import java.util.*;

abstract class shape{
    abstract double getArea();
    abstract double getVolume();
}

class square extends shape{
    double length;
    square(double l)
    {
        length=l;
    }

    @Override
    double getArea() {
        return length*length;
    }

    double getVolume(){
        return 0;
    }
}
class circle extends shape{
    double radius;
    circle(double r)
    {
        radius=r;
    }
    
    @Override
    double getArea() {
        return Math.PI*radius*radius;
    }

    double getVolume(){
        return 0;
    }
}
class cube extends shape{
    double side;
    cube(double side)
    {
        this.side=side;
    }

    @Override
    double getArea()
    {
        return 6*side*side;
    }

    double getVolume(){
        return side*side*side;
    }
}
class sphere extends shape{
    double radius;

    sphere(double radius)
    {
        this.radius=radius;
    }

    double getArea()
    {
        return 4*Math.PI*radius*radius;
    }

    double getVolume()
    {
        return (4.0/3.0)*Math.PI*radius*radius*radius;
    }
}
class first {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        square Square=new square(5);
        System.out.println(Square.getArea());
        System.out.println(Square.getVolume());

        circle Circle=new circle(4);
        System.out.println(Circle.getArea());
        System.out.println(Circle.getVolume());

        sphere Sphere=new sphere(8.9);
        System.out.println(Sphere.getArea());
        System.out.println(Sphere.getVolume());

        cube Cube=new cube(3);
        System.out.println(Cube.getArea());
        System.out.println(Cube.getVolume());
    } 
}