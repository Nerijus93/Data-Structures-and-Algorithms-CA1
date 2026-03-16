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
public class Node {
    //Data stored inside the node
    Booking data;
    //Reference to the next node in the list
    Node next;
    
    //Constructor
    public Node(Booking data) {
        this.data = data;
        this.next = null;
    }
}
