
import Modelo.Rectangulo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rosam
 */
public class RectanguloTest {
    
    @Test
    public void testArea() {
        Rectangulo r = new Rectangulo(0, 0, 4, 5);
        assertEquals(20, r.calcularArea(), 0);
    }

    @Test
    public void testContienePunto() {
        Rectangulo r = new Rectangulo(0, 0, 10, 10);

        assertTrue(r.contiene(5, 5));   // dentro
        assertFalse(r.contiene(15, 5)); // fuera
    }

    @Test
    public void testEscalar() {
        Rectangulo r = new Rectangulo(0, 0, 2, 2);

        r.escalar(2);

        assertEquals(16, r.calcularArea(), 0); // 4 * 4
    }

    @Test
    public void testMoverHorizontal() {
        Rectangulo r = new Rectangulo(0, 0, 2, 2);

        r.moverHorizontal(5);

        assertTrue(r.contiene(6, 1));
    }

    @Test
    public void testMoverVertical() {
        Rectangulo r = new Rectangulo(0, 0, 2, 2);

        r.moverVertical(3);

        assertTrue(r.contiene(1, 4));
    }
}
