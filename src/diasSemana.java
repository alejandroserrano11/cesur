


import java.util.Scanner;





public class diasSemana {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
	
		
		
		int diaSemana = 0;
		int semana = 0;
		int mesaño = 0;
		int totalDia = 0;
		int mesCompleto = 0;
		int mesIncompleto = 0;
		
		System.out.print("Introduce un número entre 1 y 336: ");
		totalDia = teclado.nextInt();
		
		
		
		mesCompleto = (totalDia/28);
		
		mesIncompleto = (totalDia - (mesCompleto*28));
		
		
		
		
		while (mesaño < mesCompleto-1) {
			
			switch (mesaño) {
			case 0:
				System.out.print("Enero ");
				break;
			case 1:
				System.out.print("Febrero ");
				break;
			case 2:
				System.out.print("Marzo ");
				break;
			case 3:
				System.out.print("Abril ");
				break;
			case 4:
				System.out.print("Mayo ");
				break;
			case 5:
				System.out.print("Junio ");
				break;
			case 6:
				System.out.print("Julio ");
				break;
			case 7:
				System.out.print("Agosto ");
				break;
			case 8:
				System.out.print("Septiembre ");
				break;
			case 9:
				System.out.print("Octubre ");
				break;
			case 10:
				System.out.print("Noviembre ");
				break;
			case 11:
				System.out.print("Diciembre ");
				break;

			}
			semana = 0;
			while (semana < 4) {
				diaSemana = 0;
				while (diaSemana <= 7) {
					if (diaSemana == 1) {
						System.out.print("[L" + " ");
					} else if (diaSemana == 2) {
						System.out.print("M" + " ");
					} else if (diaSemana == 3) {
						System.out.print("X" + " ");
					} else if (diaSemana == 4) {
						System.out.print("J" + " ");
					} else if (diaSemana == 5) {
						System.out.print("V" + " ");
					} else if (diaSemana == 6) {
						System.out.print("S" + " ");
					} else if (diaSemana == 7) {
						System.out.print("D]" + " ");
					}

					diaSemana = diaSemana + 1;

				}
				semana = semana + 1;
			}
			System.out.println();

			mesaño = mesaño + 1;
		}

	}
}
