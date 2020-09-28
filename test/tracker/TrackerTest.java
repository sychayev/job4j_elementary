package tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TrackerTest {

    @Test
    public void whenFindByName() {
        Tracker track = new Tracker();
        Item i = new Item();
        track.add(i);
        Item it = new Item();
        it.setName("A");
        String key = it.getName();
        track.findByName(key);
        assertThat(track.findByName(key),is(it.getName()));
    }

}