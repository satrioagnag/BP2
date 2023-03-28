/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComputerStation;

/**
 *
 * @author Hewlwtt-Packard
 */
public class cCustomer {
    //data customer
    private String name, idNumber;
    private int deviceID;
    //function
    //setter
    public void setName(String n){
    name = n;
    }
    public void setId(String i){
    idNumber = i;
    }
    public void setDevice(int d){
    deviceID=d;
    }
    
    //getter
    public String getName(){
    return name;
    }
    public String getId(){
    return idNumber;
    }
    public int getDevice(){
    return deviceID;
    }
    //query
    
    public String ToString(){
    return "Customer Data " + name + " : " + deviceID;
    }
    
}
