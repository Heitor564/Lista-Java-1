import java.util.Scanner;
public class Exercicio4B
{
	public static void main (String [] args)
	{
		Scanner entrada = new Scanner (System.in);

		System.out.println ("Digite uma distancia (em Km): ");
		float km = entrada.nextFloat();

		System.out.println ("A distancia em milhas e: " + (km / 1.60934));
	}
}