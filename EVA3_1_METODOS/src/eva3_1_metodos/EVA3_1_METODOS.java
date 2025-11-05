
package eva3_1_metodos;
public class EVA3_1_METODOS {
    public static void main(String[] args) {
        //INVOCAR EL METODO
        //LLAMADA A PROCEDIMIENTO O FUNCION
        //1. SI QUEREMOS RECUPERAR EL VALOR
        int resu = calcularCuadrado(4);
        System.out.println("El cuadrado de 4 es: " + resu);
        
        //2. USAREL VALOR SIN GUARDARLO
        System.out.println("El cuadrado de 4 es " + calcularCuadrado(4));
        //3. NO ME INTERESA EL RESULTADO
        calcularCuadrado(4);
        
    }
    //MODIFICADORES
    //MODIFICADOR DE ACCESO: public, private, protected,default
    //static --> se necesita para usar nuestros metodos en el main
    //public static
                   //Valor de retorno (tipo de dato)
                     //Nombre del metodo (USAR VERBO)
                       //(LISTA DE PARAMETROS)
                       //CERO O N CANTIDAD
    
    public static int calcularCuadrado(int num){//Encabezado del metodo
        //{} --> Implementacion del metodo( CUERPO DEL METODO)
        int cuadrado = num * num;
        return cuadrado; //regrresamos el resultado
        //ya no se puede poner codigo aqui
        //System.out.println(""); error, no se puede puede poner el codigo fuera del metodo (despues del return) ya que acaba
    }
}
