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
import javax.jws.WebParam;

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
    
//    @WebMethod
//    boolean existeCliente(String nickname);
    
//    @WebMethod
//    boolean existeEmail(String email);
    
//    @WebMethod
//    DataUsuario login(String nickname, String pass)throws UsuarioException;
    
//    @WebMethod
//    boolean usuarioComproProducto(String nickname, String prodRef) throws UsuarioException;
    
//    @WebMethod
//    void cambiarMailing(String nickname, boolean mailing);
    
}
