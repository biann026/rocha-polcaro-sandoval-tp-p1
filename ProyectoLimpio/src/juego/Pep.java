package juego;

import java.awt.Image;

import entorno.Entorno;

public class Pep {
	double x,y;
	double bordeAbajo;
	double bordeArriba;
	double bordeDerecho;
	double bordeIzquierdo;
	double escala;	
	double ancho;
	double alto;
	boolean estaApoyado;
	Image imagen;
	Entorno e;
	
	public Pep(double x, double y,Entorno e){
		this.x = x;
		this.y = y;
		this.e=e;
		imagen=entorno.Herramientas.cargarImagen("pepDer.png");
		imagen=entorno.Herramientas.cargarImagen("pepIzq.png");		
		this.bordeAbajo = this.y + (imagen.getHeight(null)/2);
		this.bordeArriba = this.y - (imagen.getHeight(null)/2);
		this.bordeDerecho= this.x + (imagen.getWidth(null)/2);
		this.bordeIzquierdo = this.x - (imagen.getWidth(null)/2);
		this.escala=0.1;
		this.ancho = imagen.getHeight(null)* escala;
		this.alto = imagen.getWidth(null)*escala;
		this.estaApoyado = false;
		
	}
		
	public void mostrar() {
		this.e.dibujarImagen(imagen, x, y, 0, escala);
	}
	
	public void movHorizontal(double n) {
		this.x = this.x-n;
	}
	public void movVertical(double y) {
		if(!estaApoyado) {
			this.y ++;
		}
	}
	
    // que no se salga de los bordes
//    public void actualizarBordes() {
//        this.bordeAbajo = this.y + (imagen.getHeight(null) / 2) * escala;
//       this.bordeArriba = this.y - (imagen.getHeight(null) / 2) * escala;
//        this.bordeDerecho = this.x + (imagen.getWidth(null) / 2) * escala;
//       this.bordeIzquierdo = this.x - (imagen.getWidth(null) / 2) * escala;
//    }

}
