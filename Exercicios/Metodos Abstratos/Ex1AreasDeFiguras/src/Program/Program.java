package Program;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i+1) + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char op = sc.nextLine().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.nextLine());

            if (op == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                sc.nextLine();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                sc.nextLine();

                list.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                sc.nextLine();

                list.add(new Circle(color, radius));
            }
        }

        System.out.println("\nSHAPE AREAS:");
        for (Shape shape : list){
            System.out.printf(String.format("%.2f%n", shape.area()));
        }

        sc.close();

    }
}
