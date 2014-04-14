package com.retos.damRelampago;

public class Desastre {

    public static void main(String[] args) {
        // INICIALIZAMOS
        int vidas=0;
        int danyo=1;
        short botiquin=1;
        String jugador="Paco";
        
        // COMIENZO
        vidas=2;
        
        //Nos hacen danyo
        vidas=vidas-danyo;
        vidas=vidas-danyo;
        
        //Utilizo botiquin
        vidas++;
       //Pongo botiquin a 0 (aunque creo podría tambien ser botiquin=(short) (botiquin-botiquin); para que lo reste solo)
        botiquin--;
        
       //Estructura de control para q detecte si el botiquin es = 0  imprime una cosa
        if (botiquin==0){
        	System.out.println("El jugador es "+jugador+", le queda de vida: "+vidas+" y ningun botiquin");
        }
        else { //si no está a 0 el botiquin imprimirá esta otra
        
        //IMPRIMO ESTADO DEL JUGADOR
        	System.out.println("El jugador es "+jugador+", le queda de vida: "+vidas+", y "+botiquin+" botiquin");
        		       }
        

    }

}