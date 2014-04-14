package Ventanac;
import javax.swing.JFileChooser;
import java.io.File;

public class FileType {
 public static void main(String [] args) throws Exception {
                JFileChooser view = new JFileChooser();
                String descr = view.getTypeDescription(new File(args[0]));
                System.out.println("File type is: " + descr);
        }
}