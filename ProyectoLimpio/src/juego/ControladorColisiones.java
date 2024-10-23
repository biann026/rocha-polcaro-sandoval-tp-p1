package juego;

import entorno.Entorno;

public class ControladorColisiones {
	
	//COLISION PEP ISLA
    public boolean detectarColisionPepIsla(Pep p, Isla isla) {
        return p.bordeDerecho > isla.bordeIzquierdo && 
               p.bordeIzquierdo < isla.bordeDerecho && 
               p.bordeAbajo >= isla.bordeArriba && 
               p.bordeArriba < isla.bordeAbajo;
    }
    
    //COLISION TORTUGA ISLA
    public boolean chocaronTortuIsla(Tortuga t, Isla isla) {
        return t.bordeDerecho > isla.bordeIzquierdo && 
               t.bordeIzquierdo < isla.bordeDerecho && 
               t.bordeAbajo > isla.bordeArriba && 
               t.bordeArriba < isla.bordeAbajo;
    }
    
    //COLISION GNOMO ISLA
    public boolean detectarColisionGnomoIsla(Gnomo g, Isla isla) {
        return g.bordeDerecho > isla.bordeIzquierdo && 
               g.bordeIzquierdo < isla.bordeDerecho && 
               g.bordeAbajo > isla.bordeArriba && 
               g.bordeArriba < isla.bordeAbajo;
               
    }
    
   // COLISION PEP TORTUGA
    public boolean chocaronPepTortu(Pep p, Tortuga t) {
        return p.bordeDerecho > t.bordeIzquierdo && 
               p.bordeIzquierdo < t.bordeDerecho && 
               p.bordeAbajo > t.bordeArriba && 
               p.bordeArriba < t.bordeAbajo;
    }
    
    //COLISION GNOMO TORTU
    public boolean chocaronGnomoTortu(Gnomo g, Tortuga t) {
        return g.bordeDerecho > t.bordeIzquierdo && 
               g.bordeIzquierdo < t.bordeDerecho && 
               g.bordeAbajo > t.bordeArriba && 
               g.bordeArriba < t.bordeAbajo;
    }
    
    //COLISION PEP GNOMO
    public boolean chocaronPepGnomo(Pep p, Gnomo g) {
        return p.bordeDerecho > g.bordeIzquierdo && 
               p.bordeIzquierdo < g.bordeDerecho && 
               p.bordeAbajo > g.bordeArriba && 
               p.bordeArriba < g.bordeAbajo;
    }
    
    //COLISION TORTUGA DISPARO PEP
    public boolean disparoExitoso(DisparoDePep d, Tortuga t) {
    	return d.bordeDerecho > t.bordeIzquierdo && 
                d.bordeIzquierdo < t.bordeDerecho && 
                d.bordeAbajo > t.bordeArriba && 
                d.bordeArriba < t.bordeAbajo;
    }    
    
    //GNOMO SE SALE DE LOS BORDES
    public boolean seSalioDeLaPantallaGnomo(Gnomo g, Entorno e) {
        return g.bordeDerecho < 0 || 
               g.bordeIzquierdo > e.ancho() || 
               g.bordeAbajo < 0 || 
               g.bordeArriba > e.alto(); 
    }
    
    //TORTUGA SE SALE DE LOS BORDES
    public boolean seSalioDeLaPantallaTortu(Tortuga t, Entorno e) {
        return t.bordeDerecho < 0 || 
               t.bordeIzquierdo > e.ancho() || 
               t.bordeAbajo < 0 || 
               t.bordeArriba > e.alto(); 
    }
    
    //PEP SE SALE DE LOS BORDES
    public boolean seSalioDeLaPantallaPep(Pep p, Entorno e) {
        return p.bordeDerecho < 0 || 
               p.bordeIzquierdo > e.ancho() || 
               p.bordeAbajo < 0 || 
               p.bordeArriba > e.alto(); 
    }
    
    //DISPARO DE PEP SE SALE DE PANTALLA 
    public boolean seSalioDeLaPantallaDisparo(DisparoDePep d, Entorno e) {
        return d.bordeDerecho < 0 || 
               d.bordeIzquierdo > e.ancho() || 
               d.bordeAbajo < 0 || 
               d.bordeArriba > e.alto(); 
    }
}

