import java.util.*;
/**
 * Ejercicio 5
 * 
 * El ejecutable para la creacion de un objeto de la clase Empleado, envia un mensaje al metodo mostrar y
 * imprimir el dato de tipo String retornado por el metodo mostrar linea.
 * Los datos ingresan por teclado
 * 
 * @author Frowein Hugo Daniel
 */
public class ejer5{
    public static void main(String [] args){
        Scanner ingreso = new Scanner(System.in).useLocale(Locale.US);
        ingreso.useDelimiter("\n");
        System.out.println("Ingrese cuil: ");
        long cuil = ingreso.nextLong();
        System.out.println("Ingrese apellido: ");
        String apellido = ingreso.next();
        System.out.println("Ingrese nombre: ");
        String nombre = ingreso.next();
        System.out.println("Ingrese importe: ");
        double importe = ingreso.nextDouble();
        System.out.println("Ingrese año: ");
        int anio = ingreso.nextInt();
        
        Empleado vendedor = new Empleado((long)cuil, apellido, nombre, (double)importe, anio);
        vendedor.mostrar();
        System.out.println("\n" + vendedor.mostrarLinea());
    }
}