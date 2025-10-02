package livraria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Livro l1 = new Livro(1, "Apologia de Sócrates", "Platão", Status.DISPONIVEL);
		Livro l2 = new Livro(2, "O Senhor dos Anéis", "J.R.R. Tolkien", Status.DISPONIVEL);
		Livro l3 = new Livro(64, "Guerra e Paz", "Liev Tólstoi", Status.DISPONIVEL);
		Livro l4 = new Livro(4, "Os Lusíadas", "Luís de Camões", Status.DISPONIVEL);
		Livro l5 = new Livro(5, "Crime e Castigo", "Fiódor Dostoiévski", Status.DISPONIVEL);
		
		Aluno aluno = new Aluno(1, "Aluno", "aluno@gmail.com");
		Professor prof = new Professor(2, "Professor", "professor@gmail.com");

		Biblioteca bibl = new Biblioteca();

		bibl.adicionarLivro(l1);
		bibl.adicionarLivro(l2);
		bibl.adicionarLivro(l3);
		bibl.adicionarLivro(l4);
		bibl.adicionarLivro(l5);


		int menuConta = 0;
		int menuDevolverEmprestar = 0;
		int devolver = 0;
		int menuLivro = 0;

		do {
			Usuario usuarioSelecionado = null;
			
			while (true) { // Loop para garantir escolha válida de conta
			System.out.println("Escolha uma conta:"
					+ "\n1 - Professor;" 
					+ "\n2 - Aluno;");
			menuConta = sc.nextInt();
			if (menuConta == 1) {
				System.out.println("Você selecionou: " + prof.getNome());
				usuarioSelecionado = prof;
				break;
			} else if (menuConta == 2) {
				System.out.println("Você selecionou: " + aluno.getNome());
				usuarioSelecionado = aluno;
				break;
			} else {
				System.out.println("Nenhum perfil selecionado, tente novamente.");
			}
			}

			while (true) {
			System.out.println("Você deseja pegar, devolver um livro ou encerrar o programa?"
					+ "\n1 - Pegar;"
					+ "\n2 - Devolver;"
					+ "\n3 - Encerrar Programa.");
			menuDevolverEmprestar = sc.nextInt();
			if (menuDevolverEmprestar == 1) {
				System.out.println("Você irá pegar um livro.");
				break;
			} else if (menuDevolverEmprestar == 2) {
				System.out.println("Você deseja devolver um livro, qual?"
						+ "\n1 - Apologia de Sócrates;"
						+ "\n2 - Senhor dos Anéis;"
						+ "\n3 - Guerra e Paz;"
						+ "\n4 - Os Lusíadas;"
						+ "\n5 - Crime e Castigo;");
				devolver = sc.nextInt();
				if (devolver == 1) {
					bibl.devolverLivro(usuarioSelecionado, l1);
				} else if (devolver == 2) {
					bibl.devolverLivro(usuarioSelecionado, l2);
				} else if (devolver == 3) {
					bibl.devolverLivro(usuarioSelecionado, l3);
				} else if (devolver == 4) {
					bibl.devolverLivro(usuarioSelecionado, l4);
				} else if (devolver == 5) {
					bibl.devolverLivro(usuarioSelecionado, l5);
				} else {
					System.out.println("Esse livro não existe");
				}
			}
			}
			
			System.out.println("Escolha um livro:" 
					+ "\n1 - Apologia de Sócrates;" 
					+ "\n2 - Senhor dos Anéis;" 
					+ "\n3 - Guerra e Paz;"
					+ "\n4 - Os Lusíadas;" 
					+ "\n5 - Crime e Castigo;");
			menuLivro = sc.nextInt();
			if (menuLivro == 1) {
				System.out.println("Você selecionou: " + l1.getTitulo());
				if (l1.getStatus() == Status.DISPONIVEL) {
					bibl.emprestarLivro(usuarioSelecionado, l1); // Chama o método 'emprestarLivro' da classe 'Biblioteca' para emprestar o livro 'l1', ao usuário atualmente selecionado (pode ser um Aluno ou Professor).
				} else {
				System.out.println("Este livro esta indisponivel");
				}
			} else if (menuLivro == 2) {
				System.out.println("Você selecionou: " + l2.getTitulo());
				if (l2.getStatus() == Status.DISPONIVEL) {
					bibl.emprestarLivro(usuarioSelecionado, l2);
				} else {
				System.out.println("Este livro esta indisponivel");
				}
			} else if (menuLivro == 3) {
				System.out.println("Você selecionou: " + l3.getTitulo());
				if (l3.getStatus() == Status.DISPONIVEL) {
					bibl.emprestarLivro(usuarioSelecionado, l3);
				} else {
				System.out.println("Este livro esta indisponivel");
				}
			} else if (menuLivro == 4) {
				System.out.println("Você selecionou: " + l4.getTitulo());
				if (l4.getStatus() == Status.DISPONIVEL) {
					bibl.emprestarLivro(usuarioSelecionado, l4);
				} else {
				System.out.println("Este livro esta indisponivel");
				}
			} else if (menuLivro == 5) {
				System.out.println("Você selecionou: " + l5.getTitulo());
				if (l5.getStatus() == Status.DISPONIVEL) {
					bibl.emprestarLivro(usuarioSelecionado, l5);
				} else {
				System.out.println("Este livro esta indisponivel");
				}
			}
		} while (menuConta != 3 || menuDevolverEmprestar != 2 || devolver != 6 || menuLivro != 6);
		sc.close();
	}

}
