/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComputerStation;

import java.util.Scanner;

/**
 *
 * @author Hewlwtt-Packard
 */
public class cAppStation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        cCustomer cust1 = new cCustomer();
        cOrder ord1 = new cOrder();
        cPayment payment = new cPayment();
        int pilih, pilih2;
        String idNum, cpun;

        System.out.println("    Welcome To Computer Station");
        System.out.println("     Where your needs is meets.");
        do {
            System.out.println("Main Menu");
            System.out.println("1. Customer Info");
            System.out.println("2. Customer Detail Order");
            System.out.println("3. Payment");            
            System.out.println("4. Exit");
            System.out.print("Input : ");
            pilih = input.nextInt();
            System.out.println(" ");
            switch (pilih) {
                case 1:
                    System.out.println("Customer Info");
                    System.out.println("1. Add Customer Info");
                    System.out.println("2. Delete Customer Info");
                    System.out.println("3. Update Customer Info");
                    System.out.println("4. Print Customer Info");
                    System.out.println("5. Query");
                    System.out.print("Input : ");
                    pilih2 = input.nextInt();
                    switch (pilih2) {
                        case 1:
                            System.out.println("==Add Customer Info==");
                            System.out.print("Add Customer Name = ");
                            String name = input.next();
                            System.out.print("Add Customer ID Number = ");
                            String idNumber = input.next();
                            System.out.print("Add Device ID = ");
                            int deviceID = input.nextInt();
                            cust1 = new cCustomer();
                            cust1.setName(name);
                            cust1.setId(idNumber);
                            cust1.setDevice(deviceID);
                            System.out.println("Data Added");
                            System.out.println(" ");                            
                            break;
                        case 2:
                            System.out.println("==Delete Customer Info==");
                            System.out.print("Enter Customer ID = ");
                            idNum = input.next();
                            if (cust1 != null && cust1.getId().equalsIgnoreCase(idNum)) {
                                System.out.println("Data found");
                                System.out.println("Delete Data ? 1. Yes 2. No");
                                System.out.print("Input = ");
                                pilih2 = input.nextInt();
                                if (pilih2 == 1) {
                                    cust1 = null;
                                    System.out.println("Data deleted");
                                } else {
                                    System.out.println("Cancelling");
                                }
                            } else {
                                System.out.println("Data not found");
                            }
                            break;
                        case 3:
                            System.out.println("==Update Customer Info==");
                            System.out.print("Input ID Customer = ");
                            idNum = input.next();
                            if (true) {
                                System.out.print("New Name = ");
                                String nm = input.next();
                                System.out.print("New ID Customer = ");
                                String id = input.next();
                                System.out.println("Save? 1. Yes 2. No");
                                System.out.print("Input = ");
                                pilih2 = input.nextInt();
                                if (pilih2 == 1) {
                                    cust1.setName(nm);
                                    cust1.setId(id);
                                    System.out.println("Data updated");
                                } else {
                                    System.out.println("Cancelling...");
                                }
                            } else {
                                System.out.println("Data not found");
                            }
                            break;
                        case 4:
                            System.out.println("==Print Data==");
                            if (cust1 != null) {
                                System.out.println("Name Customer : " + cust1.getName());
                                System.out.println("ID Customer : " + cust1.getId());
                                System.out.println("Device ID : " + cust1.getDevice());
                            } else {
                                System.out.println("Data empty");
                            }
                            break;
                        case 5:
                            System.out.println("==Query Data==");
                            if (cust1 != null) {
                                System.out.println(cust1.ToString());
                            } else {
                                System.out.println("Data Empty");
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Customer Order");
                    System.out.println("1. Add Order");
                    System.out.println("2. Delete Order");
                    System.out.println("3. Update Order");
                    System.out.println("4. Print Order");
                    System.out.println("5. Query");
                    System.out.print("Input : ");
                    pilih2 = input.nextInt();
                    switch (pilih2) {
                        case 1:
                            System.out.println("==Add Customer Order==");
                            System.out.print("Add CPU Name = ");
                            String cpu = input.next();
                            System.out.print("Add GPU Name = ");
                            String gpu = input.next();
                            System.out.print("Add Memory Size (MB) = ");
                            int ram = input.nextInt();
                            ord1 = new cOrder();
                            ord1.setCPU(cpu);
                            ord1.setGPU(gpu);
                            ord1.setMemory(ram);
                            System.out.println("Data Added");
                            System.out.println(" ");                            
                            break;
                        case 2:
                            System.out.println("==Delete Customer Order==");
                            System.out.print("Enter CPU name = ");
                            cpun = input.next();
                            if (ord1 != null && ord1.getCPU().equalsIgnoreCase(cpun)) {
                                System.out.println("Data found");
                                System.out.println("Delete Data ? 1. Yes 2. No");
                                System.out.print("Input = ");
                                pilih2 = input.nextInt();
                                if (pilih2 == 1) {
                                    ord1 = null;
                                    System.out.println("Data deleted");
                                } else {
                                    System.out.println("Cancelling");
                                }
                            } else {
                                System.out.println("Data not found");
                            }
                            break;
                        case 3:
                            System.out.println("==Update Customer Order==");
                            System.out.print("Enter CPU name = ");
                            cpun = input.next();
                            if (true) {
                                System.out.print("New GPU Name = ");
                                String gpu2 = input.next();
                                System.out.print("New Memory size (MB) = ");
                                int ram2 = input.nextInt();
                                System.out.println("Save? 1. Yes 2. No");
                                System.out.print("Input = ");
                                pilih2 = input.nextInt();
                                if (pilih2 == 1) {
                                    ord1.setGPU(gpu2);
                                    ord1.setMemory(ram2);
                                    System.out.println("Data updated");
                                } else {
                                    System.out.println("Cancelling...");
                                }
                            } else {
                                System.out.println("Data not found");
                            }
                            break;
                        case 4:
                            System.out.println("==Print Data==");
                            if (cust1 != null) {
                                System.out.println("CPU Name : " + ord1.getCPU());
                                System.out.println("GPU Name : " + ord1.getGPU());
                                System.out.println("Memory Size: " + ord1.getMemory());
                            } else {
                                System.out.println("Data empty");
                            }
                            break;
                        case 5:
                            System.out.println("==Query Data==");
                            if (cust1 != null) {
                                System.out.println(ord1.ToString());
                            } else {
                                System.out.println("Data Empty");
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("==Payment Tab==");                    
                    System.out.println("1. Make Cashier Info");                    
                    System.out.println("2. Update Cashier Info");                    
                    System.out.println("3. Delete Cashier Info");
                    System.out.println("4. Query");                    
                    System.out.print("Input : ");                    
                    pilih2= input.nextInt();
                    switch (pilih2) {
                        case 1:
                            System.out.println("==Make Cashier Info==");                            
                            System.out.println(" ");
                            break;
                        
                    }
                    
                    break;
                case 4:
                    System.out.println("Thank you!");
            }

        } while (pilih != 4);
    }
}
