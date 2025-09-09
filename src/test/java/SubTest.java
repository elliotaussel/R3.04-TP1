import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SubTest {

    @Test
    public void TestNombrePositif() {
        Sub sub = new Sub();
        assertEquals(2, sub.sub(5, 3), "5 - 3 doit être égal à 2");
    }

    @Test
    public void TestNombreNegatif() {
        Sub sub = new Sub();
        assertEquals(-8, sub.sub(-5, 3), "-5 - 3 doit être égal à -8");
    }

    @Test
    public void TestNombreZero() {
        Sub sub = new Sub();
        assertEquals(5, sub.sub(5, 0), "5 - 0 doit être égal à 5");
        assertEquals(-5, sub.sub(0, 5), "0 - 5 doit être égal à -5");
    }
}

