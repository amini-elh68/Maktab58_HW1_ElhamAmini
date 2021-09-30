package Maktab58_HW1_ElhamAmini.nine;

public class Ticket {
    private int ticketId;
    private Customer customer;
    private long flightDate;//Date
    private int flightNumber;
    private Employee confirmBy;
    private boolean Reserved = false;
    private boolean Confirmed = false;
    private boolean Rejected = false;

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public long getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(long flightDate) {
        this.flightDate = flightDate;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Employee getConfirmBy() {
        return confirmBy;
    }

    public void setConfirmBy(Employee confirmBy) {
        this.confirmBy = confirmBy;
    }

    public void setReserved(boolean reserved) {
        Reserved = reserved;
    }

    public void setConfirmed(boolean confirmed) {
        Confirmed = confirmed;
    }

    public void setRejected(boolean rejected) {
        Rejected = rejected;
    }
}
