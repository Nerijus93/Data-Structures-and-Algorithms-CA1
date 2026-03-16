/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA1project;

import java.util.ArrayList;

/**
 *
 * Name: Nerijus Kmitas
 * StudentID: x24170232
 *
 */
public class QueueADT {

    //ArrayList used as queue storage
    private ArrayList<Vehicle> queue = new ArrayList<>();

    //Add vehicle to queue
    public void enqueue(Vehicle v) {
        queue.add(v);
    }

    //Remove vehicle from the queue
    public Vehicle dequeue() {
        //Will return null if queue is empty
        if (queue.isEmpty()) {
            return null;
        }
        //Remove first element from the queue(FIFO)
        return queue.remove(0);
    }
    
    //To check or the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    //View next vehicle in the queue
    public Vehicle peek() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.get(0);
    }

    //To display all queue content
    public void display() {
        for (Vehicle v : queue) {
            System.out.println(v);
        }
    }
}
