package unidad1;   
 public class ejercicioRepaso {
    public static void main(String[] args) {
    float notaEstudiante1 = 4.2f;
    float notaEstudiante2 = 3.5f;
    float notaEstudiante3 = 2.9f;
    float notaEstudiante4 = 3.7f;
    float notaEstudiante5 = 3.8f;

    float[] notas = new float[5];
    notas[0] = 4.2f;
    notas[1] = 3.5f;
    notas[2] = 2.9f;
    notas[3] = 3.7f;
    notas[4] = 3.8f;

    for (int i = 0; i < notas.length; i++) {
        System.out.println(notas[i]);
    
    }
    System.out.println(notas[4]);

    int[] numeros = {18, 24, 32, 4, 2};
    //ultimo  indice = tamaño -1
    int longitud = numeros.length;
    int ultimoIndice = longitud - 1;
    System.out.println("longitud: " + longitud);
    System.out.println("último índice: " + ultimoIndice);
    }
 }