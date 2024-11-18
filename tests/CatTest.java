import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    Cat cat;
    @BeforeEach
    void setUp() {
        cat = new Cat("Fluffy", 3);
    }

    @AfterEach
    void tearDown() {
        cat = null;
    }

    @Test
    void canSeeCatName() {
        assertEquals("Fluffy", cat.name());
    }

    @Test
    void canSeeCatAge() {
        assertEquals(3, cat.age());
    }
}