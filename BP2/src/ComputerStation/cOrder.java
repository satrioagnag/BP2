/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComputerStation;

/**
 *
 * @author Hewlwtt-Packard
 */
public class cOrder {
    //data order
    private String cpu, gpu;
    private int memory;
    
    //function
    //setter
    public void setCPU(String c){
    cpu = c;
    }
    public void setGPU(String g){
    gpu = g;
    }
    public void setMemory(int m){
    memory = m;
    }
    
    
    //getter
    public String getCPU(){
    return cpu;
    }
    public String getGPU(){
    return gpu;
    }
    public int getMemory(){
    return memory;
    }
    
    
    //query
    public String ToString(){
    return "Order detail : " + cpu + gpu + memory;
    }
}
