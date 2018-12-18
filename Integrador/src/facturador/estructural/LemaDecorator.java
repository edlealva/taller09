package facturador.estructural;

import facturador.creacional.ComprobanteElectronico;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Palacios
 */
public class LemaDecorator extends DetallesDecorator {
	
	private String lema;

	public LemaDecorator(ComprobanteElectronico comprobante,String lema) {
		super(comprobante);
		this.setLema(lema);
		comprobante.getDetallesEmisor().add(lema);
	}

	public String getLema() {
		return lema;
	}

	public void setLema(String lema) {
		for(String fl:super.getDetallesEmisor()) {
			if(fl.equals(this.lema)) {
				fl = lema;
			}
		}
		
	}



}