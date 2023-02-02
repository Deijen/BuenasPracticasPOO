
package Modelos;

/**
 * Clase que representa una canción
 * @author Diego Posada - Miguel 
 */
public class Cancion { 
    private String titulo; 
    private final int identificador; //El identificador no se puede cambiar. Debe ser final
    private int Fecha;  
    private int duracion; 
    private String genero; 
    private int caratula; // ¿Qué se puede absraer como caratula sin necesidad de insertar imágenes?
    private String descripcion; 

    /**
    *
    */
    public Cancion(String titulo, int identificador, int Fecha, int duracion, String genero, int caratula, String descripcion) {
        this.titulo = titulo;
        this.identificador = identificador;
        this.Fecha = Fecha;
        this.duracion = duracion;
        this.genero = genero;
        this.caratula = caratula;
        this.descripcion = descripcion; 
        
         if(duracion <= 0 || duracion > 10){
            throw new IllegalArgumentException("Duración de la canción inválida.");
        } 
        
        if(identificador <= 0){
            throw new IllegalArgumentException("El identificador de la canción no puede contener número negativos");
        }
    }

    
    

    //getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIdentificador() {
        return identificador;
    }

   

    public int getFecha() {
        return Fecha;
    }

    public void setFecha(int Fecha) {
        this.Fecha = Fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCaratula() {
        return caratula;
    }

    public void setCaratula(int caratula) {
        this.caratula = caratula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
    
    
    /**
    * Método toString para mostrar la información de una canción
    */
    public String toString(){
        return "\n\nTitulo: " + this.titulo +
                "\nIdentificador: " + this.identificador + 
                "\nFecha: " + this.Fecha + 
                "\nDuración: " + this.duracion + " minutos" +
                "\nGénero: " + this.genero + 
                "\nCaratula: " + this.caratula +  
                "\nDescripción: " + this.descripcion;
    }
    
}
