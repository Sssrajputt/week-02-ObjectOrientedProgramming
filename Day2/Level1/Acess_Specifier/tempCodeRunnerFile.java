import java.util.*;
class Student{
    public String rollNumber;
    private double cgpa;
    protected String name;
    public Student( String rollNumber, String name,double cgpa){
        this.rollNumber=rollNumber;
        this.name=name;
        this.cgpa=cgpa;
    }
    public void changeCGPA(double cgpa){
        this.cgpa=cgpa;
    }
    public void display(){
        System.out..println("Name of the Student: "+name);
        System.out.println("Roll Number of the Student: "+rollNumber);
        System.out.println("CGPA Of the Student: "+cgpa);
    }
}
public class StudentDetails{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Student ram=new Student("0199AL211053","Ram Sharma",8.797);
        ram.display();
        ram.changeCGPA(8.657);
        ram.display();

    }
}
