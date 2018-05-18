import org.junit.Before;
import org.junit.Test;
import rooms.ConferenceRoom;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("Edinburgh");
    }

    @Test
    public void hasRoomName() {
        assertEquals("Edinburgh", conferenceRoom.getRoomName());
    }

}
