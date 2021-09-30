package Maktab58_HW1_ElhamAmini.nine;

public class Employee {
    private int employeeId;
    private String name;
    private String family;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public void confirmTicket(Ticket ticket) {
        ticket.setConfirmBy(this);
        ticket.setConfirmed(true);
    }

    public void rejectTicket(Ticket ticket) {
        ticket.setRejected(true);
    }
}
