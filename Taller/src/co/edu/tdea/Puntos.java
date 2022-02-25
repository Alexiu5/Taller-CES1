package co.edu.tdea;

import java.time.LocalTime;
import java.util.Scanner;

public class Puntos {
	public void p1_promedio(Scanner sc) {
		double nota1, nota2, nota3;
		
		System.out.println("Digite la primera nota");
		nota1 = sc.nextDouble();
		System.out.println("Digite la segunda nota");
		nota2 = sc.nextDouble();
		System.out.println("Digite la tercera nota");
		nota3 = sc.nextDouble();
		
		double promedio = (nota1*0.30) + (nota2*0.30) + (nota3 * 0.40);
		
		System.out.println("El promedio de la nota es: " + promedio);
	}
	
	public void p2_perimetro_cuadrado(Scanner sc) {
		int base, altura;
		
		System.out.println("Digite la base");
		base = sc.nextInt();
		
		System.out.println("Digite la altura");
		altura = sc.nextInt();
				
				
		int area = base*altura,
			perimetro = (2*base)+(2*altura);
		
		System.out.println("area: " + area);
		System.out.println("perimetro: " + perimetro);
		
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
				semi = (int) ((ladoA+ladoB+ladoC)/2);
				Double area = Math.sqrt(semi* (semi - ladoA) * (semi - ladoB) * (semi - ladoC));
				
		
		
		System.out.println("perimetro: "+ perimetro);
		System.out.println("semi-perimetro: "+ semi);
		System.out.println("area: "+ area);
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
			System.out.print("= "+ nro);
		} else {
			System.out.println(" El nro no es primo");
		}
		
	}

	public void p6_acumulado(Scanner sc) {
		int acumulado = 0;
		double total;

		for (int i = 0; i < 99; i++) {
			acumulado += i;
		}
		
		total = Math.sqrt(acumulado);
		System.out.println("Acumulado:" + total);
	}
	
	public void p7_logaritmo() {
		int sumTotal = 0;
		double total;
		
		for (int i = 0; i < 199; i++) {
			sumTotal += i*i;
		}
		
		total = Math.log(sumTotal);
		
		System.out.println("Logaritmo: " + total);
	}
	
	public void p8_time() {
		LocalTime now = LocalTime.now();
		LocalTime horaInicial = now.with(LocalTime.MIDNIGHT);
		
		int diff = (now.getHour() - horaInicial.getHour());
		
		System.out.println("La cantidad de hora que pasaron desde la 12:00am es: " + diff);
	}
	
	public void p9_suma_cubos(Scanner sc) {
		int n, sumTotal = 0;
		
		System.out.println("ingrese n");
		n = sc.nextInt();
		
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				sumTotal += Math.pow(i, 3);
			}
		}
		
		System.out.println(
			"La suma total de los cubos para el nro" + " " +
			n + " " + "es: " + sumTotal
		);
	}
	
	public void p10_productos(Scanner sc, Boolean isRepeatEjercicio) {
			String nombreProducto;
			double valorProducto, descuento, total, neto, valorImpuesto;
			int impuesto;
			System.out.println("Digite el nombre del producto");
			nombreProducto = sc.next();
			
			System.out.println("Digite el valor del producto");
			valorProducto = sc.nextDouble();
			
			System.out.println("Digite el valor del impuesto (en entero)");
			impuesto = sc.nextInt();
		
			System.out.println("producto:" + nombreProducto);


			double porcentaje = Double.parseDouble("0." + impuesto);
			if (impuesto >= 10 && impuesto <= 20) {
				valorImpuesto = porcentaje * valorProducto;
				neto = valorImpuesto + valorProducto;
				total = ((neto * 0.40)+ neto);
				
				System.out.println("valorImpuesto:" + valorImpuesto);
				System.out.println("neto:" + neto);
				System.out.println("total:" + total);
			}else if (impuesto > 20) {
				valorImpuesto = porcentaje * valorProducto;
				double porcentajeDescuento = Double.parseDouble("1.5") / 100;

				descuento =  (long) (valorProducto * porcentajeDescuento);
				total = (valorImpuesto + valorProducto) - descuento;

				System.out.println("valorImpuesto:"+ valorImpuesto);
				System.out.println("descuento:"+ descuento);
				System.out.println("total:"+ total);
			} else {
				System.out.println("porcentaje fuera de rango:" + impuesto);
			}
	}
	
	
}
