package academico;

/**
* @author Rodrigo Augusto Gimenes de Oliveira
* @author Guilherme Felizardo Reis
*/

public class Avaliacao {
	private float nota;
	private Disciplina disciplina;
	private Aluno aluno;
	
	public Avaliacao(Aluno aluno, Disciplina disciplina, float nota) {
		if (nota>10 || nota<0) {
			throw new RuntimeException("Só é permitido nota entre 0 e 10.");
		}else {
			this.nota = nota;
		}
		this.aluno = aluno;
		this.disciplina = disciplina;
	}
	
	public float getNota() {
		return this.nota;
	}
	
	public Disciplina getDisciplina() {
		return this.disciplina;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
}
