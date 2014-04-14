//Actividad 10  J

import javax.swing.JOptionPane;

public class Act_10 {

	
	public static void main(String[] args) {
		/*Solicitaremos los nombres del Jugador 1, y el nombre del Jugador 2 y los almacenaremos 
		 * en dos variables diferentes  y mostraremos por pantalla*/
		String nombreJ1=
		// obtiene la entrada del usuario de los diálogos de entrada
		JOptionPane.showInputDialog( "Introduzca el nombre del jugador 1" );
		
		String nombreJ2= 
		JOptionPane.showInputDialog( "Introduzca el nombre del jugador 2" );
	
		/*El valor null indica que el diálogo debe aparecer en el centro de la pantalla de la computadora, 
		 * PLAIN_MESSAGE sin icono Un diálogo que contiene un mensaje, pero no un icono.*/
		JOptionPane.showMessageDialog( null, "El nombre del Jugador 1 es:  " + nombreJ1, 
		"Nombre de los Jugadores: ", JOptionPane.PLAIN_MESSAGE );
	
		JOptionPane.showMessageDialog( null, "El nombre del Jugador 2 es:  " + nombreJ2, 
				"Nombre de los Jugadores: ", JOptionPane.PLAIN_MESSAGE );
	}

}
