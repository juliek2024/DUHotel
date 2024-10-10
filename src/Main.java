import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Guests guest1 = new Guests("Adela Malíková", LocalDate.of(1993,3,13),true);
        Guests guest2 = new Guests("Jan Dvořáček", LocalDate.of(1995,5,5),false);
        guest2.setBirthday(LocalDate.of(1995,4,5));

        List<Guests> guestsList = new ArrayList<>();
        guestsList.add(guest1);
        guestsList.add(guest2);

        System.out.println(Arrays.toString(guestsList.toArray()));

        System.out.println("Jméno: " + guest1.getNameSurname() + ",   Datum narození: " + guest1.getBirthday());

        Rooms room1 = new Rooms(1,1,true,true,1000);
        Rooms room2 = new Rooms(2,1,true,true,1000);
        Rooms room3 = new Rooms(3,3,false,true,2400);

        List<Rooms> roomsList = new ArrayList<>();
        roomsList.add(room1);
        roomsList.add(room2);
        roomsList.add(room3);

        PrintStream stream = new PrintStream(System.out);
        stream.println(true);

        System.out.println(Arrays.toString(roomsList.toArray()));

        System.out.println("Pokoj č. : " + room1.getNumber() + " Počet lůžek: " + room1.getBedsCount() +
                "Balkon: " + room1.setIsBalcony(true) + "Výhled na moře: " + room1.setIsSeaview(true) + "Cena: " +
                room1.getPrice());
        System.out.println("Pokoj č. : " + room2.getNumber() + "" + " Počet lůžek: " + room2.getBedsCount() +
                "Balkon: " + room2.setIsBalcony(true) + "Výhled na moře: " + room2.setIsSeaview(true) + "Cena: " +
                room2.getPrice());
        System.out.println("Pokoj č. : " + room3.getNumber() + " Počet lůžek: " + room3.getBedsCount() +
                "Balkon: " + room3.setIsBalcony(false) + "Výhled na moře: " + room3.setIsSeaview(true) + "Cena: " +
                room3.getPrice());

    }
}