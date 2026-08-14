package com.xideral.cinehub.v0;

public class PagoEfectivo implements MetodoPago{

	@Override
	public void pagar() {
		System.out.println("Pagando con efectivo");
		
	}

}
