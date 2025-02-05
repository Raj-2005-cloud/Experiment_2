import java.util.Scanner;

public class Shape_Area {
    public void area(double length, double breadth) {
        double result = length * breadth;
        System.out.println("Area of the Rectangle: " + result);
    }
    public void area(double side) {
        double result = side * side;
        System.out.println("Area of the Square: " + result);
    }

    public void area(float radius) {
        float result = (float) (Math.PI * radius * radius);
        System.out.println("Area of the Circle: " + result);
    }

    public void area(double base, float height) {
        double result = 0.5 * base * height;
        System.out.println("Area of the Triangle: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape_Area shape = new Shape_Area();

        System.out.println("Choose the shape to calculate the area:");
        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.println("4. Triangle");
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: // Rectangle
                System.out.print("Enter the length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter the breadth of the rectangle: ");
                double breadth = sc.nextDouble();
                shape.area(length, breadth);
                break;

            case 2: 
                System.out.print("Enter the side of the square: ");
                double side = sc.nextDouble();
                shape.area(side);
                break;

            case 3:
                System.out.print("Enter the radius of the circle: ");
                float radius = sc.nextFloat();
                shape.area(radius);
                break;

            case 4: 
                System.out.print("Enter the base of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                float height = sc.nextFloat();
                shape.area(base, height);
                break;

            default:
                System.out.println("Invalid choice! Please select a valid option.");
        }

        sc.close();
    }
}
