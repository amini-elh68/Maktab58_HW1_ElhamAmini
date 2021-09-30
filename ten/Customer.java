package Maktab58_HW1_ElhamAmini.ten;

public class Customer {
    private int id;
    private String name;
    private String family;
    private Ticket ticket;//array

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void buyTicket(Ticket ticket) {
        this.ticket = ticket;
        ticket.setCustomer(this);
    }

    public void cancelTicket(Ticket ticket) {
        ticket.setCustomer(null);
        this.ticket = null;
    }

}
