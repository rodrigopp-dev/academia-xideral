package com.xideral.cinehub.v0;

public class PagoTarjeta implements MetodoPago{

	@Override
	public boolean pagar() {
		System.out.println("Pagando con tarjeta");
		return true;
	}

}
