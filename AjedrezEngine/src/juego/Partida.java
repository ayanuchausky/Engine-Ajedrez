package juego;

import java.util.Scanner;

public class Partida {
	Tablero tablero = new Tablero();
	Comportamientos comp = new Comportamientos();
	public void iniciarPartida() {
		tablero.vaciarTablero();
		tablero.inicializarTablero();
		tablero.mostrar();
		Scanner ingreso=new Scanner(System.in);
		ingreso.nextLine();
		int[] movimiento = {6, 1, 6, 2};
		if(comp.reglasPeon(movimiento, 1, tablero.getPosiciones())) {tablero.mover(movimiento[0],movimiento[1],movimiento[2],movimiento[3]);}else {
			System.out.println("Movimiento invalido!");
		}
		tablero.mostrar();
//		Turnos turnos=new Turnos();
//		turnos.iniciar();
//		if(nroAlAzar%2=0) {Turno.asignarBlancas(new Engine1)}else Turno.asignarBlancas(new Engine2);
//		while finPartida=false do {
//			turnos.siguiente();
//			Mov movimiento = Turno.Blancas(tablero);
//			movimiento.validar();
//			tablero.mover(movimiento);
//		tablero.mostrar();
//			turnos.siguiente();
//			Mov movimiento = Turno.Negras(tablero);
//			movimiento.validar();
//			tablero.mover(movimiento);
//		tablero.mostrar();
//			
//		}
		
	}

}
