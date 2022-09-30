/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHRISTIAN ISIDORO
 */
public class ejercicio_recursividad_DDR_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //se crea el metodo main
        
String palabra = "Hola"; //declaracion de la variable
System.out.println(invertirPalabra(palabra, palabra.length()-1));
}
public static String invertirPalabra(String palabra, int longitud){
if(longitud==0){ //valida si la palabra no tiene ninguna letra
return palabra.charAt(longitud)+""; //imprime lo que tenga la palabra
}else{
return palabra.charAt(longitud) + (invertirPalabra(palabra, longitud-1));
}
}
}
   