package co.edu.tdea;

import java.util.Iterator;
import java.util.Scanner;

public class Puntos {
	public void p1_promedio(Scanner sc) {
		int nota1, nota2, nota3;
		
		System.out.println("Digite la primera nota");
		nota1 = sc.nextInt();
		System.out.println("Digite la segunda nota");
		nota2 = sc.nextInt();
		System.out.println("Digite la tercera nota");
		nota3 = sc.nextInt();
		
		double promedio = (nota1*0.30) + (nota2*0.30) + (nota3 * 0.40);
		
		System.out.println("El promedio de la nota es" + promedio);
	}
	
	public void p2_perimetro_cuadrado(Scanner sc) {
		int base, altura;
		
		System.out.println("Digite la base");
		base = sc.nextInt();
		
		System.out.println("Digite la altura");
		altura = sc.nextInt();
				
				
		int area = base*altura,
			perimetro = (2*base)+(2*altura);
		
		System.out.println("area" + area);
		System.out.println("perimetro" + perimetro);
		
	}
	
	public void p3() {
		System.out.println("...");
	}
	
	
	public void p4_perimetro_triangulo(Scanner sc) {
		int ladoA, ladoB, ladoC;
		
		System.out.println("Digite lado A");
		ladoA = sc.nextInt();
				System.out.println("Digite lado B");
		ladoB = sc.nextInt();
				System.out.println("Digite lado C");
		ladoC = sc.nextInt();
		
		int perimetro = (ladoA + ladoB + ladoC),
				semi = perimetro / 2,
				area = (semi * (semi - ladoA)*(semi - ladoB) *(semi - ladoC));
		
		System.out.println("perimetro:"+ perimetro);
		System.out.println("semi-perimetro:"+ semi);
		System.out.println("area:"+ area);
	}
	
	public void p5_divisores(Scanner sc) {
		int nro,
			divisores = 0;
		
		System.out.println("Digite el nro");
		nro = sc.nextInt();
		
		for (int i = 1; i <= nro; i++) {
			if (nro != 0 && nro % i == 0) {
				divisores++;
			}
		}
		
		
		if (divisores == 2) {
			int j = 1, sumaTotal = 0, diff;
			
			
			while (j < nro) {
				
				sumaTotal = sumaTotal + j;
				
				if (sumaTotal >= nro) {
					diff = (nro - sumaTotal);
					
					if (diff < 0) {
						System.out.print(diff + j);
					}
					break;
				} else {
					System.out.print(j + "+");
				}
				j++;
			}
		}
		
	}
}
