
package eva3_3_metodos;

import java.util.Scanner;

public class EVA3_3_METODOS {
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int valor;
        do{
            imprimirMenu();
            valor = captu.nextInt();
            //Manejo de opciones --> Switch
            switch(valor){
                case 1:
                    System.out.println("**Sumar dos numeros**");
                    realizarSuma();
                    break;
                case 2:
                    System.out.println("**Calcular potencia**");
                    realizarPotencia();
                    break;
                case 3:
                    break;
            }
        }while (valor != 4);

    }
    //Imprimir un menu:
    public static void imprimirMenu(){
        System.out.println("Bienvenido al sistema");
        System.out.println("1. Calcular una suma");
        System.out.println("2. Calcular una potencia");
        System.out.println("3. Imprimir un mensaje");
        System.out.println("4. Terminar");
    }
    //
    public static void realizarSuma(){
        Scanner captu = new Scanner(System.in);
        int val1, val2;
        System.out.println("Valor 1:");
        val1 = captu.nextInt();
        System.out.println("Valor 2:");
        val2 = captu.nextInt();
        int resu = sumar(val1, val2);
        System.out.println("La suma es: " + resu);
        
    }
    public static int sumar(int num1, int num2){
        return num1 + num2;
        
    }
    //Calcular una potencia
    public static void realizarPotencia(){
        Scanner captu = new Scanner(System.in);
        int val1, val2;
        System.out.println("Base:");
        val1 = captu.nextInt();
        System.out.println("Exponente:");
        val2 = captu.nextInt();
        
    }
    public static int calcularPotencia(int base, int expo){
        //ciclo --> for
        //acumulador --> multiplicacion
        int potencia = 1;
        for(int i = 1; i <= expo; i++){
            potencia = potencia * base;
        }
        return potencia;
    }
    
}
