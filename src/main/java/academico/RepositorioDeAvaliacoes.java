package academico;

/**
* @author Rodrigo Augusto Gimenes de Oliveira
* @author Guilherme Felizardo Reis
*/

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAvaliacoes {
	private List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
	
	
	
	public void adicionar(Avaliacao avaliacao) {
		this.avaliacoes.add(avaliacao);
	}
	
    public ArrayList obterAprovados(Disciplina disciplina){
        int contador = 0;
        Avaliacao aux;
        ArrayList aprovados = new ArrayList();
        while(contador < this.avaliacoes.size()){
            aux = this.avaliacoes.get(contador);
            if()
            contador++;
        }
        return aprovados;
    }	
	
}
	
	
	

