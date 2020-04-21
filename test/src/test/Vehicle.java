package test;

public class Vehicle
{
    private int speed;
    private String size;
    public void move()
    {
    System.out.println("i'm moving");
    }
    public void setSpeed(int speed)
    {
        System.out.println("now i'm running with"+speed+"per hour");
    }
    public void speedUp()
    {
        Vehicle v=new Vehicle();
        v.setSpeed(1000);
    }
    public void speedDown()
    {
    Vehicle v=new Vehicle();
        v.setSpeed(20);
    }
    public static void main(String[] args)
    {
    Vehicle v=new Vehicle();
    v.speed=100;
    v.size="50/m^3";
    System.out.println("the initial speed is"+v.speed+"and my size is "+v.size);
    v.speedUp();
    v.speedDown();
    }
}