import java.util.Scanner;
public class Exercicio2
{
	public static void main (String [] args)
	{
		Scanner entrada = new Scanner (System.in);

		System.out.println ("Nome do aluno: ");
		String aluno = entrada.nextLine();

		System.out.println ("Primeira nota: ");
		float nota1 = entrada.nextFloat();

		System.out.println ("Segunda nota: ");
		float nota2 = entrada.nextFloat();

		System.out.println ("Terceira nota: ");
		float nota3 = entrada.nextFloat();

		System.out.println ("Quarta nota: ");
		float nota4 = entrada.nextFloat();

		System.out.println ("A media em matematica do aluno " + aluno + " e: " + (nota1 + nota2 + nota3 + nota4) / 4);
	}
}