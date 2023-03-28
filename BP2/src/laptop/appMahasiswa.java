/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptop;

/**
 *
 * @author Hewlwtt-Packard
 */
public class appMahasiswa {
    public static void main(String[] args) {
        cMahasiswa mhs1 = new cMahasiswa();
        System.out.println("SKS : " + mhs1.getSKS());
        
        cRuangUjian R202 = new cRuangUjian();
        R202.tambahPeserta(mhs1);
        System.out.println("SKS : " + R202.getMahasiswa());
    }
}
