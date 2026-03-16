/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA1project;

/**
 *
 * Name: Nerijus Kmitas StudentID: x24170232
 *
 */
public class Booking {

    //Variables
    private int bookingID;
    private String parkingArea;
    private Vehicle vehicle;

    //Constructor
    public Booking(int bookingID, String parkingArea, Vehicle vehicle) {
        this.bookingID = bookingID;
        this.parkingArea = parkingArea;
        this.vehicle = vehicle;
    }

    //Getters
    public int getBookingID() {
        return bookingID;
    }

    public String getParkingArea() {
        return parkingArea;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    //Setter
    public void setParkingArea(String parkingArea) {
        this.parkingArea = parkingArea;
    }

    @Override
    public String toString() {
        return "BookingID: " + bookingID + ", Parking: " + parkingArea + ", " + vehicle.toString();
    }
}
