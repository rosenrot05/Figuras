
package Controlador;

/**
 *
 * @author rosam
 */
import Modelo.Rectangulo;
import Modelo.Figura;

public class ControladorRectangulo {
    
    private Figura figura; // POLIMORFISMO

    public void crearRectangulo(int x1, int y1, int x2, int y2) {
        figura = new Rectangulo(x1, y1, x2, y2);
    }

    public String mostrarArea() {
        if (figura == null) {
            return "Debe crear el rectangulo primero";
        }
        return "area: " + figura.calcularArea();
    }

    public String verificar(int x, int y) {
        if (figura == null) {
            return "Debe crear el rectangulo primero";
        }

        Rectangulo r = (Rectangulo) figura;

        if (r.contiene(x, y)) {
            return "El punto esta dentro";
        } else {
            return "El punto esa fuera";
        }
    }

    public String escalar(int factor) {
        if (figura == null) return "Debe crear el rectangulo primero";

        Rectangulo r = (Rectangulo) figura;
        r.escalar(factor);

        return "Rectangulo escalado";
    }

    public String escalar(int fx, int fy) {
        if (figura == null) return "Debe crear el rectangulo primero";

        Rectangulo r = (Rectangulo) figura;
        r.escalar(fx, fy);

        return "Rectangulo escalado en X y Y";
    }

    public String mover(int unidades, boolean horizontal) {
        if (figura == null) return "Debe crear el rectangulo primero";

        Rectangulo r = (Rectangulo) figura;

        if (horizontal) {
            r.moverHorizontal(unidades);
            return "Movido horizontalmente";
        } else {
            r.moverVertical(unidades);
            return "Movido verticalmente";
        }
    }
}