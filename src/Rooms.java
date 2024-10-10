import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Rooms {
    private int number;
    private int bedsCount;
    private boolean isBalcony;
    private boolean isSeaview;
    private int price;

    public Rooms (int number, int bedsCount, boolean isBalcony, boolean isSeaview, int price){
        this.number = number;
        this.bedsCount = bedsCount;
        this.isBalcony = isBalcony;
        this.isSeaview = isSeaview;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBedsCount() {
        return bedsCount;
    }

    public void setBedsCount(int bedsCount) {
        this.bedsCount = bedsCount;
    }

    public boolean isBalcony() {
        return isBalcony;
    }

    public void setIsBalcony(boolean isBalcony) {
        this.isBalcony = isBalcony;
    }

    public boolean isSeaview() {
        return isSeaview;
    }

    public void setIsSeaview(boolean isSeaview) {
        this.isSeaview = isSeaview;
    }

    public void setBalcony(boolean balcony) {
        isBalcony = balcony;
    }

    public void setSeaview(boolean seaview) {
        isSeaview = seaview;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

