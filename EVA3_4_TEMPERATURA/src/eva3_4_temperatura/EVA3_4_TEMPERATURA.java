
package eva3_4_temperatura;

import java.util.Scanner;

public class EVA3_4_TEMPERATURA {
    
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int valor;
        double temp, resu;
        do{
        imprimirMenu();
        valor = captu.nextInt();
        
        switch(valor){
            case 1:
                System.out.println("F a C");
                System.out.println("Ingresa los grados en F");
                temp = captu.nextDouble();
                
                resu = convertirFarCel(temp);
                
                System.out.println("El resultado es: " + resu + "C");
                break;
            case 2:
                System.out.println("C a K");
                System.out.println("Ingresa los grados en C");
                temp = captu.nextDouble();
                
                resu = convertirCelKel(temp);
                
                System.out.println("El resultado es: " + resu + "K");
                break;
            case 3:
                System.out.println("F a K");
                System.out.println("Ingresa los grados en F");
                temp = captu.nextDouble();
                
                resu = convertirFarKev(temp);
                
                System.out.println("El resultado es: " + resu + "F");
                break;
            case 4:
                break;
        }
        }while(valor != 4);
        
        
        
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