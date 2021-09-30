package Maktab58_HW1_ElhamAmini.nine;

public class Customer {
    private int customerId;
    private String name;
    private String family;
    private String nationalId;
    private Ticket ticket;//array

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public void reserveTicket(Ticket ticket) {
        this.ticket = ticket;
        ticket.setCustomer(this);
        ticket.setReserved(true);
    }

    public void deleteTicket() {
        ticket.setReserved(false);
        ticket.setCustomer(null);
        ticket = null;
    }
}
