package com.everis.alicante.becajava.course.juego;

import java.util.ArrayList;
import java.util.List;

public class MasterMindManager {

	List<Integer> numerosIntentado = new ArrayList<Integer>();

	int numeroIntentosRestantes;

	Integer numeroInicial;

	public Boolean getWin(ConsultaNumeroResult consultaNumeroResult) {
		return consultaNumeroResult.getNegras() == 5;
	}

	public MasterMindManager(Integer numeroInicial) {

		this.numeroIntentosRestantes = 10;

		this.numeroInicial = numeroInicial;

	}

	public ConsultaNumeroResult consultaNumero(Integer numero) {
		ConsultaNumeroResult consulta = new ConsultaNumeroResult();

		if (this.isNumeroValido(numero)) {

			this.numeroIntentosRestantes--;

			String numeroStr = String.format("%05d", numero);
			String numeroInicialStr = String.format("%05d", numeroInicial);

			for (int i = 0; i < 5; i++) {
				if (numeroStr.charAt(i) == numeroInicialStr.charAt(i)) {

					consulta.setNegras(consulta.getNegras() + 1);

				}

			}

			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (numeroStr.charAt(j) == numeroInicialStr.charAt(i)) {
						consulta.setBlancas(consulta.getBlancas() + 1);
						j = 5;
					}
				}
			}

			consulta.setBlancas((consulta.getBlancas()) - (consulta.getNegras()));
		}

		return consulta;
	}

	public Boolean isNumeroValido(Integer numero) {

		return numero != null && numero > 0 && numero < 99999;
	}

	public Boolean tieneIntentos() {

		if (numeroIntentosRestantes >= 1) {

			return true;
		} else {

			return false;
		}

	}

}
