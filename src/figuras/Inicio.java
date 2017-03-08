/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Leidy Torres
 */
public class Inicio {
       final String OPT_ERR_MSG = "Introducir sólo números";
       public Scanner teclado;
            
      /**
     * Imprime menu de figuras
     */
    public void imprimirMenu() {
        System.err.println("Menu ");
        System.out.println("1. Cuadrado ");
        System.out.println("2. Triangulo ");
        System.out.println("3. Circulo ");
        System.out.println("4. Rectangulo");
        System.out.println("0. Salir");
    }

    public int leerRespuesta() {
        Scanner reader = new Scanner(System.in);
        int option = 0;
        try {
            option = reader.nextInt();

        } catch (InputMismatchException e) {
            System.err.println(OPT_ERR_MSG);
        }
        return option;
    }

    /**
     * Metodo que toma las cordenadas del triangulo y llama al objeto para las operaciones
     */
    private void iniciarTriangulo(){
        teclado = new Scanner(System.in);
        double x, y;
        System.out.println("Digite lado x1");
        x = teclado.nextDouble();
        System.out.println("Digite lado y1");
        y = teclado.nextDouble();
        Puntos punto1 = new Puntos(x, y);
        System.out.println("Digite lado x2");
        x = teclado.nextDouble();
        System.out.println("Digite lado y2");
        y = teclado.nextDouble();
        Puntos punto2 = new Puntos(x, y);
        System.out.println("Digite lado x3");
        x = teclado.nextDouble();
        System.out.println("Digite lado y3");
        y = teclado.nextDouble();
        Puntos punto3 = new Puntos(x, y);
        Triangulo triangulo  = new Triangulo (punto1, punto2, punto3);
        triangulo.IdentificarTriangulo();
        triangulo.darResultados();
    }
    
     /**
     * Metodo que toma las cordenadas del Circulo y llama al objeto para las operaciones
     */
    private void iniciarCirculo(){
        teclado = new Scanner(System.in);
        double x, y, radio;
        System.out.println("Digite lado x1");
        x = teclado.nextDouble();
        System.out.println("Digite lado y1");
        y = teclado.nextDouble();
        Puntos punto1 = new Puntos(x, y);
        System.out.println("Digite lado x2");
        x = teclado.nextDouble();
        System.out.println("Digite lado y2");
        y = teclado.nextDouble();
        Puntos punto2 = new Puntos(x, y);
        System.out.println("Digite el radio");
        radio = teclado.nextDouble();
        Circulo circulo  = new Circulo (punto1, punto2);
        circulo.calculaArea();
        circulo.calculaPerimetro();
        circulo.darResultados();

    }
    
    
    public void seleccionaFigura(int opcion) {
        Scanner reader = new Scanner(System.in);
        Inicio inicio = new Inicio();
        switch (opcion) {
            case 1:
                Cuadrado cuadrado = new Cuadrado();
                System.out.println("Introduzca el valor del lado A");
                cuadrado.setLadoA(reader.nextInt());
                System.out.println("Introduzca el valor del lado B");
                cuadrado.setLadoB(reader.nextInt());
                System.out.println("Area: " + cuadrado.calculaArea());
                System.out.println("Perimetro: " + cuadrado.calculaPerimetro());
                break;
            case 2:
                inicio.iniciarTriangulo();
                
                break;
            case 3:
                inicio.iniciarCirculo();
                break;
            case 4:
                Rectangulo rectangulo = new Rectangulo();
                System.out.println("Introduzca el valor de la base");
                rectangulo.setBase(reader.nextDouble());  
                System.out.println("Introduzca el valor de la alura");
                rectangulo.setAltura(reader.nextDouble());
                System.out.println("Area: " + rectangulo.calculateArea());
                System.out.println("Perimetro: " + rectangulo.calculaPerimetro());
                break;
            default:
                System.out.println("Ingrese una opción válida");
                break;
        }
    }

    public void correr() { 
            System.out.println("¿Quieres comenzar a trabajar?");
            imprimirMenu();
                               
    }

   
    
}

