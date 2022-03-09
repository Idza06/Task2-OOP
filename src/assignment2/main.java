/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment2;

import Space.Beam;
import Space.Cylinder;
import java.util.Scanner;

/**
 *
 * @author Qibran Idza Lafandzi
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean choice = false;
        int loop;
        
        do{
            double length, wide, radius, beamHeight, cylinderHeight;
            double pi = 3.14159;
            int choose;
            System.out.println("\n ===========");
            System.out.println(" Main Menu");
            System.out.println(" ===========");
            System.out.println("1. Beam");
            System.out.println("2. Cylinder");
            System.out.println("3. Exit");
            System.out.print("Choose : ");
            choose = input.nextInt();
            
            if(choose == 1){
                System.out.print("Length : ");
                length = input.nextInt();
                System.out.print("Wide : ");
                wide = input.nextInt();
                System.out.print("Height : ");
                beamHeight = input.nextInt();
                
                Beam bm = new Beam(beamHeight, length, wide);
                
                System.out.println("Area of Rectangle : " + bm.area());
                System.out.println("Circumference of Rectange : " + bm.circumference());
                System.out.println("Volume of Beam : " + bm.volume());
                System.out.println("Surface Area of Beam : " + bm.surfaceArea());
            
            }else if (choose == 2){
                System.out.print("Radius : ");
                radius = input.nextInt();
                System.out.print("Height : ");
                cylinderHeight = input.nextInt();
                
                Cylinder cy = new Cylinder(cylinderHeight, radius, pi);
                        
                System.out.println("Area of Circle : " + cy.area());
                System.out.println("Circumference of Circle : " + cy.circumference());
                System.out.println("Volume of Cylinder : " + cy.volume());
                System.out.println("Surface Area of Cylinder : " + cy.surfaceArea());
     
            }else if (choose == 3){
                System.exit(0);
            }else{
                System.out.println("Please input again!");
                choice = true;
            }
            System.out.print("Return? Yes[1] / No[0] : " );
            loop = input.nextInt();
                if(loop == 1){
                    choice = true;
                    System.out.println("\n");
                }else if(loop == 0){
                    System.exit(0);
                }
        }while (choice = true);  
    }
    
}
