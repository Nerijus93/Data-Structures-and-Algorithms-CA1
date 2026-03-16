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
public class StackADT {
    
    //ArrayList used as stack storage
    private ArrayList<String> stack = new ArrayList<>();
    
    //push action onto stack
    public void push(String action) {
        stack.add(action);
    }
    
    //Pop will remove last action
    public String pop() {
        if(stack.isEmpty()) {
            return null;
        }
        //To remove last item
        return stack.remove(stack.size() -1);
    }
    
    //Peek will returns last action without removing it
    public String peek() {
        if(stack.isEmpty()) {
            return null;
        }
        return stack.get(stack.size() -1);
    }
}
