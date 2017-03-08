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
public class Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Inicio inicio = new Inicio();
        int opcion = 1;
        do{
            inicio.correr();
            opcion = inicio.leerRespuesta();
            if(opcion !=0){
                inicio.seleccionaFigura(opcion);
            }
        }while(opcion!=0);
        
        // TODO code application logic here
    }
    
}
