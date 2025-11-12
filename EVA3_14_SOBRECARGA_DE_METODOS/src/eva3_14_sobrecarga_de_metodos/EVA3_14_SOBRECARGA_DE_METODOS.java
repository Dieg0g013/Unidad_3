
package eva3_14_sobrecarga_de_metodos;

import java.util.Scanner;

public class EVA3_14_SOBRECARGA_DE_METODOS {
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int valor;
        double resu, ar, base, altura, base2;
        do{
            menu();
            valor = captu.nextInt();
            switch (valor){
                case 1:
                    System.out.println("Area de un circulo");
                    System.out.println("Introduzca el valor del radio");
                    ar = captu.nextDouble();
                    resu = calcularArea(ar);
                    System.out.println("El area del circulo es: " + resu);
                    break;
                case 2: 
                    System.out.println("Area de un rectangulo");
                    System.out.println("Introduzca el valor de la base");
                    base = captu.nextDouble();
                    System.out.println("Introduzca el valor de la altura");
                    altura = captu.nextDouble();
                    resu = calcularArea(base, altura);
                    System.out.println("El area del rectangulo es : " + resu);
                    break;
                case 3:
                    System.out.println("Area de un trapecio");
                    System.out.println("Introduzca el valor de la base");
                    base = captu.nextDouble();
                    System.out.println("Introduzca el valor de la base de arriba");
                    base2 = captu.nextDouble();
                    System.out.println("Introduzca el valor de la altura");
                    altura = captu.nextDouble();
                    resu = calcularArea(base, base2, altura);
                    System.out.println("El area del trapecio es: " + resu);
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    break;
            }
        }while(valor != 4);
        
        
    }
    public static void menu(){
        System.out.println("Introduza el numero para saber de que figura quieres calcular el area");
        System.out.println("1. Circulo");
        System.out.println("2. Rectangulo");
        System.out.println("3. Trapecio");
        System.out.println("4. Salir");
    }
    public static double calcularArea(double radio){
        return 3.1416 * (radio * radio);
    }
    public static double calcularArea(double base, double altura){
        return base * altura;
    }
    public static double calcularArea(double base, double base2, double altura){
        return ((base + base2) * altura) / 2; 
    }
}
