/**
 * Ejercicio 3
 * 
 * @author Frowein Hugo Daniel 
 */
public class Cliente{
    private int nroDNI;
    private String apellido;
    private String nombre;
    private double saldo;
    
   /**
    * El constructor recibe 4 datos por parametro para despues utilizar los mutadores
    * para asignar a los atributos.
    * 
    * @param p_dni numero de documento de tipo int
    * @param p_apellido apellido de tipo String
    * @param p_nombre nombre de tipo String
    * @param p_importe importe de tipo double   
    */
   public Cliente(int p_dni, String p_apellido, String p_nombre, double p_importe){
        this.setDNI(p_dni);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.nuevoSaldo(p_importe);
   }

   /**
    * El metodo mostrar imprime en pantalla los datos de nombre, apellido,
    * numero de documento y el saldo
    */
   public void mostrar(){
        System.out.println("- Cliente -");
        System.out.println("Nombre y Apellido: " + this.nomYape() + " (" + this.getDNI() + ")");
        System.out.println("Saldo: $" + this.getSaldo());
   }
   
   //Inicio de los mutadores
   private void setDNI(int p_dni){
        this.nroDNI = p_dni;
   }
   
   private void setApellido(String p_apellido){
        this.apellido = p_apellido;
   }

   private void setNombre(String p_nombre){
        this.nombre = p_nombre;
   }

   private void setSaldo(double p_importe){
        this.saldo = p_importe;
   } 
   //Fin de los mutadores
   
   //Inicio de los observadores
   public int getDNI(){
        return this.nroDNI;
   }

   public String getApellido(){
        return this.apellido;
   }

   public String getNombre(){
        return this.nombre;
   }

   public double getSaldo(){
        return this.saldo;
   }
   //Fin de los observadores

   /**
    * El metodo nuevo saldo asigna un nuevo valor al atributo saldo
    * reemplazando el anterior.
    * 
    * @param p_importe importe de tipo double
    */
   public double nuevoSaldo(double p_importe){
        this.setSaldo(p_importe);
        return this.getSaldo();
   }

   /**
    * El metodo agregar saldo suma al valor actual de atributo saldo
    * el valor ingresado por parametro.
    * 
    * @param p_importe importe a sumar de tipo double
    */
   public double agregarSaldo(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
        return this.getSaldo();
   }

   /**
     * El metodo nomYape junta en un dato de tipo String al nombre y luego al apellido
     * 
     * @return retorna un String con el nombre y luego el apellido
     */
   public String nomYape(){
        return (this.getNombre() + " " + this.getApellido());
   }

   /**
     * El metodo apeYnom junta en un dato de tipo String al apellido y luego al nombre
     * 
     * @return retorna un String con el apellido y luego el nombre 
     */
   public String apeYnom(){
        return (this.getApellido() + " " + this.getNombre());
   }

}