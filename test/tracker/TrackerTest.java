package tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TrackerTest {

    @Test
    public void whenFindByName() {
        Tracker track = new Tracker();
        Item i = new Item();
        String key = i.getName();
        assertThat(track.findByName(key),is(i.getName()));
    }
}