/**
 * Ejercicio 3
 * El ejecutable para la creacion de un objeto de la clase Cliente y
 * envia un mensaje a el metodo mostrar.
 * Los datos ingresan por argumento de main()
 * 
 * @author Frowein Hugo Daniel
 * @param args[0] numero de documento
 * @param args[1] apellido
 * @param args[2] nombre
 * @param args[3] importe
 * 
 */
public class ejer3{
        public static void main(String [] args){
            int dni = Integer.parseInt(args[0]);
            double importe = Double.parseDouble(args[3]);
            //args[1] es el apellido y args[2] son los nombres.
            Cliente client = new Cliente(dni, args[1], args[2], importe);
            client.mostrar();
            client.agregarSaldo(200);
            client.mostrar();
            client.nuevoSaldo(870);
            client.mostrar();
        }
}