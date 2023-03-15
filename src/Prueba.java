import java.util.Scanner;

/**
 * 
 * @author DAM114V
 *
 */
public class Prueba {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		int opcion, n1, n2, res;
		double d1, d2, resu;
		do {
			System.out.println("Seleccione una opcion" + "\r\n1. Suma" + "\r\n2. Resta" + "\r\n3. Multiplicación"
					+ "\r\n4. División" + "\r\n0. Salir");
			opcion = tc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Suma");
				System.out.println("1er numero");
				n1 = tc.nextInt();
				System.out.println("2o numero");
				n2 = tc.nextInt();
				res = n1 + n2;
				System.out.println("resultado: " + res);
				break;
			// *****************************
			case 2:
				System.out.println("Resta");
				System.out.println("1er numero");
				n1 = tc.nextInt();
				System.out.println("2o numero");
				n2 = tc.nextInt();
				res = n1 - n2;
				System.out.println("resultado: " + res);
				break;
			// *****************************
			case 3:
				System.out.println("Multiplicación");
				System.out.println("1er numero");
				n1 = tc.nextInt();
				System.out.println("2o numero");
				n2 = tc.nextInt();
				res = n1 * n2;
				System.out.println("resultado: " + res);
				break;
			// *****************************
			case 4:
				System.out.println("División");
				System.out.println("1er numero");
				d1 = tc.nextDouble();
				System.out.println("2o numero");
				d2 = tc.nextDouble();
				resu = d1 / d2;
				System.out.println("resultado: " + resu);
				break;
			// *****************************
			case 0:
				System.out.println("Fin de programa");
				break;
			default:
				System.out.println("Numero no valido");
				break;
			}

		} while (opcion != 0);
		tc.close();
	}

}
