import java.time.LocalDate;

public class Guests {
    private String nameSurname;
    private LocalDate birthday;
    private boolean isVacationType;

    public Guests (String nameSurname, LocalDate birthday, boolean isVacationType){
        this.nameSurname = nameSurname;
        this.birthday = birthday;
        this.isVacationType = isVacationType;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public boolean isVacationType() {
        return isVacationType;
    }

    public void setIsVacationType(boolean isVacationType) {
        this.isVacationType = isVacationType;
    }
}
