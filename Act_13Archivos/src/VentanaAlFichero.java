import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Formatter;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;

public class VentanaAlFichero extends JFrame {

	private JPanel contentPane;
	private JTextField cNum;
	private JTextField cText;
	private JTextField cerror;
	private Formatter salida; // objeto usado para enviar texto al archivo
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAlFichero frame = new VentanaAlFichero();
					frame.setVisible(true);
					 } // fin de try
				catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Has causado un error!!!");
				} // fin de catch
					
			} // fin del método run
					
				
		});
	}
	
	
	/**
	 * Create the frame.
	 */
	public VentanaAlFichero() {
		setTitle("Ventana para el fichero"); //titulo de la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel escribeNum = new JLabel("Escribir un n\u00FAmero");
		escribeNum.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		//campo de texto para escribir un numero
		cNum = new JTextField();
		cNum.setColumns(10);
		
		JLabel escribeTex = new JLabel("Ecribe un texto");
		escribeTex.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		//campo de texto para escribir texto
		cText = new JTextField();
		cText.setColumns(10);
		
		//Botón guardar
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//Crear archivo de texto
				try
				 {
				 salida = new Formatter("prueba.txt");
				 cerror.setText("Archivo creado correctamente, va mejor la cosa!!");
				 JOptionPane.showMessageDialog(null, "Se ha creado ok");
				 //Guardar lo que se introduzca en los campos de numeros cNum y texto cText
				salida.format("%.2f\n %s", Float.valueOf(cNum.getText()),cText.getText());
				 //salida.format("Prueba %s", "otra");
				//Trampa salida.format("%.2f\n %s", Float.valueOf(cNum.getText()),cText.getText());
				salida.flush();
                salida.close();
                if (salida !=null);
                salida.close();				 
                } // fin de try
				 catch ( SecurityException securityException )
				 {
					 cerror.setText("No tiene acceso de escritura a este archivo." );
				 System.exit( 1 );
				 } // fin de catch
				 catch ( FileNotFoundException filesNotFoundException )
				 {
					 cerror.setText( "Error al crear el archivo." );
				 System.exit( 1 );
				 } // fin de catch
				catch (Exception e){
					e.printStackTrace();
					System.exit( 1 );
				}
				
			
			}
              //Act.3
                public void saveMap(){
                	String sb="TEST_CONTENT";
                	JFileChooser chooser=new JFileChooser();
                	chooser.setCurrentDirectory(new File("pruebas.txt"));
                	int retrival=chooser.showSaveDialog(null);
                	
                	if(retrival==JFileChooser.APPROVE_OPTION){
                		try{
                			FileWriter fw=new FileWriter (chooser.getSelectedFile()+".txt");
                			fw.write(sb.toString());
                		}catch(Exception ex){
                			ex.printStackTrace();
                		}
                }
                
			}
		});
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblMensajeDeError = new JLabel("Mensaje de error");
		lblMensajeDeError.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		//Campo de texto error
		cerror = new JTextField();
		cerror.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(escribeNum, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
						.addComponent(escribeTex, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnGuardar))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(cerror, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMensajeDeError)
								.addComponent(cText, GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
								.addComponent(cNum, GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
							.addGap(20))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(escribeNum)
						.addComponent(cNum, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(escribeTex)
						.addComponent(cText, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnGuardar)
						.addComponent(lblMensajeDeError))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cerror, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
