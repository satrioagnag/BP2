/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptop;

/**
 *
 * @author Hewlwtt-Packard
 */
public class Main {
   public static void main(String[] args) {
        StaticJava object1 = new StaticJava();
        StaticJava object2 = new StaticJava();
        object1.x=10;
        System.out.println(object1.x);
        object2.x=5;
        System.out.println(object1.x);
        System.out.println(object1.x);
        object1.y=20;
        object2.y=30;
        System.out.println(object1.y);
        System.out.println(object2.y);
        //object1.z=100;
        //System.out.println(object1.z);
    } 
}
