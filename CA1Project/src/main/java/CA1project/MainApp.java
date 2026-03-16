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
public class MainApp {

    public static void main(String[] args) {

        // Create data structures
        SinglyLinkedList bookingList = new SinglyLinkedList();
        QueueADT waitingQueue = new QueueADT();
        StackADT actionStack = new StackADT();

        // Create vehicles
        Vehicle v1 = new Vehicle(1, "John", "Car");
        Vehicle v2 = new Vehicle(2, "Thom", "Bike");
        Vehicle v3 = new Vehicle(3, "Bob", "Car");

        // Create bookings
        Booking b1 = new Booking(101, "A1", v1);
        Booking b2 = new Booking(102, "B2", v2);

        // CREATE (Insert bookings)
        bookingList.create(b1);
        bookingList.create(b2);

        System.out.println("---- All Bookings ----");
        bookingList.read();

        // UPDATE
        bookingList.update(101);

        System.out.println("\n---- After Update ----");
        bookingList.read();

        // DELETE
        bookingList.delete(102);

        System.out.println("\n---- After Delete ----");
        bookingList.read();

        // Queue test
        waitingQueue.enqueue(v1);
        waitingQueue.enqueue(v2);
        waitingQueue.enqueue(v3);

        System.out.println("\n---- Waiting Queue ----");
        waitingQueue.display();

        waitingQueue.dequeue();

        System.out.println("\n---- Queue After Dequeue ----");
        waitingQueue.display();

        // Stack test
        actionStack.push("Booking Created");
        actionStack.push("Booking Updated");

        System.out.println("\nLast Action: " + actionStack.peek());

        actionStack.pop();

        System.out.println("After Undo: " + actionStack.peek());

        // Launch GUI
        new ParkingGUI().setVisible(true);
    }
}

