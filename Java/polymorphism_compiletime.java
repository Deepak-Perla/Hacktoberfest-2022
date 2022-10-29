package OOPS;

public class polymorphism_compiletime {

    public void Area(String circle)
    {
        System.out.println("Circle");
    }

    public void Area(String Circle, String Triangle)
    {
        System.out.println("Circle, Triangle");
    }

    public void Area(String Circle, String Triangle, String Square)
    {
        System.out.println("Circle, Triangle, Square");
    }

    public static void main(String[] args) {

        polymorphism_compiletime area =new polymorphism_compiletime();

        area.Area("Circle");
        area.Area("Circle", "Triangle");
        area.Area("Circle", "Triangle", "Square");

    }
}
