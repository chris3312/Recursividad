/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHRISTIAN ISIDORO
 */
public class ejercicio_recursividad_DDR_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 //se declaran las variables       
int base = 10;
int exponente = -2;
System.out.println(potencia(base, exponente)); //manda a imprimir
}
public static double potencia(int base, int exponente) { //se crea un metodo llamado potencia
if (exponente == 0) { //caso base
return 1; //10^0 = 1
} else if (exponente == 1) { //caso base
return base; //10^1 = 10
} else if (exponente < 0) { //Exponente negativo
return potencia(base, exponente + 1) / base;
} else { //Exponente positivo
return base * potencia(base, exponente - 1);
}

    }
    
}
