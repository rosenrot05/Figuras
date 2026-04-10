
package Controlador;

/**
 *
 * @author rosam
 */
import Modelo.Rectangulo;

public class ControladorRectangulo {
        private Rectangulo r;

    public void crearRectangulo(int x1, int y1, int x2, int y2) {
        r = new Rectangulo(x1, y1, x2, y2);
    }

    public String mostrarArea() {
        return "Área: " + r.calcularArea();
    }

    public String verificar(int x, int y) {
        if (r.contiene(x, y)) {
            return "El punto esta dentro";
        } else {
            return "El punto NO esta dentro";
        }
    }

    public String escalar(int factor) {
        r.escalar(factor);
        return r.toString();
    }

    public String escalar(int fx, int fy) {
        r.escalar(fx, fy);
        return r.toString();
    }

    public String mover(int unidades, boolean horizontal) {
        r.mover(unidades, horizontal);
        return r.toString();
    }
}
