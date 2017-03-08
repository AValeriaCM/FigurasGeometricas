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
public class Triangulo {
    final String EQUILATERO = "Equilatero";
    final String ISOSCELES = "Isosceles";
    final String ESCALENO = "Escaleno";
    
    
     /**
     * Atributo que contiene la cordenada x1 y1
     */
    private Puntos punto1;
    
    /**
     * Atributo que contiene la cordenada x2 y2
     */    
    private Puntos punto2;

    /**
     * Atributo que contiene la cordenada x3 y3
     */        
    private Puntos punto3;
    
    
    /**
     * Guarda el perimetro del triangulo
     */
    private double perimetro;

    public Triangulo(Puntos punto1, Puntos punto2, Puntos punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    
    
    
    /**
     * Metodo que da los resultados del triangulo
     */
    public void darResultados() {
        if(isTriangulo()) {
            System.out.println("Lado1: " + darLado1());
            System.out.println("Lado2: " + darLado2());
            System.out.println("Lado3: " + darLado3());
            System.out.println("Perimetro: " + darPermietro());
            System.out.println("Area: " + darArea());
        } else {
            System.out.println("No es un triangulo");
        }    
    }
    
    /**
     * Retorna verdadero si es un triangulo Falso contrario
     * @return 
     */
    private boolean isTriangulo() {
        return true;
    }
    
    /**
     * Retorma longitud de lado AB
     * @return 
     */
    private double darLado1(){
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorma longitud de lado BC
     * @return 
     */
    private double darLado2(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorma longitud de lado CA
     * @return 
     */
    private double darLado3(){
        double auxiliarX = Math.pow(punto1.getX() - punto3.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - punto3.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * 
     * Metodo que retorna el perimetro del triangulo
     * @return Perimetro
     */
    private double darPermietro() {        
        this.perimetro =  darLado1() + darLado2() + darLado3();
        return this.perimetro;
    }
    
    /**
     * Metodo que retorna el area de un trianguo
     * @return  Area
     */
    private double darArea() {
        double semiperimetro = this.perimetro / 2;
        double lado1 = semiperimetro - darLado1();
        double lado2 = semiperimetro - darLado2();
        double lado3 = semiperimetro - darLado3();
        
        double area =  Math.sqrt((semiperimetro * lado1 * lado2 * lado3));
        return area;
    }
    



    /**
     *Shows the name of the type of triangle
     * @param tipo /*Flag for type/
     */
    public void ImprimirTipo(int tipo) {
        switch (tipo) {
            case 1:
                System.out.println("Triangulo: "+EQUILATERO);
                break;
            case 2:
                System.out.println(ISOSCELES);
                break;
            case 3:
                System.out.println(ESCALENO);
                break;
        }
    }

    /**
     *Determina el tipo de Triangulo
     *
     */
    protected void IdentificarTriangulo() {
        if ((darLado1() == darLado2()) && darLado2() == darLado3()) {
            ImprimirTipo(1);
        } else {
            if (darLado1() == darLado2()
                    || darLado1() == darLado3()
                    || darLado2() == darLado3()) {
                ImprimirTipo(2);
            }else{
                if (darLado1() != darLado2() ||
                        darLado1() != darLado3() ||
                        darLado3() != darLado2()){
                    ImprimirTipo(3);
                }
            }
        }
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

    /**
     * Retorna la cordenada x3 y3
     * @return 
     */    
    public Puntos getPunto3() {
        return punto3;
    }

    /**
     * Modifica la cordenada x3 y3
     * @param punto3
     */    
    public void setPunto3(Puntos punto3) {
        this.punto3 = punto3;
    }
    
}
