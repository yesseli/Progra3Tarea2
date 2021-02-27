package Tarea2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HangarAviones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		Queue<String> cola = new LinkedList<>();
		int op = 0;

		while (op != 6) {
			System.out.println("ELIJA UNA OPCIÓN: ");
			System.out.println("1. Ingresar un avión: ");
			System.out.println("2. Mostrar aviones que actualmente están en el hangar: ");
			System.out.println("3. Aviones disponibles para salir:  ");
			System.out.println("4. Mostrar aviones pendientes de despegar: ");
			System.out.println("5. Anunciar próximo avión en despegar: ");
			System.out.println("6. SALIR ");
			op = entrada.nextInt();

			if (op == 1) {

				System.out.println("Cantidad de aviones a ingresar: ");
				int noAviones = entrada.nextInt();

				System.out.println("Ingrese la matrícula del avión ");
				cola.add(entrada.next());

			} else if (op == 2) {
				System.out.println("Aviones en el hangar:\n ");
				if (cola.isEmpty()) {
					System.out.println("El hangar está vacío \n");
				} else {
					System.out.println(cola);

				}
			} else if (op == 3) {
				System.out.println("Aviones disponibles para salir: \n");
				if (cola.isEmpty()) {
					System.out.println("No hay aviones disponibles \n");
				} else {
					System.out.println(cola.peek());
				}

			} else if (op == 4) {
				System.out.println("Aviones pendientes de despegue: \n");
				if (cola.isEmpty()) {
					System.out.println("No hay aviones disponibles \n");
				} else {
					System.out.println(cola);
				}

			} else if (op == 5) {
				System.out.println("Avion próximo en despegar: \n" + cola.peek());
				if (cola.isEmpty()) {
					System.out.println("No hay aviones disponibles \n");
				} else {
					System.out.println(cola.peek());
				}

			} else {
				if (op == 6) {
					System.out.println("Vuelva pronto ");
				}
			}
		}

	}
}
