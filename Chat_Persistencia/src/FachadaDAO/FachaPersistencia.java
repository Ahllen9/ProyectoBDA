/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FachadaDAO;

import Entidades.Mensaje;
import Entidades.Usuario;
import Implementaciones.ChatDAO;
import Implementaciones.MensajeDAO;
import Implementaciones.UsuarioDAO;
import Interfaces.IConexionBD;
import Interfaces.IFachadaPersistencia;
import com.mongodb.client.MongoDatabase;
import java.util.List;
import org.bson.types.ObjectId;



/**
 *
 * @author arturo
 */
public class FachaPersistencia implements IFachadaPersistencia{
    private DAOsFactory factory;
    private IConexionBD conexion;
    private MongoDatabase baseDatos;
    private UsuarioDAO usuariodao;
    private MensajeDAO mensajedao;
    private ChatDAO chatdao;
    
    public FachaPersistencia(IConexionBD conexion) {
        this.factory = new DAOsFactory();
    }

    @Override
    public boolean agregarUsuario(Usuario usuario) {
        return usuariodao.agregarUsuario(usuario);
    }

    @Override
    public boolean actualizarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario consultarUser(String email, String password) {
        return usuariodao.consultarUser(email, password);
    }

    @Override
    public boolean consultarUsuario(String email, String password) {
        return usuariodao.consultarUsuario(email, password);
    }

    @Override
    public boolean consultarEmail(String email) {
        return usuariodao.consultarEmail(email);
    }

    @Override
    public boolean consultarNombre(String nombre) {
        return usuariodao.consultarNombre(nombre);
    }

    @Override
    public boolean consultarID(ObjectId id) {
        return usuariodao.consultarID(id);
    }

    @Override
    public List<Usuario> consultarTodos() {
        return usuariodao.consultarTodos();
    }

    @Override
    public void agregarMensaje(Mensaje mensaje) {
         mensajedao.agregarMensaje(mensaje);
    }

    @Override
    public List<Mensaje> consultarTodosMensajes() {
        return mensajedao.consultarTodosMensajes();
    }

    @Override
    public void agregarChat(Usuario usuario, Mensaje mensaje) {
        chatdao.agregarChat(usuario, mensaje);
    }

    @Override
    public List<Usuario> consultarUsuariosChats() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Mensaje> consultarMensajesChats() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
