package livraria;

public class Livro implements Imprestavel {
	
	private int codigoLivro;
	private String titulo;
	private String autor;
	private Status status;
	
	public Livro(int codigoLivro, String titulo, String autor, Status status) {
		this.codigoLivro = codigoLivro;
		this.titulo = titulo;
		this.autor = autor;
		this.status = status;
	}

	public int getCodigoLivro() {
		return codigoLivro;
	}

	public void setCodigoLivro(int codigoLivro) {
		this.codigoLivro = codigoLivro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	

	public void emprestar() {
		status = status.EMPRESTADO;
	}
	

	public void devolver() {
		status = status.DISPONIVEL;
	}

	@Override
	public void emprestar(Usuario u) {
		emprestar();
		
	}

	@Override
	public String toString() {
		return "Livro [codigoLivro=" + codigoLivro + ", titulo=" + titulo + ", autor=" + autor + ", status=" + status
				+ "]";
	}
	
	
}
