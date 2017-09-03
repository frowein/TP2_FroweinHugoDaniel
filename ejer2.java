/**
 * Ejercicio 2
 * El ejecutable para la creacion de un objeto de la clase Laboratorio y
 * envia un mensaje a el metodo mostrar.
 * 
 * @author Frowein Hugo Daniel
 */
public class ejer2{
    public static void main(String [] args){
        Laboratorio lab = new Laboratorio("Bayer SA", "papaya 2500", "444675829", 10, 24);
        lab.mostrar();
        Laboratorio labs = new Laboratorio("Colgate SA", "Junin 5204", "54-489-6542");
        labs.ajusteDiaEntrega(50);
        labs.ajusteCompraMinima(500);
        labs.mostrar();
    }
}
