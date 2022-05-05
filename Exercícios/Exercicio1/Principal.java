import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
			System.out.println("Por favor, selecione uma opção para adicionar: (1)Nome ou (2)Nome e idade");
			String tipo = leitura.nextLine();
			if(tipo.equals("1")) {
				System.out.println("Insira o Nome:");
				String nome1 = leitura.nextLine();
				Pessoa pessoa = new Pessoa(nome1);
			}
			else if(tipo.equals("2")) {
				System.out.println("Insira o Nome:");
				String nome1 = leitura.nextLine();
				System.out.println("Insira a idade:");
				int idade1 = Integer.valueOf(leitura.nextLine());
				Pessoa pessoa = new Pessoa(nome1, idade1);
			}
			else {
				System.out.println("Comando inválido!");
			}
}}