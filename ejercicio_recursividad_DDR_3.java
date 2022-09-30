/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHRISTIAN ISIDORO
 */
public class ejercicio_recursividad_DDR_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
int[] array={1,2,3,4,5}; //Creamos un array(conjunto de datos almacenado homogeneo
mostrarArrayRecursivo(array, 0); //Pasamos el array y la posicion donde empieza en este caso 0
}
public static void mostrarArrayRecursivo(int[] array, int indice) //se crea el metodo mostrarArrayRecursivo
{
/*1º forma*/
/*
if (indice == (array.length-1)){
System.out.println(array[indice]);
}else{
System.out.println(array[indice]);
mostrarArrayRecursivo(array, indice+1);
}
*/
/*2º forma*/
if (indice != array.length){
//Mostramos el valor en ese indice ya que array lo puede mostrar en un orden de lista
System.out.println(array[indice]);
//Llamamos recursivamente a la función para que lo imprima en el orden que se coloco
mostrarArrayRecursivo(array, indice+1);
}

    }
    
}
