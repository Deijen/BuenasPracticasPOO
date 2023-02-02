

package Vista;

import Modelos.Biblioteca;
import Modelos.Cancion;
import javax.swing.JOptionPane; 
//import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Diego Posada - Miguel
 */
public class Vista {

    public static void main(String[] args) {
        
        
        Biblioteca biblioteca = new Biblioteca();
        /**
        Variables para la entrada de información. Hay un código comentado para 
        * recibir los datos por teclado.
        */
        String titulo; 
        int identificador;
        int fecha; 
        int duración;
        String genero; 
        int caratula; 
        String descripcion;
        
        boolean salir = false;
        int opcion;
        do{
        opcion= Integer.parseInt(JOptionPane.showInputDialog(null, "Escoja una opcion: "
                    + "\n1) Crear cancion"
                    + "\n2) Filtrar cancion por género"
                    + "\n3) Filtrar canción por año"
                    + "\n4) Ordenar por fecha"
                    + "\n5) Ordenar por duración"
                    + "\n6) salir") ); 
        
            switch (opcion) {
                case 1:
                    /** 
                     * //Código para solicitar los datos por parámetros. Hacen falta validaciones
                     titulo = JOptionPane.showInputDialog(null, "Ingresa el nombre de la canción"); 
                     identificador = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el identificador de la canción"));
                     fecha = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la fecha de la canción")); 
                     duración = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa ela duración de la canción"));
                     genero = JOptionPane.showInputDialog(null, "Ingresa el género de la canción"); 
                     caratula = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la caratula de la canción")); 
                     descripcion = JOptionPane.showInputDialog(null, "Ingresa la descripción de la canción");
                     Cancion c = new Cancion(titulo, identificador, fecha, duración, genero, caratula, descripcion);
                     if(biblioteca.agregarCancion(c) == true){
                         JOptionPane.showMessageDialog(null, "Canción agregada");
                     //}
                    */
                    
                    Cancion c1 = new Cancion("Cancion 1", 1, 2000, 3, "Rock", 1, "Esta es la canción 1");
                        if(biblioteca.agregarCancion(c1)){
                                System.out.println("Cancion agregada");
                        }
                        else {
                           System.out.println("Ya existe una canción con el identificador"); 
                        }
                    Cancion c2 = new Cancion("Cancion 2", 2, 2010, 2, "Metal", 2, "Esta es la canción 2");
                        if(biblioteca.agregarCancion(c2)){
                                System.out.println("Cancion agregada");
                        } 
                        else {
                           System.out.println("Ya existe una canción con el identificador"); 
                        }
                    Cancion c3 = new Cancion("Cancion 3", 2, 1995, 3, "Rock", 3, "Esta es la canción 3"); 
                        if(biblioteca.agregarCancion(c3)){
                                System.out.println("Cancion agregada");
                        } 
                        else {
                           System.out.println("Ya existe una canción con el identificador"); 
                        }
                    Cancion c4 = new Cancion("Cancion 4", 4, 2000, 5, "HipHop", 1, "Esta es la canción 1");
                        if(biblioteca.agregarCancion(c4)){
                                    System.out.println("Cancion agregada");
                            } 
                        else {
                           System.out.println("Ya existe una canción con el identificador"); 
                        }
                    break; 
                
                case 2: 
                    String filtroGenero; //Variable para filtrar las canciones por genero
        
                    filtroGenero = JOptionPane.showInputDialog("Ingrese el género de la cancion"); 
        
                    biblioteca.filtroGenero(filtroGenero);
                    
                    
                    break; 
                    
                case 3: 
                    int BuscarAño; 
                    
                    BuscarAño = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el año de la canción")); 
                    biblioteca.filtroAño(BuscarAño);
                    break; 
                
                case 4: 
                    biblioteca.ordenarFechas();
                    JOptionPane.showMessageDialog(null, biblioteca.getPlaylist());
                    break; 
                    
                case 5: 
                    biblioteca.ordenarDuracion();
                    JOptionPane.showMessageDialog(null, biblioteca.getPlaylist());
                    break; 
                    
                case 6: 
                    salir = true;
                    break;
                
            }
           
        }while(!salir);
        
    } 
    
    
    
    
    
    
}
