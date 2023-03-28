/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComputerStation;

/**
 *
 * @author Diablo Scar
 */
public class cPayment {
    private String StaffName;
    private String staffID;
    private cCustomer cust1;
    cPayment(){
        StaffName="Albert";
        staffID="201109";
        cust1=null;
        System.out.println("cPayment Created");
}
    cPayment(String sn, String is){
        StaffName=sn;
        staffID=is;
        cust1=null;
        System.out.println("cPayment Created");        
    }
    public void setCust(cCustomer c) {
        cust1=c;
    }
    public cCustomer getCust() {
        return cust1;
    }
    public void deleteCust() {
        cust1=null;
    }
    public void setName(String sn) {
        StaffName = sn;
    }
    public void setID(String is) {
        staffID = is;
    }
    public String getName(){
        return StaffName;
    }
    public String getID(){
        return staffID;
    }
    public String ToString(){
        return StaffName + " " + staffID;
    }
}
