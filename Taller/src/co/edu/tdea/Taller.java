package co.edu.tdea;

import java.util.Scanner;

public class Taller {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al TALLER DE ALGORITMOS");
		
		System.out.println("Por favor seleccione un punto del taller");
		System.out.println("1.");
		System.out.println("2.");
		System.out.println("3.");
		System.out.println("4.");
		System.out.println("5.");
		System.out.println("6.");
		System.out.println("7.");
		System.out.println("8.");
		System.out.println("9.");
		System.out.println("10.");
		
		int option = sc.nextInt();
		
		Puntos puntos = new Puntos();
		
		System.out.println(option);
		
		switch (option) {
		case 1: {
			puntos.p1_promedio(sc);
		}
		case 2: {
			
		}
		case 3: {
			
		}
		case 4: {
			
		}
		case 5: {
			puntos.p5_divisores(sc);
		}
		case 6: {
			
		}
		case 7: {
			
		}
		case 8: {
			
		}
		case 9: {
			
		}
		case 10: {
			
		}
		default:
			break;
		}
		
		

	}

}
