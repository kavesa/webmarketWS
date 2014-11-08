/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package direct.market.service;

import direct.market.datatype.DataUsuario;
import direct.market.exceptions.UsuarioException;
import direct.market.factory.Factory;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author kavesa
 */
@WebService(serviceName="UsuarioWS")
public class UsuarioWS {

    @WebMethod(operationName = "altaUsuario")
    public void altaUsuario(String nickname, String password, String nombre, String apellido, Date fechaNacimiento, String email, byte[] image, String tipo, String nombre_cia, String  link_web, boolean mailing)throws UsuarioException{
        Factory.getInstance().getUsuarioController().altaUsuario(nickname, password, nombre, apellido, fechaNacimiento, email, image, tipo, nombre_cia, link_web, mailing);
    }
    
    @WebMethod(operationName = "getDataCliente")
    public DataUsuario getDataCliente(String nickname)throws UsuarioException{
        return Factory.getInstance().getUsuarioController().getDataCliente(nickname);
    }
    
    @WebMethod(operationName = "getDataProveedor")
    public DataUsuario getDataProveedor(String nickname){
        return Factory.getInstance().getUsuarioController().getDataProveedor(nickname);
    }
    
    @WebMethod(operationName = "getClientes")
    public List<DataUsuario> getClientes(){
        return Factory.getInstance().getUsuarioController().getClientes();
    }

    @WebMethod(operationName = "getProveedores")
    public List<DataUsuario> getProveedores(){
        return Factory.getInstance().getUsuarioController().getProveedores();
    }
    
    @WebMethod(operationName = "getUsuarios")
    public List<DataUsuario> getUsuarios(){
        return Factory.getInstance().getUsuarioController().getUsuarios();
    }
    
    @WebMethod(operationName = "modificarCliente")
    public void modificarCliente(DataUsuario u,int numeroOrdenCompra){
        Factory.getInstance().getUsuarioController().modificarCliente(u, numeroOrdenCompra);
    }
    
    @WebMethod(operationName = "existeCliente")
    public boolean existeCliente(String nickname){
        return Factory.getInstance().getUsuarioController().existeCliente(nickname);
    }
    
    @WebMethod(operationName = "existeEmail")
    public boolean existeEmail(String email){
        return Factory.getInstance().getUsuarioController().existeEmail(email);
    }
    
    @WebMethod(operationName = "login")
    public DataUsuario login(String nickname, String pass)throws UsuarioException{
        return Factory.getInstance().getUsuarioController().login(nickname, pass);
    }
    
    @WebMethod(operationName = "usuarioComproProducto")
    public boolean usuarioComproProducto(String nickname, String prodRef) throws UsuarioException{
        return Factory.getInstance().getUsuarioController().usuarioComproProducto(nickname, prodRef);
    }
    
    @WebMethod(operationName = "cambiarMailing")
    public void cambiarMailing(String nickname, boolean mailing){
        Factory.getInstance().getUsuarioController().cambiarMailing(nickname, mailing);
    }
    
}
