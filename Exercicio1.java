import java.util.Scanner;

public class Exercicio1{

	public static void main (String [] args)
	{
		Scanner entrada = new Scanner (System.in);
		System.out.println ("Digite seu nome: ");
		String usuario = entrada.nextLine();

		System.out.println ("Ola " + usuario + "! Seja Bem Vindo!");
	}
}