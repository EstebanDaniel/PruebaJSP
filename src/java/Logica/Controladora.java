
package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlpersis = new ControladoraPersistencia();
    
    public void crearPersona (Persona per){
        controlpersis.crearPersona(per);
    }

 public void eliminarPersona  (int id){
        controlpersis.eliminarPersona(id);
    }
 
     public void eliminarPersona (Persona per){
        controlpersis.eliminarPersona(per);
    }
     
     public List <Persona> traerPersonas(){
         return controlpersis.traerPersonas();
         
     }
    
}
