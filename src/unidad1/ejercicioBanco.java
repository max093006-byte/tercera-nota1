package unidad1;

public class ejercicioBanco {
    public static void main(String[] args) {

        // variables iniciales
        double saldoInicial = 1000.0;
        double retiroSemanal = 200.0;
        int semanasMes = 4;
        
        // calculo del dienro restante
        double totalRetirado = retiroSemanal * semanasMes;
        double saldoFinal = saldoInicial - totalRetirado;
         
        System.out.println("Dinero restante al final del mes: $" + saldoFinal);
    }
}
