/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acueducto;

import Clases.Cliente;
import java.util.LinkedList;

/**
 *
 * @author herna
 */
public class Acueducto {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creacion de la lista para guardar los datos
        LinkedList<Cliente> Cliente = new LinkedList<Cliente>();
        //Se crea un nueov cliente
        Cliente cli1= new Cliente();
        //Se insertar datos en el objeto cliente
        cli1.setIdentificacion(123456);
        cli1.setNombres("hernan");
        cli1.setApellidos("cely");
        cli1.setDirecion("trans 13 # 10b -51");
        cli1.setEstrato(1);
        cli1.agregar_medidor("15-0001");
        cli1.setZona("Rural");
        //Se agregan datos al linkedlist
        Cliente.add(cli1);
        //Impresion de los datos guardados
        System.out.println("Identificacion: "+Cliente.get(0).getIdentificacion());
        System.out.println("Nombre: "+Cliente.get(0).getNombres());
        System.out.println("Apellidos: "+Cliente.get(0).getApellidos());
        System.out.println("Direccion: "+Cliente.get(0).getDirecion());
        System.out.println("Zona: "+Cliente.get(0).getZona());
        System.out.println("Estrato: "+Cliente.get(0).getEstrato());
        System.out.println("Tipo Medidor: "+Cliente.get(0).getMedidor().getTipo());
        System.out.println("Serial Medidor: "+Cliente.get(0).getMedidor().getSerial());
        
        
    }
    
}
