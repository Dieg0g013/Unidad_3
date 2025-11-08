
package eva3_6_arreglos_metodos;
public class EVA3_6_ARREGLOS_METODOS {
    static String[] menu = {"productos", "ventas", "clientes", "salir"};
    static String[] productos = {"burritos", "hamburguesa", "tacos", "montados"};
    static String[] bebidas = {"agua", "coca cola", "sprite", "manzanita", "Limonada"};
    public static void main(String[] args) {
        imprimirArreglo(menu);
        imprimirArreglo(productos);
        imprimirArreglo(bebidas);
    }
    public static void imprimirArreglo(String[]arreglo){
        for(int i = 0; i < arreglo.length; i++){
            System.out.println((i + 1) + ". " + arreglo[i]);
        }
        System.out.println("");
    }
    
}
