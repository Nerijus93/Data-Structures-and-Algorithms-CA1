/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA1project;

/**
 *
 * @author ITwork
 */

//Car class inherits from Vehicle class
public class Car extends Vehicle {
    
    //Atribute for the car
    private int numberOfDoors;
    
    //Constructor. Super() will call parent class constructor
    public Car(int vehicleID, String ownerName, int numberOfDoors) {
        super(vehicleID, ownerName, "Car");
        this.numberOfDoors = numberOfDoors;
    }
    
    //Getter
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Doors: " + numberOfDoors;
    }
}
