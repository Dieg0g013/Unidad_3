
package eva3_11_capturar_clientes;

import java.util.Scanner;

public class EVA3_11_CAPTURAR_CLIENTES {
    public static void main(String[] args) {
        String[] clientes = new String [5];
        double[] credito = new double[5];
        
        capturarClientes(clientes, credito);
        System.out.println("CLIENTES");
        imprimir(clientes);
        System.out.print("CREDITO");
        imprimir(credito);
        System.out.print("TODO");
        imprimir(clientes, credito);
    }
    public static void capturarClientes(String[] clientes, double credito[]){
        Scanner captu = new Scanner(System.in);
        for (int i = 0; i < clientes.length; i++){
            System.out.println("Nombre del cliente");
            clientes[i] = captu.nextLine();
            System.out.println("Creditos: ");
            credito[i] = captu.nextDouble();
            captu.nextLine();
        }
    }
    public static void imprimir(String[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("[" + arreglo[i] + "]");
        }
            System.out.println("");
    
}
    
    public static void imprimir(double[] credito){
        for(int i = 0; i < credito.length; i++){
            System.out.println("[" + credito[i] + "]");
        }
            //System.out.println("");
}
     public static void imprimir(String[] arreglo, double[] credito){
        for(int i = 0; i < credito.length; i++){
            System.out.print("[" + arreglo[i] + "]");
            System.out.println("[" + credito[i] + "]");
        }
            System.out.println("");
}
}