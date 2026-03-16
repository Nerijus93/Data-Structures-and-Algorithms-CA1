/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA1project;

/**
 *
 * Name: Nerijus Kmitas
 * StudentID: x24170232
 * 
 */
public class Vehicle {
    //Variables
    protected int vehicleID;
    protected String ownerName;
    protected String vehicleType;
    
    //Constructor
    public Vehicle(int vehicleID, String ownerName, String vehicleType) {
        this.vehicleID = vehicleID;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    
    //Getters
    public int getVehicleID() {
        return vehicleID;
    }
    
    public String getOwnerName() {
        return ownerName;
    }
    
    public String getVehicleType() {
        return vehicleType;
    }
    
    //toString method convert data into readable text
    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleID + ", Owner: " + ownerName + ", Type: " + vehicleType;
    }
    
}
