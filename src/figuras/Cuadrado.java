/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Leidy Torres
 */
public class Cuadrado {
    int ladoA, ladoB, perimetro;
    protected double area = 0;
    
    /**
     * 
     * @param ladoA      
     * @param ladoB
     */
    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    /**
     * 
     * * Calcula el area del cuadrado
     * @return area
     */
    public double calculaArea(){        
        area = Math.pow(this.ladoA,2);
        return area;
    }    
        /**
     * Calcula el primetro del cuadrado
     * @return Perimetro
     */
    public double calculaPerimetro(){
      this.perimetro = ladoA + ladoB;
      return this.perimetro;
    }

}

