/**
 * Ejercicio 4
 * El ejecutable para la creacion de un objeto de la clase Alumno,envia un mensaje al metodo setNota1, setNota2 y
 * a el metodo mostrar.
 * Los datos ingresan por argumento de main()
 * 
 * @author Frowein Hugo Daniel
 * @param args[0] numero de libreta universitaria
 * @param args[1] nombre
 * @param args[2] apellido
 * @param args[3] nota1
 * @param args[4] nota2
 * 
 */
public class ejer4{
public static void main (String [] args){
int lu = Integer.parseInt(args[0]);
double nota1 = Double.parseDouble(args[3]);
double nota2 = Double.parseDouble(args[4]);

Alumno estudiante = new Alumno(lu, args[1], args[2]) ;
estudiante.setNota1(nota1);
estudiante.setNota2(nota2);
estudiante.mostrar();
}
}
 