/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptop;

/**
 *
 * @author Hewlwtt-Packard
 */
class cRuangUjian {
    private cMahasiswa mhs;
    
    public void tambahPeserta(cMahasiswa m){
    mhs = m;
    }
    
    public int getMahasiswa(){
    return mhs.getSKS();
    }
}
