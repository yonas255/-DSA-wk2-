/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticketapplication;

/**
 *
 * @author yonas
 */
public class Tickets {
    private String Name;
    private int TicketNumber;
    private String MoblieNumber;

    public Tickets(String Name, int TicketNumber, String MoblieNumber) {
        this.Name = Name;
        this.TicketNumber = TicketNumber;
        this.MoblieNumber = MoblieNumber;
    }

   
    public String getName() {
        return Name;
    }

    public int getTicketNumber() {
        return TicketNumber;
    }

    public String getMoblieNumber() {
        return MoblieNumber;
    }
    

 @Override
    public String toString() {
        return "Tickets{" + "Name=" + Name + ", TicketNumber=" + TicketNumber + ", MoblieNumber=" + MoblieNumber + '}';
    }


}
