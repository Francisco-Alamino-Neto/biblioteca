package livraria;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private List<Livro> listaLivros = new ArrayList();
	private List<Emprestimo> emprestimos = new ArrayList();

	public Biblioteca() {

	}

	public List<Livro> getListaLivros() {
		return listaLivros;
	}

	public void adicionarLivro(Livro l) {
		listaLivros.add(l);
	}

	public void emprestarLivro(Usuario u, Livro codigo) {

		int contador = 0;

		for (Emprestimo emprestimo : emprestimos) {
			if (u.getId() == emprestimo.getUsuario().getId()) {
				contador = contador + 1;
			}
		}

		if (contador >= u.getLimiteEmprestimos()) {
			System.out.println("Entretanto, o limite já foi atingido, devolva um livro primeiro.");

		} else {

			boolean livroEncontrado = false;

			for (Livro liv : listaLivros) { // Procura o livro na lista de livros da biblioteca
				if (liv.getCodigoLivro() == codigo.getCodigoLivro()) { // Compara o código do livro desejado com os disponíveis
					livroEncontrado = true;
					if (liv.getStatus() == Status.DISPONIVEL) { // Verifica se o livro está disponível
						Emprestimo emp = new Emprestimo(u, liv); // Cria um novo registro de empréstimo
						emprestimos.add(emp); // Adiciona à lista de empréstimos
						System.out.println("Livro emprestado com sucesso.");
						liv.emprestar(); // Altera o status do livro para EMPRESTADO
					} else {
						System.out.println("Livro indisponível.");
					}
					break;
				}
			}

			if (!livroEncontrado) {
				System.out.println("Livro não encontrado na biblioteca.");
			}
		}
	}

	public void devolverLivro(Usuario u, Livro codigo) {
		u.getId();
		codigo.getCodigoLivro();

		boolean devolvido = false;

	    for (Emprestimo emp : emprestimos) {
	        if (emp.getLivro().getCodigoLivro() == codigo.getCodigoLivro() &&
	            emp.getUsuario().getId() == u.getId()) {

	            // Marca o livro como disponível
	            codigo.devolver();
	            devolvido = true;

	            // Remove o empréstimo da lista (opcional, se você quiser controlar histórico, pode não remover)
	            emprestimos.remove(emp);

	            System.out.println("Livro devolvido com sucesso.");
	            break;
			}
		}
	    if (!devolvido) {
	        System.out.println("Esse livro não foi emprestado para você.");
	    }
	}
	

	public void Mostrar() {

		System.out.println(listaLivros);
	}

}
