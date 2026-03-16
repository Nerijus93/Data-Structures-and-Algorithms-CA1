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
public class SinglyLinkedList implements CRUDInterface {

    //Reference to the first node in the list
    private Node head;

    //Getter
    public Node getHead() {
        return head;
    }

    //Insert method will add a new booking at the end of the list
    public void insert(Booking b) {
        
        //Create new node with booking data
        Node newNode = new Node(b);

        //If list is empty new node will become head
        if (head == null) {
            head = newNode;
        } else {
            //Travers the list to find the last node 
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    //Search booking using bookingID
    public Booking search(int id) {
        Node temp = head;
        while (temp != null) {
            //This will compare booking IDs
            if (temp.data.getBookingID() == id) {
                return temp.data;
            }
            temp = temp.next;
        }
        //Will return null if booking is not found
        return null;
    }

    //Create method from CRUDInterface
    @Override
    public void create(Object obj) {
        insert((Booking) obj);
    }

    //Read method from CRUDInterface
    @Override
    public void read() {
        display();
    }

    //Update method from CRUDInterface
    @Override
    public void update(int id) {
        Booking b = search(id);
        if (b != null) {
            b.setParkingArea("Updated Area");
        }
    }

    //Delete method from CRUDInterface
    @Override
    public void delete(int id) {
        //Checks if list is Empty
        if (head == null) return;

        //If first node matches it will be deleted
        if (head.data.getBookingID() == id) {
            head = head.next;
            return;
        }

        Node temp = head;
        //Traverse list looking for node to be deleted
        while (temp.next != null) {
            if (temp.next.data.getBookingID() == id) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    //Will Display all bookings
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
