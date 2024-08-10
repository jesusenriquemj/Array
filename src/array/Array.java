/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

/**
 *
 * @author Enrique
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaracion de un array
        int serie[];
        //otra forma de declarar un array
        int[] serie2;
        
         //crear un array
         //los array unidimensionales se conocen como vectores
         //los elementos de un  array unidimensionales deben ser del mismo tipo
        serie = new int[5];
        //asignar valores
        serie[0]=30;
        serie[1]=50;
        serie[2]=20;
        serie[3]=15;
        serie[4]=serie[2]+serie[3];
        //instrucciones de salida
        System.out.println(serie[4]);
        System.out.println(serie[0]+serie[1]);
        
      
        //declaracion = creacion del array
        int[] edad = new int[5];
          //asignar valores a un array
        edad[0]= 7;
        edad[1]= 3;
        edad[2]=4;
        
        //la inicialización de los valores see pueden hacer al momento de declararlo.
        int calificacion[] = {7,8,9,10};
        
        //instrucciones de entrada
        int[] dia = new int[5];
        dia[0]= Integer.parseInt(System.console().readLine());
        dia[1]= dia[0]+10;
        System.out.println(dia[1]);
        
    }
    
}
