/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementaciones;

import Entidades.Mensaje;
import Entidades.Usuario;
import Interfaces.IChatDAO;
import Interfaces.IConexionBD;
import com.mongodb.client.MongoDatabase;
import java.util.List;

/**
 *
 * @author arturo
 */
public class ChatDAO implements IChatDAO{
    private IConexionBD conexion;
    private MongoDatabase baseDatos;
    
    protected ChatDAO(IConexionBD conexion){
        this.conexion = conexion;
        this.baseDatos = conexion.crearConexion();
    }
    
    @Override
    public void agregar(Usuario usuario, Mensaje mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> consultarChats() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Mensaje> consultarMensajes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
