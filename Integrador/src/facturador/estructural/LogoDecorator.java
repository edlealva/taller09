package facturador.estructural;

import facturador.creacional.ComprobanteElectronico;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Palacios
 */
public class LogoDecorator extends DetallesDecorator {
	

	private String logo;
    /**
     * @param comprobante
     */
	public LogoDecorator(ComprobanteElectronico comprobante,String logo) {
		super(comprobante);
		this.setLogo(logo);
		comprobante.getDetallesEmisor().add(logo);
		
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		String s = "";
		for(String fl:super.getDetallesEmisor()) {
			if(fl.equals(this.logo)) {
				s+=fl;
				fl = logo;
			}
		}
		
	}

}