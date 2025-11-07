
package eva3_4_temperatura;

import java.util.Scanner;

public class EVA3_4_TEMPERATURA {
    
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        
        
        
    }
    public static double convertirFarCel(double far){
        double resu = (far - 32) / 1.8;
        return resu;
    }
     public static double convertirCelKel(double cel){
        double resu = (cel + 273.15);
        return resu;
     }
     public static double convertirFarKev(double faar){
        double resu = (faar - 32) * 5/9 + 273.15;
        return resu;
     }
     public static void imprimirMenu(){
         System.out.println("Menu de conversion");
         System.out.println("Escoge una");
         System.out.println("1. F a C");
         System.out.println("2. C a K");
         System.out.println("3. F a K");
         System.out.println("4. Cerrar");
     }
}