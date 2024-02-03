/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ticketapplication;



/**
 *
 * @author yonas
 */
public interface TicketInterface {
    public void enqueue(Object newItem);
    public Object dequeue();
    public boolean isEmpty();  
    public int size(); 
    public String display();
    public Tickets  searchTicketByName(String name);
}
