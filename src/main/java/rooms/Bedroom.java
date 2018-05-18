package rooms;


public class Bedroom extends Room {

    private int roomNumber;
    BedroomType bedroomType;


    public Bedroom (int roomNumber, BedroomType bedroomType) {
        super(bedroomType.getValue());
        this.roomNumber = roomNumber;
        this.bedroomType = bedroomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public BedroomType getBedroomType(){
        return bedroomType;
    }
}
