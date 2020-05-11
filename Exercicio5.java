import java.util.Scanner;
public class Exercicio5
{
	public static void main (String [] args)
	{
		Scanner entrada = new Scanner (System.in);

		System.out.println ("Quantidade de meses: ");
		int meses = entrada.nextInt();

		System.out.println ("A quantidade em dias e: " + (meses * 30));
	}
}