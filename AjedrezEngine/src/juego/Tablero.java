package juego;

public class Tablero {

	private int[][][] posiciones = new int[8][8][2];
	private boolean turnoBlancas = true;

	public void vaciarTablero() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				posiciones[i][j][0] = 0;
				posiciones[i][j][1] = 0;
			}
		}
	}
	public void inicializarTablero() {
		//Seteo peones
		for (int i = 0; i < 8; i++) {
			posiciones[1][i][0]=1;
			posiciones[6][i][0]=1;
		}
		//Seteo fichas restantes
		posiciones[0][0][0]=2;
		posiciones[0][1][0]=3;
		posiciones[0][2][0]=4;
		posiciones[0][3][0]=5;
		posiciones[0][4][0]=6;
		posiciones[0][5][0]=4;
		posiciones[0][6][0]=3;
		posiciones[0][7][0]=2;
		posiciones[7][0][0]=2;
		posiciones[7][1][0]=3;
		posiciones[7][2][0]=4;
		posiciones[7][3][0]=5;
		posiciones[7][4][0]=6;
		posiciones[7][5][0]=4;
		posiciones[7][6][0]=3;
		posiciones[7][7][0]=2;
		//Seteo colores
		for(int i=0; i<8;i++) {
			posiciones[0][i][1]=0; //0 es negro y 1 es blanco
			posiciones[1][i][1]=0;
			posiciones[6][i][1]=1;
			posiciones[7][i][1]=1;
		}
	}
	public void mostrar() {
		System.out.println("#################################################################");
		for (int i = 0; i < 8; i++) {
			System.out.println("#       #       #       #       #       #       #       #       #");
			for (int j = 0; j < 8; j++) {
				
				System.out.print("#  ");
				System.out.print(cambiarPorCaracter(posiciones[i][j][0]+"-"+posiciones[i][j][1]));
				System.out.print("  ");
				
			}
			System.out.print("#");
			System.out.println();
			System.out.println("#       #       #       #       #       #       #       #       #");
			System.out.println("#################################################################");
		}
	}
	public String cambiarPorCaracter(String pieza) {
		String Conversion="";
		switch(pieza.charAt(0)) {
		case '0':
			Conversion+=" ";
			break;
		case '1':
			Conversion+="P";
			break;
		case '2':
			Conversion+="R";
			break;
		case '3':
			Conversion+="N";
			break;
		case '4':
			Conversion+="B";
			break;
		case '5':
			Conversion+="Q";
			break;
		case '6':
			Conversion+="K";
			break;
		}
		if(pieza.charAt(2)=='1') {
			Conversion+="-B";}
		else {
			if(pieza.charAt(0)=='0') {
				Conversion+="  ";}
			else{
				Conversion+="-N";}}
		return Conversion;
	}
	public void mover(int origenFila, int origenColumna, int destinoFila, int destinoColumna) {
		if(validarMovimiento(origenFila,origenColumna,destinoFila,destinoColumna)==false) {
			System.out.println("Movimiento inválido, capo");
			return;}
		System.out.println();
		System.out.println();
		System.out.println("*********************************************************************");
		System.out.println();
		System.out.println();
		posiciones[destinoFila][destinoColumna][0] = posiciones[origenFila][origenColumna][0];
		posiciones[destinoFila][destinoColumna][1] = posiciones[origenFila][origenColumna][1];
		posiciones[origenFila][origenColumna][0]=0;
		posiciones[origenFila][origenColumna][1]=0;
		//Cambia el turno
		turnoBlancas=(!turnoBlancas);
	}
    public boolean validarMovimiento(int origenFila, int origenColumna, int destinoFila, int destinoColumna) {
    	boolean valido=true;
    	//Chequeo que origen y destino esten dentro del tablero
    	if (!(((origenFila<=(8-1)) && (origenFila>=(1-1))) && ((origenColumna<=(8-1)) && (origenColumna>=(1-1))))){valido=false; System.out.println("Error1");}
    	//Chequeo que no haya pieza del mismo color en la posicion destino
    	if(posiciones[destinoFila][destinoColumna][0]!=0) {if(posiciones[destinoFila][destinoColumna][1]==posiciones[origenFila][origenColumna][1]) {valido=false;System.out.println("Error2");}}
    	//Chequeo que el origen tenga una pieza
    	if(posiciones[origenFila][origenColumna][0]==0) {valido=false;System.out.println("Error3");}
    	//Chequeo que el color de la pieza a mover sea el color del jugador
    	if((posiciones[origenFila][origenColumna][1]==0) && (turnoBlancas==true)) {valido=false;System.out.println("Error4");}
    	if((posiciones[origenFila][origenColumna][1]==1) && (turnoBlancas==false)) {valido=false;System.out.println("Error5");}
    	return valido;
    }
	public int[][][] getPosiciones() {
		return posiciones;
	}
	public void setPosiciones(int[][][] posiciones) {
		this.posiciones = posiciones;
	}
    
}
