package unidad1;

import java.util.Scanner;

public class repaso2 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       byte[] edades = new byte[5];
       for (int i = 0; i < edades.length; i++) {
        System.out.println("Ingrese la edad de la persona " + (i + 1) + ": ");
        edades[i] = leer.nextByte();
       }
    
    //for(byte edad : edades) {
       // System.out.println("edad");
       int longitudEdades = edades.length;

       for (int i = 0; i < edades.length; i++) {
            System.out.println("posicion " + i + " : " + edades[i]);
        }
        leer.close();
        //cuantas veces se calcula la longitud
}
}