package facturador.estructural;

import facturador.creacional.ComprobanteElectronico;

public class DetallesDecorator extends ComprobanteElectronico{
	private ComprobanteElectronico comprobante;
	
	public DetallesDecorator (ComprobanteElectronico comprobante) {
		this.comprobante =comprobante;
	}

	public ComprobanteElectronico getComprobante() {
		return comprobante;
	}

	public void setComprobante(ComprobanteElectronico comprobante) {
		this.comprobante = comprobante;
	}
	
	
}
