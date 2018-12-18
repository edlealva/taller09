package facturador.comportamental;

import java.util.*;

import facturador.creacional.ComprobanteElectronico;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Palacios
 */
public class EsquemaOnline implements Esquema {

	private String codigoAutorizacion;
    /**
     * Default constructor
     */
    public EsquemaOnline() {
    	codigoAutorizacion= Double.toString((int)(Math.random()*150)+1);
    }

    /**
     * @param comprobante 
     * @return
     */
    public void autorizar(ComprobanteElectronico comprobante) {
        comprobante.setNumeroAutorizacion(codigoAutorizacion);
    }

 

}