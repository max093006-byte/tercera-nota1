package unidad1;

public class ejercicioClase2 {
    public static void main(String[] args) throws Exception {
        float nota = 4.5f; 

        final float NOTA_EXELENTE = 4.5f;
        final float NOTA_APROBADO = 3.0f;

        if (nota >= NOTA_EXELENTE) {
            System.out.println("Excelente");
        } else if (nota >= NOTA_APROBADO) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
 }
}