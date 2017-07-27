package com.everis.alicante.becajava.course.juego;

import java.util.Scanner;

import mingorance.enrique.commandlinemenu.Menu;
import mingorance.enrique.commandlinemenu.MenuBuilder;

public class MasterMindMain {

	public static void main(String[] args) {
		
		

        Menu subMenu1 = MenuBuilder.createSubMenu("Menu Secundario 1", 1)
                .addSimpleOption(1, "Offline")
                .addSimpleOption(2, "Servidor local")
                .addSimpleOption(3, "Online")
                .addSimpleOption(4, "Nain")
                .addExitOption(0, "SalirS1")
                .build();

        Menu subMenu2 = MenuBuilder.createSubMenu("Menu Secundario 2", 2)
                .addSimpleOption(1, "Opcion 1")
                .addSimpleOption(2, "OpciónS2 2")
                .addSimpleOption(3, "OpciónS2 3")
                .addSimpleOption(4, "OpciónS2 4")
                .addExitOption(0, "SalirS2")
                .build();


        Menu mainMenu = MenuBuilder.createMainMenu("Menu Principal")
                .addSubMenuOption("Jugar MasterMind", subMenu1)
                .addSubMenuOption("Submenú 2", subMenu2)
                .addExitOption(0, "Salir")
                .build();

        switch(mainMenu.play()) {
        case "1.1":
        	iniciarAplicacionOffline();
        	break;
        }
        

		
		
		
		
	}



public static void iniciarAplicacionOffline() {

	Scanner in = new Scanner(System.in);

	Integer numeroInicial = (int) (Math.random() * 100000);

	MasterMindManager manager = new MasterMindManager(numeroInicial);

	System.out.println("Bienvenidos jugadores, se crear� un numero aleatorio para poder jugar.");

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

