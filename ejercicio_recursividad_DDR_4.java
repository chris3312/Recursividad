/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHRISTIAN ISIDORO
 */
public class ejercicio_recursividad_DDR_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
int[] array={1,2,3,4,5}; //almacena estos 5 datos en un array
int elementoBuscar=3; //esta estableciendo que elementoBuscar=3 y es un valor entero
int posElementoEncontrado=posicionElementoRecursivo(array, elementoBuscar,0);
System.out.println(posElementoEncontrado);
}
public static int posicionElementoRecursivo(int[] array, int elementoBuscar ,int indice){
if(indice==array.length || array[indice]==elementoBuscar){
if(indice==array.length){ //returna la accion hasta que el elemnto a buscar sea 3 
return -1; //y despues de esa accion se resta uno al valor dando como resultado 2
}else{
return indice; 
}
}else{
return posicionElementoRecursivo(array, elementoBuscar, indice+1);
}

    }
    
}
