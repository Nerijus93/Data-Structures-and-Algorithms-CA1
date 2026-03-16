/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA1project;

/**
 *
 * @author ITwork
 */

//Bike class inherits from Vehicle class
public class Bike extends Vehicle {
    
    //Attribute for the bike
    private boolean hasCarrier;
    
    //Constructor with super() calling the parent class constructor
    public Bike(int vehicleID, String ownerName, boolean hasCarrier) {
        super(vehicleID, ownerName, "Bike");
        this.hasCarrier = hasCarrier;
    }
    
    //Getter
    public boolean hasCarrier() {
        return hasCarrier;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Carrier: " + hasCarrier;
    }
}
