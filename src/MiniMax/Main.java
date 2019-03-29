/** ******************************************************************* */
/* JORGE CASTRO

 * Programa que permite jugar al tres en raya o tic tac toe contra otra
 * persona o contra la máquina. Implementando el algoritmo minimax, árboles,
 * recursión, etc.
 *
/**********************************************************************/
package MiniMax;

import javax.swing.*;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);

        /*Creamos una nueva instancia de nuestro gato.*/
        new MiniMax();
    }

}
