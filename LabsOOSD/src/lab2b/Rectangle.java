package lab2b;

public class Rectangle {
    double Length = 0;
    double Width = 0;

    public Rectangle() {
        Length = 1;
        Width = 1;
    }

    public double getLength() {
        return Length;
    }

    public void setLength(double newLength) {
        for(double i = 0.0; i < 40.0; i++) {
        this.Length = newLength;
        }
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double newWidth) {
        for(double i = 0.0; i < 40.0; i++) {
        this.Width = newWidth;
        }
    }

    public String toString() {
        return ("length =" + Length + "width =" + Width);
     }
    
    public double getArea() {
        return (Length*Width);
    }

    public double getPerimeter() {
        return ((Length + Width) * 2);
    }

    public String printRectangle() {
        return null;
    }

     public static void main(String[] args) {
         System.out.println(); 
         
     }
}
