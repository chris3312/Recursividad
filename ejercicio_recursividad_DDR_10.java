/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHRISTIAN ISIDORO
 */
public class ejercicio_recursividad_DDR_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //se crea el metodo main
      //se declaran las variables
int numero = 123;
System.out.println(sumaDigitos(numero)); //se manda a imprimir
}
public static int sumaDigitos(int numero){ //se crea el metodo sumaDigitos
if(numero < 10){ //caso base
return numero; //devuelvo el numero
}else{
return (numero % 10) + sumaDigitos(numero/10); //se toma el digito y llama a la funcion
}
}
}