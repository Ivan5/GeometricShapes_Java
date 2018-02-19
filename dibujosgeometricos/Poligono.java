
package dibujosgeometricos;

import java.awt.Polygon;

/**
 *
 * @author Ivan Jaramillo
 */
public class Poligono {
    private int nPuntos;
    private int[] coordX;
    private int[] coordY;

    //Constructor por defecto
    public Poligono() {
    }

    //Constructor personalizado
    public Poligono(int nPuntos, int[] coordX, int[] coordY) {
        this.nPuntos = nPuntos;
        this.coordX = coordX;
        this.coordY = coordY;
    }
    
    //Se genera un objecto de la Clase Polygon de java para poder posterioremente pintarlo
    public Polygon PrepararPligono(){
        return new Polygon(this.getCoordX(),this.getCoordY(),this.getnPuntos());
    }

    public int getnPuntos() {
        return nPuntos;
    }

    public void setnPuntos(int nPuntos) {
        this.nPuntos = nPuntos;
    }

    public int[] getCoordX() {
        return coordX;
    }

    public void setCoordX(int[] coordX) {
        this.coordX = coordX;
    }

    public int[] getCoordY() {
        return coordY;
    }

    public void setCoordY(int[] coordY) {
        this.coordY = coordY;
    }
    
    
}
