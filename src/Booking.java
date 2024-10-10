import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private int room;
    private String guest;
    private LocalDate bookedFrom;
    private LocalDate bookedTill;
    private List Guests = new ArrayList<>();

    public Booking(int Number, int guests,
                   LocalDate bookedFrom, LocalDate bookedTill){
        this.room = room;
        this.guest = guest;
        this.bookedFrom = bookedFrom;
        this.bookedTill = bookedTill;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public LocalDate getBookedFrom() {
        return bookedFrom;
    }

    public void setBookedFrom(LocalDate bookedFrom) {
        this.bookedFrom = bookedFrom;
    }

    public LocalDate getBookedTill() {
        return bookedTill;
    }

    public void setBookedTill(LocalDate bookedTill) {
        this.bookedTill = bookedTill;

    }

    public List getGuests() {
            return Guests;
    }

    public void setGuests(List guests) {
            Guests = guests;
    }

}
