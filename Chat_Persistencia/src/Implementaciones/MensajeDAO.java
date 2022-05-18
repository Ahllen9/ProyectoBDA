/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementaciones;

import Entidades.Mensaje;
import FachadaDAO.FachaPersistencia;
import Interfaces.IConexionBD;
import Interfaces.IMensajeDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.List;

/**
 *
 * @author arturo
 */
public class MensajeDAO implements IMensajeDAO{
    private IConexionBD conexion;
    private MongoDatabase baseDatos;

    public MensajeDAO(IConexionBD conexion){
        this.conexion = conexion;
        this.baseDatos = conexion.crearConexion();
    }
    
    @Override
    public void agregarMensaje(Mensaje mensaje) {
        
    }

    @Override
    public List<Mensaje> consultarTodosMensajes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
    }
    
}
