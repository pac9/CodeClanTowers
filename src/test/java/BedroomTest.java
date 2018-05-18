import guests.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.BedroomType;

import static org.junit.Assert.assertEquals;

public class BedroomTest {


      Bedroom bedroom;
      Guest guest;

      @Before
      public void before() {
          bedroom = new Bedroom(2, BedroomType.DOUBLE, 90.00)
          ;
      }

      @Test
      public void hasRoomNumber(){
          assertEquals(2, bedroom.getRoomNumber());
      }

      @Test
      public void hasBedroomType(){
          assertEquals(BedroomType.DOUBLE, bedroom.getBedroomType());
      }

      @Test
      public void hasCapacity(){
      assertEquals(2, bedroom.getCapacity());}

     @Test
     public void guestListCount(){
     bedroom.addGuest(guest);
     assertEquals(1, bedroom.getNumberOfGuests());}

     @Test
     public void hasNoOfGuests() {
         assertEquals(0, bedroom.getNumberOfGuests());

     }

    @Test
    public void removeGuestListCount(){
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.getNumberOfGuests());}

    @Test
    public void hasNightlyRate(){
          assertEquals(90.00, bedroom.getNightlyRate(), 0.01);
    }

}
