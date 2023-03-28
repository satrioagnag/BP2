/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author Hewlwtt-Packard
 */
public class Laptop {
    int ReleaseYear = 1997;
    int Price = 0;
    String CPU = "undefined";
    public static void main(String[] args) {
        Laptop Lenovo = new Laptop();
        Laptop Acer = new Laptop();
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("CPU = " + Lenovo.CPU);
        System.out.println("Price = " + Lenovo.Price);
        System.out.println("Year = " + Lenovo.ReleaseYear);
        
        //modifying attribute
        System.out.println("Modifying attribute");
        System.out.println("Input the CPU type");
        Lenovo.CPU=input.nextLine();
        
        System.out.println("Input the Price");
        Lenovo.Price=input.nextInt();
        
        System.out.println("Input the Release Year");
        Lenovo.ReleaseYear=input.nextInt();
        
        System.out.println("Lenovo");
        System.out.println("CPU = " + Lenovo.CPU);
        System.out.println("Price = " + Lenovo.Price);
        System.out.println("Year = " + Lenovo.ReleaseYear);
    }
}
