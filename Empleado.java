import java.util.*;
/**
 * Ejercicio 5
 * 
 * @author Frowein Hugo Daniel
 */
public class Empleado{
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;

    /**
    * El constructor recibe 5 datos por parametro para despues utilizar los mutadores
    * para asignar a los atributos.
    * 
    * @param p_cuil numero de cuil de tipo long
    * @param p_apellido apellido de tipo String
    * @param p_nombre nombre de tipo String  
    * @param p_importe importe de tipo double
    * @param p_anio año de ingreso de tipo int
    */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setAnio(p_anio);
        this.setSueldoBasico(p_importe);
    }

    //Inicio de los mutadores
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }

    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }

    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    private void setAnio(int p_anio){
        this.anioIngreso = p_anio;
    }

    private void setSueldoBasico(double p_importe){
        this.sueldoBasico = p_importe;
    }
    //Fin de los mutadores
    
    //Inicio de los observadores
    public long getCuil(){
        return this.cuil;
    }

    public String getApellido(){
        return this.apellido;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getAnio(){
        return this.anioIngreso;
    }

    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    //Fin de los observadores
    
    //Agrego un metodo mas para obtener de manera mas prolija y ordenada el año actual.
    public int year(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy;
    }

    /**
     * El metodo antiguedad determina los años de antiguedad calculando
     * el año actual menos el año de ingreso
     * 
     * @return Año de antuguedad
     */
    public int antiguedad(){
        return this.year() - this.getAnio();
    }
    
    /**
     * El metodo descuento retorna el 2% del suldo basico mas 12
     * 
     * @return descuento del 2% + 12
     */
    private double descuento(){
        return ((2 * this.getSueldoBasico()) / 100) + 12;
    }
    
    /**
     * El metodo adicional calcula un monto adicional segun la antiguedad
     * 
     * @return un porcentaje adicional del sueldo basico
     */
    private double adicional(){
        if(this.getAnio() < 2){
            return (2 * this.getSueldoBasico()) / 100;    
        }else  if(getAnio() >= 2 && getAnio() < 10){
            return (4 * this.getSueldoBasico()) / 100;
        }else{
            return (6 * this.getSueldoBasico()) / 100;
        }
    }
    
    
    /**
     * El metodo sueldo neto devulve la suma del sueldo basico mas el adicional menos el descuento
     * 
     * @return Retorna el sueldo neto
     */
    public double sueldoNeto(){
        return (this.getSueldoBasico() + this.adicional()) - this.descuento();
    }
    
    /**
     * El metodo nomYApe junta en un dato de tipo String al nombre y luego al apellido
     * 
     * @return retorna un String con el nombre y luego el apellido
     */
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }
    
    /**
     * El metodo apeYNom junta en un dato de tipo String al apellido y luego al nombre
     * 
     * @return retorna un String con el apellido y luego el nombre 
     */
    public String apeYNom(){
        return this.getApellido() + ", " + this.getNombre();
    }
    
    /**
     * El metodo mostrar imprime por pantalla los datos de nombre, apellido, numero
     * de cuil, antiguedad y sueldo neto.
     */
    public void mostrar(){
        System.out.println("\nNombre y Apellido: " + this.nomYApe());
        System.out.println("CUIL: " + this.getCuil() + " Antigüedad: " + this.antiguedad() + " años de servicio");
        System.out.println("Sueldo Neto: $" + this.sueldoNeto());
    }
    
    /**
     * El metodo mostrar linea junta los datos de numero de cuil, apellido, nombre y
     * sueldo neto en un dato de tipo String
     * }
     * @return datos del empleado
     */
    public String mostrarLinea(){
        return this.getCuil() + "\t" + this.apeYNom() + " .............. $" + this.sueldoNeto();
    }
    
}