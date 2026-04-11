
import Controlador.ControladorRectangulo;
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
public class ControladorRectanguloTest {
    
    @Test
    public void testCrearYArea() {
        ControladorRectangulo c = new ControladorRectangulo();

        c.crearRectangulo(0, 0, 4, 5);

        String resultado = c.mostrarArea();

        assertTrue(resultado.contains("20"));
    }

    @Test
    public void testEscalar() {
        ControladorRectangulo c = new ControladorRectangulo();

        c.crearRectangulo(0, 0, 2, 2);
        c.escalar(2);

        String resultado = c.mostrarArea();

        assertTrue(resultado.contains("16"));
    }

    @Test
    public void testMover() {
        ControladorRectangulo c = new ControladorRectangulo();

        c.crearRectangulo(0, 0, 2, 2);
        c.mover(5, true);

        String resultado = c.verificar(6, 1);

        assertTrue(resultado.contains("dentro"));
    }

    @Test
    public void testVerificarFuera() {
        ControladorRectangulo c = new ControladorRectangulo();

        c.crearRectangulo(0, 0, 2, 2);

        String resultado = c.verificar(10, 10);

        assertTrue(resultado.contains("fuera"));
    }
}
