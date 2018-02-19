
package dibujosgeometricos;

/**
 *
 * @author Ivan Jaramillo
 */
public class Recta {
    private Punto puntoIni; //Punto inicial de la clase punto
    private Punto puntoFin; //Punto final de la clase punto

    //Constructor por defecto
    public Recta(){
        
    }
    
    //Contructor personalizado
    public Recta(Punto puntoIni, Punto puntoFin){
        this.puntoIni = puntoIni;
        this.puntoFin = puntoFin;
    }
    //Metodo consulta PuntoInicial
    public Punto getPuntoIni() {
        return puntoIni;
    }

     //Metodo de modificacion puntoincial
    public void setPuntoIni(Punto puntoIni) {
        this.puntoIni = puntoIni;
    }

    //Metodo consulta puntoFianl
    public Punto getPuntoFin() {
        return puntoFin;
    }

    //Metodo modificaicion puntoFinal
    public void setPuntoFin(Punto puntoFin) {
        this.puntoFin = puntoFin;
    }
    
    
    
}
