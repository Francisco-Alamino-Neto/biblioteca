package livraria;

public class Aluno extends Usuario {

	public Aluno(int id, String nome, String email) {
		super(id, nome, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getLimiteEmprestimos() {
		return 2;
	}

	
	

}
