
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

    public boolean contiene(int x, int y) {
        return (x >= Math.min(x1, x2) && x <= Math.max(x1, x2) &&
                y >= Math.min(y1, y2) && y <= Math.max(y1, y2));
    }

    // SOBRECARGA (polimorfismo)
    public void escalar(int factor) {
        x2 = x1 + (x2 - x1) * factor;
        y2 = y1 + (y2 - y1) * factor;
    }

    public void escalar(int fx, int fy) {
        x2 = x1 + (x2 - x1) * fx;
        y2 = y1 + (y2 - y1) * fy;
    }

    public void moverHorizontal(int unidades) {
        x1 += unidades;
        x2 += unidades;
    }

    public void moverVertical(int unidades) {
        y1 += unidades;
        y2 += unidades;
    }
    public int getX1() { return x1; }
    public int getY1() { return y1; }
    public int getX2() { return x2; }
    public int getY2() { return y2; }
}

