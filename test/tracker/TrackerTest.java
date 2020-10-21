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
    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item();
        bug.setName("Bug");
        tracker.add(bug);
        int id = bug.getId();
        Item bugWithDesc = new Item();
        bugWithDesc.setName("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }
}