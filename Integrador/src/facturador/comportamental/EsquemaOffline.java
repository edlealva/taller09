package facturador.comportamental;

import java.util.*;

import facturador.creacional.ComprobanteElectronico;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Palacios
 */
public class EsquemaOffline implements Esquema {

	String codigoAcceso;
    /**
     * Default constructor
     */
	public EsquemaOffline() {
    	codigoAcceso= Double.toString((int)(Math.random()*150)+1);
    }

    /**
     * @param comprobante 
     * @return
     */
    
	@Override
	public void autorizar(ComprobanteElectronico comprobante) {
		// TODO Auto-generated method stub
		comprobante.setNumeroAutorizacion(codigoAcceso);
		comprobante.setClaveAcceso(codigoAcceso);
		
	}


}