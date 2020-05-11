import java.util.Scanner;
import java.lang.Math;
public class Exercicio4A
{
	public static void main (String [] args)
	{
		Scanner entrada = new Scanner (System.in);

		System.out.println ("Digite 't' para triangulo, 'q' para quadrado ou 'i' para IMC: ");
		char opcao = entrada.next().charAt(0);

		if (opcao == 't')
		{
			System.out.println ("Tamanho da base: ");
			float base = entrada.nextFloat();

			System.out.println ("Tamanho da altura: ");
			float altura = entrada.nextFloat();

			System.out.println ("A area do triangulo e: " + (base * altura) / 2);
		}
		else if (opcao == 'q')
		{
			System.out.println ("Tamanho do lado: ");
			float lado = entrada.nextFloat();

			System.out.println ("A area do quadrado e: " + (Math.pow(lado, 2)));
		}
		else if (opcao == 'i')
		{
			System.out.println ("Digite o peso (em Kg): ");
			float peso = entrada.nextFloat();

			System.out.println ("Digite a altura (em m): ");
			float altura = entrada.nextFloat();

			System.out.println ("O IMC e: " + (peso / (Math.pow (altura, 2))));
		}
		else
		{
			System.out.println ("Opcao invalida!");
		}
	}
}