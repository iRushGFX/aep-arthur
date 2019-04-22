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
	    int contador2 = 0;
	    float somaNotas = 0;
	    float mediaAluno = 0;
	    boolean primeiraVez = false;
	    Avaliacao aux;
	    ArrayList aprovados = new ArrayList();
	    
	    while(contador < this.avaliacoes.size()){
	    	aux = avaliacoes.get(contador);
	    	somaNotas += aux.getNota();
	    	if (primeiraVez == false) {
	    		
		    	if(contador%3 == 0 && contador != 0 && primeiraVez == false) {
		    		mediaAluno = somaNotas/4;
		    		
		    		
	                if(mediaAluno >= 6.0) {
	                	aprovados.add(aux.getAluno().getNome());
	                }
	                
	                primeiraVez = true;
	                contador2 = contador + 4;
	            	mediaAluno = 0;
	                somaNotas = 0;
		    		
		    	}
	    	}
	    	
	    	if(primeiraVez == true) {
	    		if(contador == contador2) {
	    			mediaAluno = somaNotas/4;
	                
	    			if(mediaAluno >= 6.0) {
	                	aprovados.add(aux.getAluno().getNome());
	                }
	    			
	    			contador2 += 4;
	            	mediaAluno = 0;
	                somaNotas = 0;
	    		}
	    	}
	    	contador++;
	    }
	    return aprovados;
	}	
}
	
	
	

