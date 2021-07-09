import Classes.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private final Person p = new Person("James", "Bond");

    @Test
    void getFname() {
        assertEquals(p.getFname(), "James");
    }

    @Test
    void getLname() {
        assertEquals(p.getLname(), "Bond");
    }
}