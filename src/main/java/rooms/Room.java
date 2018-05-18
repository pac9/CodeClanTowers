package rooms;

import java.util.ArrayList;
import guests.Guest;

public class Room {

    private int capacity;
    private ArrayList<Guest> guest;

    public Room(int capacity){
        this.capacity = capacity;
        this.guest = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfGuests() {
        return this.guest.size();
    }

    public void addGuest(Guest guest){
        this.guest.add(guest);
    }

}


