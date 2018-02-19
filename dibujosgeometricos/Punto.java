
package dibujosgeometricos;

/**
 *
 * @author Ivan Jaramillo
 */
public class Punto {
    private int pX;
    private int pY;
    //Constructor 
    public Punto(){
        
    }
    
    public Punto(int pX, int pY){
        this.pX = pX;
        this.pY = pY;
    }
    //Metodo que devuelve la coordenada X
    public int getpX(){
        return this.pX;
    }
    //Metodo que devuelve la coordenada y
    public int getpY(){
        return this.pY;
    }
    
    //Añadir coordenada en X
    public void setpX(int pX){
        this.pX = pX;
    }
    
    //Añadir coordenada en y
    public void setpY(int pY){
        this.pY = pY;
    }
}
