/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FachadaDAO;


import Implementaciones.ChatDAO;
import Implementaciones.ConexionBD;
import Implementaciones.MensajeDAO;
import Implementaciones.UsuarioDAO;
import Interfaces.IChatDAO;
import Interfaces.IConexionBD;
import Interfaces.IMensajeDAO;
import Interfaces.IUsuarioDAO;
import implementaciones.*;

/**
 *
 * @author ricardosn saavedra
 */
public class DAOsFactory {
    private IConexionBD conexion = new ConexionBD();

    public DAOsFactory() {
        this.conexion = new ConexionBD();
    }
    
    public  IUsuarioDAO crearClientesDAO(){
        return new UsuarioDAO(conexion);
    }
    
    public IMensajeDAO crearProductosDAO(){
        return new MensajeDAO(conexion);
    }
    
    public IChatDAO crearVentasDAO(){
        return new ChatDAO(conexion);
    }
}
