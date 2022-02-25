package co.edu.tdea;

import java.util.Scanner;

public class Taller {

	public static void main(String[] args) {
		boolean isCloseMenu = false;
		boolean isRepeatEjercicio = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al TALLER DE ALGORITMOS");
		
		while (isCloseMenu == false) {
			showMenu();
			
			System.out.println("digite una opcion");
			int option = sc.nextInt();
			Puntos puntos = new Puntos();
			
			System.out.println(option);
			
			switch (option) {
				case 1: {
					puntos.p1_promedio(sc);
					break;
				}
				case 2: {
					puntos.p2_perimetro_cuadrado(sc);
					break;
				}
				case 3: {
					puntos.p3();
					break;
				}
				case 4: {
					puntos.p4_perimetro_triangulo(sc);
					break;
				}
				case 5: {
					puntos.p5_divisores(sc);
					break;
				}
				case 6: {
					puntos.p6_acumulado(sc);
					break;
				}
				case 7: {
					puntos.p7_logaritmo();
					break;
				}
				case 8: {
					puntos.p8_time();
					break;
				}
				case 9: {
					puntos.p9_suma_cubos(sc);
					break;
				}
				case 10: {
					puntos.p10_productos(sc, isRepeatEjercicio);
					break;
				}
				default:
					System.out.println("Opcion invalida");
					break;
			}
			
			System.out.println("\n");
			System.out.println("""
					Terminar ejecucion?
					0 si 1 no
					""");
			if (sc.nextInt() == 0) {
				isCloseMenu = true;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("Por favor seleccione un punto del taller");
		System.out.println("""
			1.
			2.
			3.
			4.
			5.
			6.
			7.
			8.
			9.
			10.
		""");


	}

}
