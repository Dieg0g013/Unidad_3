
package eva3_2_metodos;
public class EVA3_2_METODOS {
    public static void main(String[] args) {
        repetirMensaje("Hola", 5);//No regresa ningun valor
        
    }
    public static void repetirMensaje(String mensaje, int repeticion){
        for (int i = 1; i <= repeticion; i++){
            System.out.println(mensaje);
        }
    }
    
}
