import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFileChooser;
 

public class VentanadeControl extends JFrame {

	private JPanel contentPane;
	private JTextField fichero_texto;
	private JTextField nombreFichero_texto;
	private JTextField ruta_texto;
	private JTextField tamanyo_texto;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanadeControl frame = new VentanadeControl();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creo la ventana
	 */
	public VentanadeControl() {
		setTitle("Ventana de Control"); //titulo
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 207);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel fichero = new JLabel("Fichero");
		fichero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		fichero.setBounds(10, 12, 60, 14);
		contentPane.add(fichero);
		
		fichero_texto = new JTextField();
		fichero_texto.setBounds(121, 11, 204, 20);
		contentPane.add(fichero_texto);
		fichero_texto.setColumns(10);
		
		final JButton buscar = new JButton("...");
		buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				buscar.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent evento) {
		                    JFileChooser elegir = new JFileChooser();
		                    int opcion = elegir.showOpenDialog(buscar);
		               
		                    //Si presionamos el boton ABRIR en pathArchivo obtenemos el path del archivo
		                    if (opcion == JFileChooser.APPROVE_OPTION) {
		                    	String pathArchivo = elegir.getSelectedFile().getPath(); //Obtiene path del archivo
		                        String nombre = elegir.getSelectedFile().getName(); //obtiene nombre del archivo
		                        long tamanyos=elegir.getSelectedFile().length();//obtiene tamanyo archivo
		                        //long tam =elegir.getSelectedFile().length(); NO ME FUNCIONA... 
		                        nombreFichero_texto.setText(nombre);
		                        fichero_texto.setText(nombre);
		                        ruta_texto.setText(pathArchivo);
		                        //tamanyo_texto.setText(tamanyos);
		                        //tamanyo_texto.setText(tam);NO ME FUNCIONA
		                       System.out.println("El nombre del archivo es: "+ nombre);
		                        System.out.println("El path del archivo es: "+ pathArchivo);
		                        System.out.println("El tamaño del archivo es: "+ tamanyo_texto);
		                    }
		                }
		        });  
			}
		});
		buscar.setBounds(335, 10, 52, 23);
		contentPane.add(buscar);
		
		JLabel nombreFichero = new JLabel("Nombre Fichero");
		nombreFichero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nombreFichero.setBounds(10, 55, 97, 14);
		contentPane.add(nombreFichero);
		
		JLabel ruta = new JLabel("Ruta");
		ruta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ruta.setBounds(10, 89, 46, 14);
		contentPane.add(ruta);
		
		JLabel tamanyo = new JLabel("Tama\u00F1o");
		tamanyo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tamanyo.setBounds(10, 131, 71, 14);
		contentPane.add(tamanyo);
		
		nombreFichero_texto = new JTextField();
		nombreFichero_texto.setBounds(121, 54, 266, 20);
		contentPane.add(nombreFichero_texto);
		nombreFichero_texto.setColumns(10);
		
		ruta_texto = new JTextField();
		ruta_texto.setBounds(121, 88, 266, 20);
		contentPane.add(ruta_texto);
		ruta_texto.setColumns(10);
		
		tamanyo_texto = new JTextField();
		tamanyo_texto.setText("");
		tamanyo_texto.setBounds(121, 130, 266, 20);
		contentPane.add(tamanyo_texto);
		tamanyo_texto.setColumns(10);
	}
}
