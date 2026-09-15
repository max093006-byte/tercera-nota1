package unidad1;
public class ejercicioDatos {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40};
        int sumaTotal = 0;
        int longitudNumeros = numeros.length;
        for (int i = 0; i < longitudNumeros ; i++) {
            sumaTotal += numeros[i];
        }
        float promerdio = (float) sumaTotal / longitudNumeros;
        System.out.println("el promedio de las numeros es: " + promerdio);
    }
}
