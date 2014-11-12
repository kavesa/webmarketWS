/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package direct.market.service;

import direct.market.datatype.DataComentario;
import direct.market.datatype.DataProducto;
import direct.market.datatype.DataReclamo;
import direct.market.exceptions.ProductoException;
import direct.market.factory.Factory;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author kavesa
 */
@WebService(serviceName = "ProductoWS")
public class ProductoWS {

//    @WebMethod(operationName = "")
//    Factory.getInstance().getProductoController()
    @WebMethod(operationName = "altaProducto")
    public void altaProducto(DataProducto dProd) throws ProductoException {
        Factory.getInstance().getProductoController().altaProducto(dProd);
    }
    
    @WebMethod(operationName = "buscarProductoPorId")
    public DataProducto buscarProductoPorId(String id) throws ProductoException{
        return Factory.getInstance().getProductoController().buscarProductoPorId(id);
    }

    @WebMethod(operationName = "buscarProductoPorName")
    public DataProducto buscarProductoPorName(String name) throws ProductoException{
        return Factory.getInstance().getProductoController().buscarProductoPorName(name);
    }

    @WebMethod(operationName = "buscarProductoPorRef")
    public DataProducto buscarProductoPorRef(String ref){
        return Factory.getInstance().getProductoController().buscarProductoPorRef(ref);
    }

    @WebMethod(operationName = "getProductListPorProveedor")
    public List<DataProducto> getProductListPorProveedor(String nick){
        return Factory.getInstance().getProductoController().getProductListPorProveedor(nick);
    }

    @WebMethod(operationName = "modificarProducto")
    public void modificarProducto(DataProducto dProd) throws ProductoException{
        Factory.getInstance().getProductoController().modificarProducto(dProd);
    }

    @WebMethod(operationName = "modificarProductoConReferenciaModificada")
    public void modificarProductoConReferenciaModificada(DataProducto dp, String refAnterior) throws ProductoException{
        Factory.getInstance().getProductoController().modificarProductoConReferenciaModificada(dp, refAnterior);
    }

    @WebMethod(operationName = "agregarComentario")
    public void agregarComentario(String idProducto, DataComentario comentario) throws ProductoException{
        Factory.getInstance().getProductoController().agregarComentario(idProducto, comentario);
    }

    @WebMethod(operationName = "ingresarReclamo")
    public void ingresarReclamo(String idProducto, DataReclamo dataReclamo) throws ProductoException{
        Factory.getInstance().getProductoController().ingresarReclamo(idProducto, dataReclamo);
    }

    @WebMethod(operationName = "buscarProductoNombreSimilar")
    public List<DataProducto> buscarProductoNombreSimilar(String buscar) throws ProductoException{
        return Factory.getInstance().getProductoController().buscarProductoNombreSimilar(buscar);
    }

    @WebMethod(operationName = "getReclamosPorProducto")
    public List<DataReclamo> getReclamosPorProducto(String refProd) throws ProductoException{
        return Factory.getInstance().getProductoController().getReclamosPorProducto(refProd);
    }

}
