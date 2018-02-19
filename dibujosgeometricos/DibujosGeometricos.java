
package dibujosgeometricos;

import javax.swing.JFrame;

/**
 *
 * @author Ivan Jaramillo
 */
public class DibujosGeometricos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame marco = new JFrame("Nuestro Dibujo"); //Crear un nuevo Jframe con nombre 
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cerrar la aplicacion 
        Dibujo PaneldeDibujo = new Dibujo(); //Generar un nuevo dibujo
        marco.add(PaneldeDibujo); //Añadir el nuevo dibujo al marco
        marco.setSize(400, 400); //Tamaño del dibujo
        marco.setVisible(true); //Mostrar el marco
    }
    
}
