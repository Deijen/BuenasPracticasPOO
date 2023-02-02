
package Modelos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Collections;
/**
 * La clase Biblioteca cumplirá la función de almacenar las canciones por medio 
 * de un ArrayList
 * 
 * @author Diego Posada - Miguel 
 */
public class Biblioteca { 
    public ArrayList<Cancion> playlist; 

  
    /**
    * Cosntructor por defecto que no recibe parámetros pero sirve para 
    * inicializar el arrayList
    */
    public Biblioteca() {
        this.playlist = new ArrayList(); 
    } 

    /**
    * Getters y setters de la clase biblioteca
    */
    public ArrayList<Cancion> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Cancion> playlist) {
        this.playlist = playlist;
    }
    
    
    
    
    /**
    * NOTA: El método se puede reutilizar para buscar una canción en específico 
    * y por medio del método toString, mostrar la info.
    * 
    * Método creado principalmente  para el método agregarCanción. El método 
    * buscarCancion recibe como parámetro el identificador de la canción, luego 
    * busca dentro del arrayList. Si encuentra una coincidencia con el parámetro 
    * y el identificador de la canción, retorna la canción. De lo contrario, 
    * retorna null
    * 
    * @param identificador, identificador de la canción que se quiere buscar
    * @return c, retorna un objeto de tipo Cancion si hay coincidencia
    * 
    */
    public Cancion buscarCancion(int identificador){
        for(Cancion c: playlist){
            if(c.getIdentificador() == identificador){
                return c;
            }    
        }
        return null;
    
    } 
    
            
    /**
    * NOTA: En la vista, colocar el método dentro de un while. Si el método es 
    * falso, repetir hasta que sea verdadero. Cambiar los SystemOutPrintln por 
    * ventanas JOptionPane
    * 
    * El método agregarCancion usa el método buscarCancion para verificar que la
    * canción no esté repetida por medio del identificador, es decir, que si al 
    * buscar la cancion, y el método buscarCancion es igual a null, significa 
    * que la canción no existe y esta es agregada y retorna true. De lo 
    * contrario retorna false. 
    * 
    * @param c, objeto de tipo Cancion 
    * @return true, si la canción es agregada o false si la canción no es 
    * agregada.
    */        
    public boolean agregarCancion(Cancion c){
       
        if(this.buscarCancion(c.getIdentificador()) == null){
          playlist.add(c);
          return true;
        } 
        
        
        else 
            return false;    
    } 
    /**
    * NOTA: Si se usa el return, solo retorna una instancia, no todas. 
    */
    public String filtroGenero(String genero){
        for(Cancion c: playlist){
           if(c.getGenero().equals(genero)){
               JOptionPane.showMessageDialog(null, c.toString());
               //return c.toString();
           }   
        }
      
        return "No se encontró canción";
        
        
    } 
    
    /**
    * NOTA: Si se usa el return, solo retorna una instancia, no todas. 
    * Colocar una excepción 
    */
    public String filtroAño(int año){ 
        for(Cancion c: playlist){
            if(c.getFecha() == año){
                JOptionPane.showMessageDialog(null, c.toString());
            }
        }
        
        return "No se encontró canción";
    } 
    
    
    /**
    * Método para ordenar la playList por duración 
    * Terminar
    */
    public void ordenarDuracion(){
        Collections.sort(playlist, new CompararCancionesDuracion());
    }
    
    
    /**
    * Método para ordenar la playList por fechas
    * Primera versión: Se usa 
    */
    public void ordenarFechas(){ 
      Collections.sort(playlist, new CompararCancionesAño());
      
    } 
    
    
    /**
    * NOTA : Método opcional para mostrar una canción. Parte de Miguel 
    */
    public String mostrarCancion(String nombre){
    
        return "";
    }
    
    
    
}
