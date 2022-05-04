
package proyecto_final;

import controlador.Controlador;
import modelo.Modelo;
import vista.Editar;
import vista.Principal;

public class Proyecto_Final {

    public static void main(String[] args) {

        Modelo modelo = new Modelo();
        Editar edit = new Editar();
        Principal primero = new Principal();
        
        Controlador n = new Controlador(edit, modelo);
        primero.setVisible(true);
        
    }
    
}
