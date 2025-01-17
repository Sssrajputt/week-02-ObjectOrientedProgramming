import java.util.*;

// Creating Circle class
class Circle {

    // Creating radius attribute
    double radius;
    double area;
    double circumference;

    // Creating a constructor to initialize radius
    public Circle(double radius) {
        // Using this keyword to initialize value
        this.radius = radius;
        calculate(radius); // Calculate area and circumference during object creation
    }

    // Method to calculate circumference and area
    public void calculate(double radius) {
        // Area of circle
        this.area = Math.PI * radius * radius;

        // Circumference of circle
        this.circumference = 2 * Math.PI * radius;
    }

    // Method to display area and circumference
    public void display() {
        System.out.println("Area of circle: " + area);
        System.out.println("Circumference of circle: " + circumference);
    }
}

public class CalculateAreaAndCircumference {

    public static void main(String args[]) {
        // Creating Circle class object
        Circle circle = new Circle(8.0);

        // Displaying area and circumference
        circle.display();
    }
}
}
