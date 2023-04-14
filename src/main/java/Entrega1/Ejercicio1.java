package Entrega1;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe 2 números: ");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		String resultado = (num1 == num2)? "Son iguales" :"Son distintos";
		System.out.println(resultado);
		System.out.println();
	}

}
