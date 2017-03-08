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
public class Rectangulo {
    protected double area;
    protected double altura;
    protected double base, perimetro;
    
    /**
     * 
     * @param altura 
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    /**
     * 
     * @param base 
     */
    public void setBase(double base) {
        this.base = base;
    }
    
    /**
     * 
     * Calculate the area of a rectangle
     * @return area
     */
    public double calculateArea(){
        this.area = base*altura; 
        return area;        
    }
     /**
     * Calcula el primetro del rectangulo
     * @return Perimetro
     */
    public double calculaPerimetro(){
       this.perimetro = 2*(this.base + this.altura);
       return this.perimetro;
    }
    
}

