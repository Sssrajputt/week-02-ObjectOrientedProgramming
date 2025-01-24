import java.util.*;
class Circle{
    private double radius;
    public Circle(double radius){
        System.out.println("Calling Parameterized Constructor");
        this.radius=radius;
    }
    public Circle(){

        this(23);
        System.out.println("Calling Default Constructor");
        radius=9.5;
       
    }
}
public class MainCircle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Circle circleDefault=new Circle();
       
    }
}