/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujosgeometricos;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Ivan Jaramillo
 */
public class Dibujo extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        //Dibujar una casa y un sol
        
        //Dibujar poligono
        Poligono p1 = new Poligono();
        p1.setnPuntos(4);
        int[] coorX = {150,220,220,150};
        int[] coorY = {300,300,230,230};
        p1.setCoordX(coorX);
        p1.setCoordY(coorY);
        g.setColor(Color.CYAN);
        g.fillPolygon(p1.PrepararPligono());
        
        //Dibujar un triangulo
        Poligono triangulo = new Poligono();
        triangulo.setnPuntos(3);
        int[] coorXT = {130,185,240};
        int[] coorYT = {230,180,230};
        triangulo.setCoordX(coorXT);
        triangulo.setCoordY(coorYT);
        g.setColor(Color.ORANGE);
        g.fillPolygon(triangulo.PrepararPligono());
        
        //Dibujar Ovalo(sol)
        Ovalo sol = new Ovalo();
        sol.setX(300);
        sol.setY(50);
        sol.setAlto(50);
        sol.setAncho(50);
        g.setColor(Color.YELLOW);
        g.fillOval(sol.getX(), sol.getY(), sol.getAncho(), sol.getAlto());
    }
}
 