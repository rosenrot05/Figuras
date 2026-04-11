/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
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
public class IntegracionTest {
    
    @Test
    public void flujoCompleto() {
        ControladorRectangulo c = new ControladorRectangulo();

        // Crear
        c.crearRectangulo(0, 0, 2, 2);

        // Escalar
        c.escalar(2);

        // Mover
        c.mover(3, true);

        // Verificar punto
        String resultado = c.verificar(4, 1);

        // Área final
        String area = c.mostrarArea();

        assertTrue(resultado.contains("dentro"));
        assertTrue(area.contains("16"));
    }
}