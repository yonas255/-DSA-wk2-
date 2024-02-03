/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ticketapplication;

import java.util.Scanner;

/**
 *
 * @author yonas
 */
public class TicketApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TicketInterface Tic =new TicketBooking();
    
    Scanner myobj= new Scanner(System.in);
    
    
    while(true){
    System.out.println("______________welcome to Ticket Booking center!________________");
    System.out.println("Please Choose one of these option");
    System.out.println("1. enqueing tickets ");  
    System.out.println("2. dequeing tickets ");
    System.out.println("3. Dispaly all tickets ");
    System.out.println("4. Search a Ticket By the Name ");
    System.out.println("5. Exit ");
    
    	String choose =  myobj.next();
            
        switch(choose){
            case "1":
                    
                    System.out.println("Enter the Name for the new Ticket:");
                    String name = myobj.nextLine();
                     myobj.nextLine(); // Consume newline
                    System.out.println("Enter the Ticket Number for the new Ticket:");
                    int ticketNumber = myobj.nextInt();
                    myobj.nextLine(); // Consume newline
                    System.out.println("Enter the Mobile Number for the new Ticket:");
                    String mobileNumber = myobj.nextLine();

                    Tickets newTicket = new Tickets(name, ticketNumber, mobileNumber);
                    Tic.enqueue( newTicket);
                    System.out.println("Ticket Enqueued successfully!");
                    break;  
                    
            case "2":   
                    
                Object dequeueTic  = Tic.dequeue();
                   if(dequeueTic != null){
                       System.out.println("Ticket dequeued"+ dequeueTic );
                   }
                    break;   
                    
            case "3":
               System.out.println(Tic.display());
                
            break; 
            
            case "4":
                
             System.out.println("Enter the name you wish to search: ");
            String searchName = myobj.nextLine(); // Consume newline
             myobj.nextLine(); // Consume newline
            Tickets foundTicket = Tic.searchTicketByName(searchName);

            if (foundTicket != null) {
                System.out.println("Ticket found: " + foundTicket.toString());
            } else {
                System.out.println("Ticket not found");
            }
            break;

                
                case"5":
                    System.exit(0);  
                break;
                	
                default:System.out.println ("ivalid option please enter  1 up to 5");// default to run code if there is no case match

        }
    
    
    }
    } 
}
