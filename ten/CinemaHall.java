package Maktab58_HW1_ElhamAmini.ten;

public class CinemaHall {
    private int id;
    private int numberOfSeats;
    private int length;
    private int width;
    private CinemaScreens screens;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public CinemaScreens getScreens() {
        return screens;
    }

    public void setScreens(CinemaScreens screens) {
        this.screens = screens;
    }
}
