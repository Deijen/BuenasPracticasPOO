/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
import java.util.Comparator;
/**
 * Debe ir en otra carpeta. 
 * @author Diego Posada - Miguel
 */
public class CompararCancionesAño implements Comparator<Cancion>{

    @Override
    public int compare(Cancion c1, Cancion c2) {
        if(c1.getFecha()< c2.getFecha()){
            return -1;
        }
        else if(c1.getFecha() < c2.getFecha()){
            return 0;
        }
        else
            return 1;
    
    
    
    }
    
    
}
