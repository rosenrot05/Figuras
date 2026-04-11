/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author rosam
 */
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import Modelo.Rectangulo;

public class PanelDibujo extends JPanel {

    private Rectangulo rectangulo;

   
    public void setRectangulo(Rectangulo r) {
        this.rectangulo = r;
        repaint(); // actualiza el dibujo
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (rectangulo != null) {

            g.setColor(Color.BLUE);

            int x = Math.min(rectangulo.getX1(), rectangulo.getX2());
            int y = Math.min(rectangulo.getY1(), rectangulo.getY2());

            int ancho = Math.abs(rectangulo.getX2() - rectangulo.getX1());
            int alto = Math.abs(rectangulo.getY2() - rectangulo.getY1());

            g.drawRect(x, y, ancho, alto);
        }
    }
}