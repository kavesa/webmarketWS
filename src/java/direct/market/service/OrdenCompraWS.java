/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package direct.market.service;

import direct.market.datatype.DataLineaOC;
import direct.market.datatype.DataOC;
import direct.market.exceptions.OCException;
import direct.market.factory.Factory;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author nightmare
 */
@WebService(serviceName = "OrdenCompraWS")
public class OrdenCompraWS {

    @WebMethod(operationName = "altaOrdenCompra")
    public int altaOrdenCompra(DataOC cabezal) throws OCException {
        return Factory.getInstance().getOrdenCompraController().altaOrdenCompra(cabezal);
    }

    @WebMethod(operationName = "cancelarOrdenCompra")
    public void cancelarOrdenCompra(int numero) throws OCException {
        Factory.getInstance().getOrdenCompraController().cancelarOrdenCompra(numero);
    }

    @WebMethod(operationName = "getOrdenesCompra")
    public List<DataOC> getOrdenesCompra() {
        return Factory.getInstance().getOrdenCompraController().getOrdenesCompra();
    }

    @WebMethod(operationName = "getLineasOC")
    public List<DataLineaOC> getLineasOC(String numeroOC) {
        return Factory.getInstance().getOrdenCompraController().getLineasOC(numeroOC);
    }

    @WebMethod(operationName = "getDataOC")
    public DataOC getDataOC(String numeroOC) {
        return Factory.getInstance().getOrdenCompraController().getDataOC(numeroOC);
    }

    @WebMethod(operationName = "cancelarOC")
    public void cancelarOC(int numOC) {
        Factory.getInstance().getOrdenCompraController().cancelarOC(numOC);
    }

    @WebMethod(operationName = "ordenPreparada")
    public void ordenPreparada(int numOC) {
        Factory.getInstance().getOrdenCompraController().ordenPreparada(numOC);
    }

    @WebMethod(operationName = "ordenConfirmada")
    public void ordenConfirmada(int numOC) {
        Factory.getInstance().getOrdenCompraController().ordenConfirmada(numOC);
    }

}
