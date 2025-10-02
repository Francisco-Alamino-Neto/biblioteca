package livraria;

public class Professor extends Usuario {

	public Professor(int id, String nome, String email) {
		super(id, nome, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getLimiteEmprestimos() {
		return 5;
		
	}

}
