public class Tablero {

    Boolean[][] tablero = {{null,null,null},{null,null,null},{null,null,null}};
    Integer[][] tableroPosiciones = {{1,2,3},{4,5,6},{7,8,9}};

    public void pintarTablero() {
        for (int i = 0; i<=2; i++){
            for (int k = 0; k<=2; k++) {
                System.out.print("[" + tablero[i][k] + "] ");
            }
            System.out.print("      ");
            for (int j = 0; j<=2; j++) {
                System.out.print("[" + tableroPosiciones[i][j] + "] ");
            }
            System.out.println();
        }
    }
}
