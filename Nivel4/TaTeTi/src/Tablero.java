public class Tablero {

    Boolean[][] tablero = {{null,null,null},{null,null,null},{null,null,null}};
    Integer[][] tableroPosiciones = {{1,2,3},{4,5,6},{7,8,9}};

    public void pintarTablero() {
        for (int i = 0; i<=2; i++){
            for (int k = 0; k<=2; k++) {
                if (tablero[i][k] == null){
                    System.out.print("[ ] ");
                } else if (tablero[i][k] == true) {
                    System.out.print("[X] ");
                } else {
                    System.out.print("[O] ");
                }
            }
            System.out.print("      ");
            for (int j = 0; j<=2; j++) {
                if (tablero[i][j] == null){
                    System.out.print("[" + tableroPosiciones[i][j] + "] ");
                } else {
                    System.out.print("[ ] ");
                }

            }
            System.out.println();
        }
    }

    public boolean hayGanador(){
        for (int i = 0; i<=2; i++) {
            for (int k = 0; k <= 2; k++) {
                if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2] && tablero[i][i]!=null || tablero[0][k] == tablero[1][k] && tablero[1][k] == tablero[2][k] && tablero[1][k] != null){
                    return true;
                }
            }
        }
        if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[1][1]!=null || tablero[2][0] == tablero[1][1] && tablero[1][1] == tablero[0][2] && tablero[1][1]!=null){
            return true;
        }
        return false;
    }

    public void jugada(Jugador jugador, int num){

        boolean devolver;
        if (jugador.getNumeroJugador()==1){
            devolver = true;
        } else {
            devolver = false;
        }

        switch (num){
            case 1:
                tablero[0][0]=devolver;
                break;
            case 2:
                tablero[0][1]=devolver;
                break;
            case 3:
                tablero[0][2]=devolver;
                break;
            case 4:
                tablero[1][0]=devolver;
                break;
            case 5:
                tablero[1][1]=devolver;
                break;
            case 6:
                tablero[1][2]=devolver;
                break;
            case 7:
                tablero[2][0]=devolver;
                break;
            case 8:
                tablero[2][1]=devolver;
                break;
            case 9:
                tablero[2][2]=devolver;
                break;
        }
    }
}
