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
public class Circulo {
    protected double radio;
    final double PI = 3.14159;
    protected double perimetro, a;
    protected double area = 0;

     /**
     * Atributo que contiene la cordenada x1 y1
     */
    private Puntos punto1;
    
    /**
     * Atributo que contiene la cordenada x2 y2
     */    
    private Puntos punto2;
   

    public Circulo(Puntos punto1, Puntos punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }
    
    /**
     * 
     * @param radio 
     */

       
    public void setRadio(double radio){        
        this.radio = radio;
    } 
    /**
     * Calcula el area del circulo
     * @return area
     */
    public double calculaArea() {
        a = Math.pow(this.radio,2);
        area = PI*a;
        return area;
    } 
    /**
     * Calcula el primetro del circulo
     * @return Perimetro
     */
    public double calculaPerimetro(){
        this.perimetro = 2*PI*this.radio;
        return this.perimetro;
    }
    
    /**
     * Metodo que da los resultados del triangulo
     */
    public void darResultados() {
            System.out.println("Punto1: " + punto1);
            System.out.println("Punto2: " + punto2);
            System.out.println("Radio: " + radio);
            System.out.println("Perimetro: " + calculaPerimetro());
            System.out.println("Area: " + calculaArea());   
    }
   
    /**
     * Retorna la cordenada x1 y1
     * @return 
     */
    public Puntos getPunto1() {
        return punto1;
    }

    /**
     * Modifica la cordenada x1 y1
     * @param punto1 
     */
    public void setPunto1(Puntos punto1) {
        this.punto1 = punto1;
    }

    /**
     * Retorna la cordenada x2 y2
     * @return 
     */    
    public Puntos getPunto2() {
        return punto2;
    }

    /**
     * Modifica la cordenada x2 y2
     * @param punto2
     */    
    public void setPunto2(Puntos punto2) {
        this.punto2 = punto2;
    }
    
}
