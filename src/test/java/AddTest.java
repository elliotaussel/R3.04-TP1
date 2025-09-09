import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddTest {
    
    @Test
    public void testAddSimple() {
        assertEquals(8, Add.add(2, 6));
    }
    
    @Test
    public void testAddNegatif() {
        assertEquals(-8, Add.add(-3, -5));
    }
    
    @Test
    public void testAddZero() {
        assertEquals(5, Add.add(0, 5));
    }
    
    @Test
    public void testAddDoubleZero() {
        assertEquals(0, Add.add(0, 0));
    }
}
