package unidad1;

public class ejerciciotienda {
    public static void main(String[] args) {

        // Código del ejercicio de la tienda

         double precioCamiseta = 25.0;
        double precioPantalon = 30.0; 

        // aplicacion de un 15 % de descuento 

        double camisetaConDescuento = precioCamiseta * 0.85;
        double pantalonConDescuento = precioPantalon * 0.85;

        //caso 1:precio total de una camiseta y un pantalón

        double totalDosPrendas = camisetaConDescuento + pantalonConDescuento;
        System.out.println("Precio total de ambas prendas: " + totalDosPrendas);

        //caso 2:compra de una segunda con 5% adicional
        double segundacamiseta = camisetaConDescuento * 0.95;
        double granTotal = totalDosPrendas + segundacamiseta;
        System.out.println("Precio total con segunda camiseta: " + granTotal);

    }
}

