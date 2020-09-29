package tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TrackerTest {

    @Test

    public void whenFindByName() {
        Tracker track = new Tracker();
        Item it = new Item();
        it.setName("A");
        track.add(it);
        String key = it.getName();
        track.findByName(key);
        assertThat(track.findByName(key)[0].getName(),is("A"));
    }
}