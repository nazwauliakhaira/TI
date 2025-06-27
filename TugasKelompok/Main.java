/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasKelompok;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>();

        System.out.println("Menu Shape : ");
        System.out.println("1. Create Circle");
        System.out.println("2. Create Rectangle");
        System.out.println("3. Create Square");
        System.out.println("4. Display All Shapes");
        System.out.println("5. Exit");

        while (true) {
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt(); 

            switch (choice) {
                case 1:
                    System.out.println("Buat Circle...");
                    break;
                case 2:
                    System.out.println("Buat Rectangle...");
                    break;
                case 3:
                    System.out.println("Buat Square...");
                    break;
                case 4:
                    System.out.println("Displaying all pada shapes...");
                    break;
                case 5:
                    System.out.println("Exit/Keluar...");
                    scanner.close(); 
                    return; // Keluar dari program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

