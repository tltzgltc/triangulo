package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       
        Triangle x, y; 
        x = new Triangle();
        y = new Triangle();
        
        System.out.println("Enter the measures of trinagle  x");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        
        System.out.println("Enter the measures of trinagle y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
        double areaX = x.area();
        double areaY = y.area();
        
        System.out.printf("The X area is: %.2f%n", areaX);
        System.out.printf("The Y area is: %.2f%n", areaY);
        System.out.printf("Only a test");
        System.out.printf("Only another test");
    }
    
}
