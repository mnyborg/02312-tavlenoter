package circle;

public class Circle {
    // instans variabel
    private double radius;
  
    // default konstruktør
    public Circle(){
        radius = 0;
    }

    public Circle(double radius){
        this.radius = radius;
    }
    // getter metode
    public double getRadius(){
        return radius;
    }

    // setter metode
    public void setRadius(double r){
        radius = r;
    }

    // servicemetode
    public double area(){
        return Math.pow(radius, 2)* Math.PI;
    }

    // toString
    public String toString(){
        String out = "Radius: " + radius;
        return out;
    }
}
