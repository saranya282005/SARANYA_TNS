package assignment2;
import java.util.Scanner;

class Circle {
    
    private double radius;
    private String color;

    
    public void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        radius = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.print("Enter color of the circle: ");
        color = sc.nextLine();
    }

    
    public void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("\n--- Circle Details ---");
        System.out.println("Radius : " + radius);
        System.out.println("Color  : " + color);
        System.out.println("Area   : " + area);
    }
}

public class Radius {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.getInput();
        c.calcArea();
    }
}
