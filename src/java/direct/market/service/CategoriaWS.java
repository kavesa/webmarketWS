/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package direct.market.service;

import direct.market.datatype.DataCategoria;
import direct.market.datatype.DataProducto;
import direct.market.exceptions.CategoryException;
import direct.market.factory.Factory;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author nightmare
 */
@WebService(serviceName = "CategoriaWS")
public class CategoriaWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "altaCategoria")
    public void altaCategoria(String parent, String nombre, boolean contieneProductos) throws CategoryException {
        Factory.getInstance().getCategoriaController().altaCategoria(parent, nombre, contieneProductos);
    }

    @WebMethod(operationName = "getCategorias")
    public List<DataCategoria> getCategorias() throws CategoryException {
        return Factory.getInstance().getCategoriaController().getCategorias();
    }

    @WebMethod(operationName = "getProductosPorNombreCategoria")
    public List<DataProducto> getProductosPorNombreCategoria(String nombreCategoria) throws CategoryException {
        return Factory.getInstance().getCategoriaController().getProductosPorNombreCategoria(nombreCategoria);
    }

    @WebMethod(operationName = "getCategoriasDeProducto")
    public List<DataCategoria> getCategoriasDeProducto(String referenciaProd) throws CategoryException {
        return Factory.getInstance().getCategoriaController().getCategoriasDeProducto(referenciaProd);
    }

    @WebMethod(operationName = "getCategoriaPorNombre")
    public DataCategoria getCategoriaPorNombre(String nombreCategoria) throws CategoryException {
        return Factory.getInstance().getCategoriaController().getCategoriaPorNombre(nombreCategoria);
    }
}
