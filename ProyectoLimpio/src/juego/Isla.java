package juego;

import java.awt.Color;
import java.awt.Image;

import entorno.Entorno;

public class Isla {
	private double x,y;
	private double bordeAbajo;
	private double bordeArriba;
	private double bordeDerecho;
	private double bordeIzquierdo;
	private double escala;
	private double ancho;
	private double alto;
	private Image imagen;
	Entorno e;
	
	
	public Isla(double x, double y,Entorno e) {
		
		this.x = x;
		this.y = y;
		this.e=e;
		imagen=entorno.Herramientas.cargarImagen("plataforma.png");
		this.escala=0.05;
		this.alto = imagen.getHeight(null)* escala;
		this.ancho = imagen.getWidth(null)*escala; 
		
	}
	
//GETTERS Y SETTERS 

    
    public double getBordeArriba(){
    	return this.y - (this.alto / 2);
    }
    
    public double getBordeAbajo(){
    	return this.y + (this.alto / 2);
    }
    
    public double getBordeDerecho() {
    	return this.x + (this.ancho / 2);
    }
    
    public double getBordeIzquierdo() {
    	return this.x - (this.ancho / 2);
    }
    
	public double getX() {
		return this.x;
	}
 
	public double getY() {
		return this.y;
	}
	
	public double getAncho() {		
		return this.ancho;
	}

	public double getAlto() {
		return this.alto;
	}
		
	public void mostrar() {
		this.e.dibujarImagen(imagen, x, y, 0, escala);
	}
	
}
	
   