abstract class Shape
{
    public abstract void draw();
}
class Line extends Shape
{
    public void draw()
    {
        System.out.println("Line");
    }
}
class Rectangle extends Shape
{
    public void draw()
    {
        System.out.println("Rectangle");
    }
}
class Cube extends Shape
{
    public void draw()
    {
        System.out.println("Cube");
    }
}
public class Main3
{
    public static void main(String[] args)
    {
        Line l=new Line();
        l.draw();
        Rectangle r=new Rectangle();
        r.draw();
        Cube c=new Cube();
        c.draw();
    }
}