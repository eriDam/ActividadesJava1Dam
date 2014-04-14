package com.ScreenersPAct10_2;
//Lo importamos para q se pueda utilizar
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;//Importamos la calse campo de texto
import java.awt.FlowLayout;
import javax.swing.SwingConstants; // constantes comunes utilizadas con Swing
import javax.swing.Icon;
import javax.swing.ImageIcon;

//ventanuco es la clase donde queremos heredar todas las caracteristicas para poedr pintar x pantalla
public class Ventanuco extends JFrame{
	
		private JTextField campoTexto1; //definimos campo de texto con tamaño fijo y lo importamos arriba
		private JTextField campoTexto2; //defino campo d texto2
		private Icon img;
		
		public Ventanuco(){//constructor, ir a la clase principal y crearlo
			
		/*Si le damos a ejecutar no pasaria nada, es x q la propiedad no aparece x defecto hay q ponerla
		en la clase principal 9 y 10*/
		
			//Etiquetas
			JLabel etiq1=new JLabel();
			JLabel etiq2=new JLabel("Segunda etiqueta");//otra forma de poner texto sin setText es ponerlo aqui entre "
			//Creamos objeto campo de texto
			img= new ImageIcon(getClass().getResource("/imagenes2/Image1.jpg"));
			campoTexto1=new JTextField(20);/*le ponemos 20 para tamaño, si ponemos + tamaño al poner el Flowlayout lo
			sigue mostrando de izq a dcha pero en la siguiente linea x q no cabe*/
			campoTexto2=new JTextField(20);//añado otro campo de texto
			
			setLayout( new FlowLayout() ); /*Un Layout significa q formato queremos q siga conforme
			vayamos añadiendo botoners texto...en este caso q lo rellene de iz a dcha y arriba abajo*/	
			//Para ponerle un texto y añadir con add a nuestra ventana
			
			etiq1.setText("Primera etiqueta");
			etiq1.setIcon(img);
			add (etiq1);
			add(campoTexto1);//añado campo de texto a la ventana
			//Si queremos centrar el texto de nuestra etiq2 ( SwingConstants.CENTER ), o izq .LEFT
		    etiq2.setHorizontalTextPosition( SwingConstants.RIGHT);
		    etiq2.setIcon(img);//Podemos reutilizar y usar la img en etiq2
		    add (etiq2);
		   
			add(campoTexto2);//añado campo de texto a la ventana
		}
}
