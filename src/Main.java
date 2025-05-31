
import Entities.Circle;
import Entities.Rectangle;
import Entities.Shape;
import Enums.Color;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

           List<Shape> shapes = new ArrayList<>();

         System.out.print("Enter the number of shapes: ");
         int n = sc.nextInt();

         for (int i = 0; i < n; i++) {
             System.out.println("shape #" + (i + 1)+ "data: ");
             System.out.print("Retangle or Circle (r/c)? : ");
             char Questshapes = sc.next().charAt(0);
             System.out.print("Color (BLACK/BLUE/RED)? :");
             Color color = Color.valueOf(sc.next().toUpperCase());

             if (Questshapes == 'r'){
                 System.out.print("Enter the width: ");
                 double width = sc.nextDouble();
                 System.out.print("Enter the height: ");
                 double height = sc.nextDouble();
                 Shape re = new Rectangle(color, height, width);
                 shapes.add(re);
             }
             else if (Questshapes == 'c') {
                 System.out.print("Enter the radius: ");
                 double radius = sc.nextDouble();
                 Shape cir = new Circle(color, radius);
                 shapes.add(cir);
             }
         }
         System.out.println("Area of shapes: ");
         for (Shape s: shapes) {
             System.out.printf("%.2f%n",s.area());
         }


 }
}