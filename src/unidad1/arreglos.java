package unidad1;

public class arreglos {  
    public static void main(String[] args) throws Exception {
    
    int[][] matriz = new int[3][3];
    matriz[0][0] = 10;
    matriz[0][1] = 20;
    matriz[0][2] = 30;
    matriz[1][0] = 40;
    matriz[1][1] = 50;
    matriz[1][2] = 60;
    matriz[2][0] = 70;
    matriz[2][1] = 80;
    matriz[2][2] = 90;
    for (int[] filas : matriz){
        for (int numeros : filas){
            System.out.print(numeros + " ");
        }
        System.out.println();
    }
 }  
}