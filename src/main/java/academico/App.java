package academico;

/**
* @author Rodrigo Augusto Gimenes de Oliveira
* @author Guilherme Felizardo Reis
*/

public class App {
	public static void main(String[] args) {
		
		//Criando as 05 disciplinas
		Disciplina matematica = new Disciplina("Matemática");
		Disciplina portugues = new Disciplina("Português");
		Disciplina artes = new Disciplina("Artes");
		Disciplina geografia = new Disciplina("Geografia");
		Disciplina filosofia = new Disciplina("Filosofia");
		
		//Criando os 10 alunos
		Aluno aluno01 = new Aluno(1010, "Rodrigo Augusto");
		Aluno aluno02 = new Aluno(2020, "João Pé de Feijão");
		Aluno aluno03 = new Aluno(3030, "Zacarias da Mota");
		Aluno aluno04 = new Aluno(4040, "Tonho da Cruz");
		Aluno aluno05 = new Aluno(5050, "Beatriz da Silva");
		Aluno aluno06 = new Aluno(6060, "Ana Banana");
		Aluno aluno07 = new Aluno(7070, "Jaqueline Sthefany");
		Aluno aluno08 = new Aluno(8080, "Janaina Costa");
		Aluno aluno09 = new Aluno(9090, "Bruno Oliveira");
		Aluno aluno10 = new Aluno(1111, "Abel Linares");
		
		//Criando as avaliações de Matemática
		//Aluno REPROVADO
		Avaliacao matematica1 = new Avaliacao(aluno01, matematica, 6.0f);
		Avaliacao matematica2 = new Avaliacao(aluno01, matematica, 5.0f);
		Avaliacao matematica3 = new Avaliacao(aluno01, matematica, 4);
		Avaliacao matematica4 = new Avaliacao(aluno01, matematica, 7);
		
		//Alunos APROVADOS
		Avaliacao matematica5 = new Avaliacao(aluno02, matematica, 7);
		Avaliacao matematica6 = new Avaliacao(aluno02, matematica, 6);
		Avaliacao matematica7 = new Avaliacao(aluno02, matematica, 7);
		Avaliacao matematica8 = new Avaliacao(aluno02, matematica, 5);
		
		Avaliacao matematica9 = new Avaliacao(aluno03, matematica, 7);
		Avaliacao matematica10 = new Avaliacao(aluno03, matematica, 6);
		Avaliacao matematica11 = new Avaliacao(aluno03, matematica, 7);
		Avaliacao matematica12 = new Avaliacao(aluno03, matematica, 5);
		
		Avaliacao matematica13 = new Avaliacao(aluno04, matematica, 8);
		Avaliacao matematica14 = new Avaliacao(aluno04, matematica, 8);
		Avaliacao matematica15 = new Avaliacao(aluno04, matematica, 8);
		Avaliacao matematica16 = new Avaliacao(aluno04, matematica, 8);
		
		Avaliacao matematica17 = new Avaliacao(aluno05, matematica, 7);
		Avaliacao matematica18 = new Avaliacao(aluno05, matematica, 2);
		Avaliacao matematica19 = new Avaliacao(aluno05, matematica, 4);
		Avaliacao matematica20 = new Avaliacao(aluno05, matematica, 5);
		
		Avaliacao matematica21 = new Avaliacao(aluno06, matematica, 8);
		Avaliacao matematica22 = new Avaliacao(aluno06, matematica, 5);
		Avaliacao matematica23 = new Avaliacao(aluno06, matematica, 7);
		Avaliacao matematica24 = new Avaliacao(aluno06, matematica, 6);
		
		Avaliacao matematica25 = new Avaliacao(aluno07, matematica, 8);
		Avaliacao matematica26 = new Avaliacao(aluno07, matematica, 9);
		Avaliacao matematica27 = new Avaliacao(aluno07, matematica, 6);
		Avaliacao matematica28 = new Avaliacao(aluno07, matematica, 5);
		
		Avaliacao matematica29 = new Avaliacao(aluno08, matematica, 7);
		Avaliacao matematica30 = new Avaliacao(aluno08, matematica, 7);
		Avaliacao matematica31 = new Avaliacao(aluno08, matematica, 5);
		Avaliacao matematica32 = new Avaliacao(aluno08, matematica, 7);
		
		Avaliacao matematica33 = new Avaliacao(aluno09, matematica, 6);
		Avaliacao matematica34 = new Avaliacao(aluno09, matematica, 6);
		Avaliacao matematica35 = new Avaliacao(aluno09, matematica, 9);
		Avaliacao matematica36 = new Avaliacao(aluno09, matematica, 7);
		
		Avaliacao matematica37 = new Avaliacao(aluno10, matematica, 6);
		Avaliacao matematica38 = new Avaliacao(aluno10, matematica, 6);
		Avaliacao matematica39 = new Avaliacao(aluno10, matematica, 7);
		Avaliacao matematica40 = new Avaliacao(aluno10, matematica, 7);
		
		RepositorioDeAvaliacoes repositorioMatematica = new RepositorioDeAvaliacoes();
		
		repositorioMatematica.adicionar(matematica1);
		repositorioMatematica.adicionar(matematica2);
		repositorioMatematica.adicionar(matematica3);
		repositorioMatematica.adicionar(matematica4);
		repositorioMatematica.adicionar(matematica5);
		repositorioMatematica.adicionar(matematica6);
		repositorioMatematica.adicionar(matematica7);
		repositorioMatematica.adicionar(matematica8);
		repositorioMatematica.adicionar(matematica9);
		repositorioMatematica.adicionar(matematica10);
		repositorioMatematica.adicionar(matematica11);
		repositorioMatematica.adicionar(matematica12);
		repositorioMatematica.adicionar(matematica13);
		repositorioMatematica.adicionar(matematica14);
		repositorioMatematica.adicionar(matematica15);
		repositorioMatematica.adicionar(matematica16);
		repositorioMatematica.adicionar(matematica17);
		repositorioMatematica.adicionar(matematica18);
		repositorioMatematica.adicionar(matematica19);
		repositorioMatematica.adicionar(matematica20);
		repositorioMatematica.adicionar(matematica21);
		repositorioMatematica.adicionar(matematica22);
		repositorioMatematica.adicionar(matematica23);
		repositorioMatematica.adicionar(matematica24);
		repositorioMatematica.adicionar(matematica25);
		repositorioMatematica.adicionar(matematica26);
		repositorioMatematica.adicionar(matematica27);
		repositorioMatematica.adicionar(matematica28);
		repositorioMatematica.adicionar(matematica29);
		repositorioMatematica.adicionar(matematica30);
		repositorioMatematica.adicionar(matematica31);
		repositorioMatematica.adicionar(matematica32);
		repositorioMatematica.adicionar(matematica33);
		repositorioMatematica.adicionar(matematica34);
		repositorioMatematica.adicionar(matematica35);
		repositorioMatematica.adicionar(matematica36);
		repositorioMatematica.adicionar(matematica37);
		repositorioMatematica.adicionar(matematica38);
		repositorioMatematica.adicionar(matematica39);
		repositorioMatematica.adicionar(matematica40);
		
		
		
		System.out.println(repositorioMatematica.obterAprovados(matematica));
		
		System.out.println(matematica35.getAluno().getNome());
		

		

		
	}
}
