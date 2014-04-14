package com.retos.damRetoFinalEldesafio;

public class Principal {

    public static void main(String[] args) {
        // Creamos objeto Manejando palabras q se llama m
        ManejandoPalabras m=new ManejandoPalabras();
        
        //Muestro el contenido de los dos atributos
        System.out.println(m.palabra);
        System.out.println("La longitud de la palabra es "+ m.longitudPalabra);//Añado algo de texto para que me mnuetsr mas info en la consola
        
        //Modifico los valores  	
        
        m.palabra="Modifico el valor"; //faltaba poner a quien le modificas valores, en este caso al objeto m
        m.longitudPalabra=10;//faltaba poner a quien le modificas valores en este caso al objeto m
        
        //Muestro el contenido de los dos atributos despues de la modificación
        System.out.println(m.palabra);
        System.out.println("La longitud de la palabra después de haber modificado es  "+m.longitudPalabra);
        //Imprimo el resultado de extraer la longitud de la plabra que hemos indicado  
        System.out.println("La longitud de la palabra q hemos indicado es  "+m.palabra.length() );
    }

}