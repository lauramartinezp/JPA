package com.everis.alicante.becajava.course.juego;

public class ConsultaNumeroResult {

	private int Negras;
	private int Blancas;

	public int getNegras() {
		return Negras;
	}



	public void setNegras(int negras) {
		Negras = negras;
	}



	public int getBlancas() {
		return Blancas;
	}



	public void setBlancas(int blancas) {
		Blancas = blancas;
	}







	@Override
	public String toString() {
		return "Negras=" + Negras + ", Blancas=" + Blancas;
	}
	
	
	
}
