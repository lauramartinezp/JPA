package com.everis.alicante.becajava.course.juego;

import java.util.Scanner;

public class MasterMindMain {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Integer numeroInicial = (int) (Math.random() * 100000);

		MasterMindManager manager = new MasterMindManager(numeroInicial);

		System.out.println("Bienvenidos jugadores, se creará un numero aleatorio para poder jugar.");

		ConsultaNumeroResult consultaNumeroResult;

		do {

			System.out.println("Inserte un numero del 00000 al 99999");
			Integer numero = in.nextInt();
			consultaNumeroResult = manager.consultaNumero(numero);
			System.out.println(consultaNumeroResult);

		} while (manager.tieneIntentos() && !manager.getWin(consultaNumeroResult));
		if (manager.getWin(consultaNumeroResult)) {
			System.out.println("Ha ganado");

		} else {
			System.out.println("Has perdido");
		}

	}

}
