//Actividad 11_0 y 11_1 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.beans.VetoableChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.Color;

import javax.swing.border.MatteBorder;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calcul extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField valor2;
	private JTextField va;
	private JPanel contentPane;

 
	public static void main(String[] args) {

	}

	public Calcul() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 257, 306);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Verdana", Font.PLAIN, 11));
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0,
				0, 0)));
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.addVetoableChangeListener(new VetoableChangeListener() {
	public void vetoableChange(PropertyChangeEvent arg0) {
			}
		});
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Calculadora");

		JLabel lblNewLabel = new JLabel("N\u00FAmero 1");
		lblNewLabel.setBounds(28, 5, 69, 14);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero 2");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(145, 5, 69, 14);
		contentPane.add(lblNewLabel_1);

		final JTextField valor1 = new JTextField();
		valor1.setBounds(28, 30, 59, 20);
		contentPane.add(valor1);
		valor1.setColumns(10);

		valor2 = new JTextField();
		valor2.setBounds(155, 30, 59, 20);
		contentPane.add(valor2);
		valor2.setColumns(10);

		// Boton suma
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent arg0) {
				// en el bloque try ponemos el codigo que queremos intentar ejecutar
				try {
				// Coje el 1 y lo lo convierte a decimal ,coje el 2 y lo convierte tamb a dec con float, los suma en la misma linea
				va.setText(String.valueOf(Float.parseFloat(valor1.getText())+ Float.parseFloat(valor2.getText())));
				} catch (Exception NumberFormatException) {//cath especifica entre parentesis 1 parametro d excepcion
				  JOptionPane.showMessageDialog(null,"¡¡Fijate, que estas calculando!!");
				}

			}
		});
		btnNewButton.setBounds(28, 72, 59, 23);
		contentPane.add(btnNewButton);

		// Boton Resta
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {// crear de nuevo metodo aqui en el bloque try ponemos el codigo
		//que queremos intentar ejecutar
		try {
			// Coje el 1 y lo lo convierte a decimal ,coje el 2 y lo convierte tamb a dec con float, los resta en la misma linea
			va.setText(String.valueOf(Float.parseFloat(valor1.getText())- Float.parseFloat(valor2.getText())));
		} catch (Exception NumberFormatException) {//cath especifica entre parentesis 1 parametro d excepcion
		  JOptionPane.showMessageDialog(null,"¡¡Fijate, que has puesto!!");
		}

			}
		});
		btnNewButton_1.setBounds(28, 106, 59, 23);
		contentPane.add(btnNewButton_1);

		// Boton Multiplicar

		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.setBounds(155, 72, 59, 23);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		// en el bloque try ponemos el codigo que queremos intentar  ejecutar
			try {
		// Coje el 1 y lo lo convierte a decimal ,coje el 2 y lo convierte tamb a dec con float, los divide en la misma linea
		va.setText(String.valueOf(Float.parseFloat(valor1.getText())+ Float.parseFloat(valor2.getText())));
		} catch (Exception NumberFormatException) {//cath especifica entre parentesis 1 parametro d excepcion
	   JOptionPane.showMessageDialog(null,"¡¡Eso no lo puedes dividir, pon número!!");
				}

			
			}
		});

		va = new JTextField();
		va.setBounds(31, 168, 183, 20);
		contentPane.add(va);
		va.setColumns(10);

		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(85, 143, 79, 14);
		contentPane.add(lblResultado);

		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
				// Coje numero 1 y lo convierte a decimal con float, coje el
				// otro y lo convierte tamb a decimal, lo divide
				va.setText(String.valueOf(Float.parseFloat(valor1.getText())
						/ Float.parseFloat(valor2.getText())));
			}
		});
		btnNewButton_3.setBounds(155, 106, 59, 23);
		contentPane.add(btnNewButton_3);
	}
}
