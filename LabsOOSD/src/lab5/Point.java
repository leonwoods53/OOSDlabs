package lab5;

public class Point {

    //Variables
    private double X;
    private double Y;
    
    //Constructors
    
    //Getters and Setters
    public double getX() {
        return X;
    }
    public void setX(double X) {
        X = X;
    }
    public double getY() {
        return Y;
    }
    public void setY(double Y) {
        Y = Y;
    }
    
    //toString
    @Override
    public String toString() {
        return "Point [X" + X + ", Y" + Y + "]";
    }

    //Misc
}

public class Circle extends Point {
    
    //Variables
    private double Radius;

    //Getters and Setters
    public double getRadius() {
        return Radius;
    }
    public void setRadius(double Radius) {
        Radius = Radius;
    }
}