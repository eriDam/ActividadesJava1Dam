package com.ScreenersPaco.Video12Condicionales;

public class CondicionalesIf {
	
	public static void main (String []args) {
			int comparacion=9;
			//if habitual
			if(comparacion<=10){
				System.out.println("Si Es menor o igual que 10 se imprimirá, en este caso lo es");
			}	
			
			if(comparacion==0){
				System.out.println("Si Es igual que 0 se imprimirá, en este caso no lo es");
				//para realizar una nueva pregunta, pueden poner muchas else if
				}else if(comparacion>0){
				System.out.println("Si Es mayor que 0 se imprimirá, en este caso lo es");
			
				} else if(comparacion<=10){
				System.out.println("Si <=10) se imprimirá, en este caso lo es");
			}
			//otra forma de poner el if
			if(comparacion==9) System.out.println("Es = a 9");
			System.out.println("La de antes  se ha impreso por que  es =9,  esta si por que no tiene if");
	}

}
