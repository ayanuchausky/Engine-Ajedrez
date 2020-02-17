package juego;

import java.lang.Math;

public class Comportamientos {
	// Llega una ficha, un par de posiciones, numero de turno y se retorna si el
	// movimiento es realizable por la pieza.
	// movimiento: origenFila,origenColumna,destinoFila,destinoColumna
	public boolean reglasPeon(int[] movimiento, int turno, int[][][]posiciones) {
		int origenFila=movimiento[0];
		int origenColumna=movimiento[1];
		int destinoFila=movimiento[2];
		int destinoColumna=movimiento[3];
		boolean a = false;
		boolean b = false;
		if(turno%2==1) {
			if(origenFila==6) {
				if((Math.abs(origenFila-destinoFila))<3) {
					if(origenColumna==destinoColumna) {
						a=true;}}}
			if(Math.abs(origenFila-destinoFila)==1) {
				if(origenColumna==destinoColumna) {
					a=true;}}
			if(origenFila-destinoFila==1) {
				if(Math.abs(origenColumna-destinoColumna)==1){
					if(posiciones[destinoFila][destinoColumna][0]!=0) {
						if(posiciones[destinoFila][destinoColumna][1]==1) {
							a=true;}}}}
		}else {
			if(origenFila==1) {
				if((Math.abs(origenFila-destinoFila))<3) {
					if(origenColumna==destinoColumna) {
						b=true;}}}
			if(Math.abs(destinoFila-origenFila)==1) {
				if(origenColumna==destinoColumna) {
					b=true;}}
			if(destinoFila-origenFila==1) {
			    if(Math.abs(origenColumna-destinoColumna)==1){
			    	if(posiciones[destinoFila][destinoColumna][0]!=0) {
			    		if(posiciones[destinoFila][destinoColumna][1]==0) {
			    			b=true;}}}}
		}
		
		return (a||b);
	}

	public boolean reglasTorre(int[] movimiento, int turno, int[][][]posiciones) {
		int origenFila=movimiento[0];
		int origenColumna=movimiento[1];
		int destinoFila=movimiento[2];
		int destinoColumna=movimiento[3];
		boolean a=false;
		//Se mueve a lo largo de una fila
		if(origenFila==destinoFila) {
			if() {a=true;}}
		return (a);
	}
//
//	public boolean reglasCaballo() {
//	}
//
//	public boolean reglasAlfil() {
//	}
//
//	public boolean reglasReina() {
//	}
//
//	public boolean reglasRey() {
//}
	//METODO PARA CHEQUEAR QUE EL REY NO QUEDE EXPUESTO

}
