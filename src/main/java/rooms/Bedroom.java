package rooms;


public class Bedroom extends Room {

    private int roomNumber;
    BedroomType bedroomType;
    private double nightlyRate;


    public Bedroom (int roomNumber, BedroomType bedroomType, double nightlyRate) {
        super(bedroomType.getValue());
        this.roomNumber = roomNumber;
        this.bedroomType = bedroomType;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public BedroomType getBedroomType(){
        return this.bedroomType;
    }

    public double getNightlyRate(){
        return this.nightlyRate;
    }
}
