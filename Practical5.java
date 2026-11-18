import java.util.*;

class Shape
{
    Scanner sc = new Scanner(System.in);
    void Area_Display()
    {
        System.out.println("Area of Shapes:");
    }
    
}
class Circle extends Shape
{
    double radius;
   
    Circle()
    {
        System.out.println("Enter a Radius Value:");
        radius = sc.nextDouble();
    }
    void Area_Display()
    {
        double AreaofCircle = 3.14 * radius *radius ;

        System.out.println("Area of Circle :"+AreaofCircle);
    }
}
class Rectangle extends Shape
{
    double length , breadth;
  

    Rectangle()
    {
        System.out.println("Enter a length Rectangle      :");
        length = sc.nextDouble();

        System.out.println("Enter a breadth of Rectangle :");
        breadth = sc.nextDouble();
    }
    void Area_Display()
    {
       double AreaofRectangle = (length * breadth);
        System.out.println("Area of Rectangle :"+AreaofRectangle);
    }
}
class Triangle extends Shape
{
    double base , height;

    Triangle()
    {
        System.out.println("Enter a Base of Trangle  :");
        base =sc.nextDouble();

        System.out.println("Enter a Height of Trangle:");
        height = sc.nextDouble();
    }

    void Area_Display()
    {
        double AreaofTriangle = (0.5 * base * height);

        System.out.println("Area of Circle :"+AreaofTriangle);
    }
}

class Practical5
{
    public static void main(String args[])
    {
    
        Circle c = new Circle();
        c.Area_Display();

        Rectangle r = new Rectangle();
        r.Area_Display();

        Triangle t = new Triangle();
        t.Area_Display();

    }
}