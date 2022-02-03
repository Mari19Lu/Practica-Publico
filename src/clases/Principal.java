package clases;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	Scanner sc;

	public Principal(){
		boolean sw=true;
		while(sw){
			System.out.println("Ingrese su nombre :");
			sc = new Scanner(System.in);
			String s=sc.next();
			if(s.equalsIgnoreCase("Salir")){
				sw=false;
			}else{
				System.out.println("su nombre :"+s);
			}
		}
	}

	public static void main(String arg[]){
		new Principal();		
	}

}
