
package Modelo;

/**
 *
 * @author rosam
 */
public class Rectangulo extends Figura {
    
    private int x1, y1, x2, y2;

    public Rectangulo(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public int calcularArea() {
        return Math.abs((x2 - x1) * (y2 - y1));
    }

    // ESCALAR SIMPLE
    public void escalar(int factor) {
        x2 = x1 + (x2 - x1) * factor;
        y2 = y1 + (y2 - y1) * factor;
    }

    // ESCALAR SOBRECARGA
    public void escalar(int fx, int fy) {
        x2 = x1 + (x2 - x1) * fx;
        y2 = y1 + (y2 - y1) * fy;
    }

    // MOVER
    public void mover(int unidades, boolean horizontal) {
        if (horizontal) {
            x1 += unidades;
            x2 += unidades;
        } else {
            y1 += unidades;
            y2 += unidades;
        }
    }

    // VERIFICAR PUNTO
    public boolean contiene(int x, int y) {
        int minX = Math.min(x1, x2);
        int maxX = Math.max(x1, x2);
        int minY = Math.min(y1, y2);
        int maxY = Math.max(y1, y2);

        return x >= minX && x <= maxX && y >= minY && y <= maxY;
    }

    @Override
    public String toString() {
        return "Rectangulo: (" + x1 + "," + y1 + ") - (" + x2 + "," + y2 + ")";
    }
}
