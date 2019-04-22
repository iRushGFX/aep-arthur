package academico;

/**
* @author Rodrigo Augusto Gimenes de Oliveira
* @author Guilherme Felizardo Reis
*/

public class Aluno {
	private String nome;
	private int ra;
	
	public Aluno(int ra, String nome) {
		this.nome = nome;
		this.ra = ra;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public float getRA() {
		return this.ra;
	}
}
