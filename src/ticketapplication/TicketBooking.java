/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticketapplication;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author yonas
 */
public class TicketBooking implements TicketInterface {
    private ArrayList<Tickets>TicketList;
    
    TicketBooking(){
    TicketList=new ArrayList<>();
    }
    
    @Override
    public int size(){
    return TicketList.size();
    }
    
    @Override
    public boolean isEmpty(){
    return TicketList.isEmpty();
    }
    
    
    @Override
    public Object dequeue(){
    
        if (isEmpty()){
        
            System.out.println("the queue is empty");    
            return null;
            
        }else{
         return TicketList.remove(0);
        }
       
    }
    
    
   @Override
   public void enqueue(Object newTicket){
       TicketList.add((Tickets) newTicket);
 
   }
   
   @Override
   public String display(){
    String str="";
     Iterator it;
     it=TicketList.iterator();
        if(isEmpty()){
        str= str.concat("queue is empty");
        }else{
         while(it.hasNext()){
         //it.next();
         str=str.concat(it.next().toString());
         str=str.concat("");
         }
     }
     return str;
     
     }
   @Override
    public Tickets searchTicketByName(String name) {
    for (Tickets ticket : TicketList) {
        if (ticket.getName().trim().equalsIgnoreCase(name.trim())) {
            return ticket;
        }
    }
    return null;
}
    }


   

