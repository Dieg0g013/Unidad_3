
package eva3_7_paso_parametros;
public class EVA3_7_PASO_PARAMETROS {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Original = " + num);
        incrementar(num);//Se manda una copia del valor almacenado en num
        System.out.println("Despues de incrementar = " + num);
    }
    //Incrementa un entero en 1
    public static void incrementar(int valor){
        valor = valor + 1;
    }
    
}
