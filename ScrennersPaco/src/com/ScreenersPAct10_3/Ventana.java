package com.ScreenersPAct10_3; //Act 10.3.2
//Lo importamos para q se pueda utilizar
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ventana extends JFrame { //la clase donde queremos heredar todas las caracteristicas para poedr pintar x pantalla

	private JPanel contentPane;
	private JTextField jugad;//definimos campo de texto con tamaño fijo y lo importamos arriba
	private JTextField textField;//defino campo d texto2
	private JTextField textField_1;//defino campo d texto2
	
	
//crear el frame

	public Ventana() {//constructor, ir a la clase principal y crearlo
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblJugador = new JLabel("Jugador 1");
		lblJugador.setBounds(25, 11, 59, 28);
		contentPane.add(lblJugador);
		
		jugad = new JTextField();
		jugad.setBounds(94, 15, 237, 20);
		contentPane.add(jugad);
		jugad.setColumns(10);
		JLabel lblJugador_1 = new JLabel("Jugador 2");
		lblJugador_1.setBounds(23, 50, 61, 14);
		contentPane.add(lblJugador_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(94, 46, 237, 20);
		contentPane.add(textField);
		
		JLabel lblJugador_2 = new JLabel("Jugador 3");
		lblJugador_2.setBounds(23, 85, 61, 14);
		contentPane.add(lblJugador_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(94, 82, 237, 20);
		contentPane.add(textField_1);
		
		//Creo etiqueta que contiene la imagen
				JLabel lblNewLabel = new JLabel();
				lblNewLabel.setIcon(new ImageIcon(Ventana.class.getResource("/imagenes2/Image1.jpg")));
				lblNewLabel.setBounds(94, 100, 86, 139);
				contentPane.add(lblNewLabel);
				
				JButton btnSalvar = new JButton("Salvar");
				btnSalvar.setBounds(229, 135, 102, 23);
				contentPane.add(btnSalvar);
				
				
				JButton btnDescartar = new JButton("Descartar");
				btnDescartar.setBounds(229, 181, 102, 23);
				contentPane.add(btnDescartar);
	}
}
