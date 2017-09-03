import java.util.*;
/**
 * Ejecicio 6
 * 
 * El ejecutable para la creacion de un objeto de la clase Punto, envia un mensaje al metodo mostrar,
 * envia un mensaje a desplazar con datos nuevos y imprimir el dato de tipo String retornado 
 * por el metodo coordenada. Los datos ingresan por teclado.
 * 
 * @author Frowein Hugo Daniel
 */
public class ejer6{
    public static void main(String [] args){
        Scanner ingreso = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Ingrese x: ");
        double x = ingreso.nextDouble();
        System.out.println("Ingrese y: ");
        double y = ingreso.nextDouble();
        
        Punto puntito = new Punto(x, y);
        puntito.mostrar();
        System.out.println(puntito.coordenadas());
        
        System.out.println("Ingrese desplazamiento de x: ");
        double dx = ingreso.nextDouble();
        System.out.println("Ingrese desplazamiento de y: ");
        double dy = ingreso.nextDouble();
        
        puntito.desplazar(dx, dy);
        puntito.mostrar();
        System.out.println(puntito.coordenadas());
    }
}