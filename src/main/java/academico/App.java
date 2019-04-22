package academico;

import java.util.ArrayList;

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
		Avaliacao matematica1 = new Avaliacao(aluno01, matematica, 5);
		Avaliacao matematica2 = new Avaliacao(aluno01, matematica, 5);
		Avaliacao matematica3 = new Avaliacao(aluno01, matematica, 5);
		Avaliacao matematica4 = new Avaliacao(aluno01, matematica, 7);
		
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
		Avaliacao matematica18 = new Avaliacao(aluno05, matematica, 6);
		Avaliacao matematica19 = new Avaliacao(aluno05, matematica, 6);
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
		
		//------------------------------------------------------------------------------------

		//Criando as avaliações de Português
		Avaliacao portugues1 = new Avaliacao(aluno01, portugues, 6);
		Avaliacao portugues2 = new Avaliacao(aluno01, portugues, 6);
		Avaliacao portugues3 = new Avaliacao(aluno01, portugues, 6);
		Avaliacao portugues4 = new Avaliacao(aluno01, portugues, 7);
		
		Avaliacao portugues5 = new Avaliacao(aluno02, portugues, 3);
		Avaliacao portugues6 = new Avaliacao(aluno02, portugues, 3);
		Avaliacao portugues7 = new Avaliacao(aluno02, portugues, 3);
		Avaliacao portugues8 = new Avaliacao(aluno02, portugues, 3);
		
		Avaliacao portugues9 = new Avaliacao(aluno03, portugues, 2);
		Avaliacao portugues10 = new Avaliacao(aluno03, portugues, 2);
		Avaliacao portugues11 = new Avaliacao(aluno03, portugues, 5);
		Avaliacao portugues12 = new Avaliacao(aluno03, portugues, 3);
		
		Avaliacao portugues13 = new Avaliacao(aluno04, portugues, 8);
		Avaliacao portugues14 = new Avaliacao(aluno04, portugues, 8);
		Avaliacao portugues15 = new Avaliacao(aluno04, portugues, 8);
		Avaliacao portugues16 = new Avaliacao(aluno04, portugues, 8);
		
		Avaliacao portugues17 = new Avaliacao(aluno05, portugues, 7);
		Avaliacao portugues18 = new Avaliacao(aluno05, portugues, 6);
		Avaliacao portugues19 = new Avaliacao(aluno05, portugues, 6);
		Avaliacao portugues20 = new Avaliacao(aluno05, portugues, 5);
		
		Avaliacao portugues21 = new Avaliacao(aluno06, portugues, 8);
		Avaliacao portugues22 = new Avaliacao(aluno06, portugues, 5);
		Avaliacao portugues23 = new Avaliacao(aluno06, portugues, 7);
		Avaliacao portugues24 = new Avaliacao(aluno06, portugues, 6);
		
		Avaliacao portugues25 = new Avaliacao(aluno07, portugues, 8);
		Avaliacao portugues26 = new Avaliacao(aluno07, portugues, 9);
		Avaliacao portugues27 = new Avaliacao(aluno07, portugues, 6);
		Avaliacao portugues28 = new Avaliacao(aluno07, portugues, 5);
		
		Avaliacao portugues29 = new Avaliacao(aluno08, portugues, 7);
		Avaliacao portugues30 = new Avaliacao(aluno08, portugues, 7);
		Avaliacao portugues31 = new Avaliacao(aluno08, portugues, 5);
		Avaliacao portugues32 = new Avaliacao(aluno08, portugues, 7);
		
		Avaliacao portugues33 = new Avaliacao(aluno09, portugues, 6);
		Avaliacao portugues34 = new Avaliacao(aluno09, portugues, 6);
		Avaliacao portugues35 = new Avaliacao(aluno09, portugues, 9);
		Avaliacao portugues36 = new Avaliacao(aluno09, portugues, 7);
		
		Avaliacao portugues37 = new Avaliacao(aluno10, portugues, 6);
		Avaliacao portugues38 = new Avaliacao(aluno10, portugues, 6);
		Avaliacao portugues39 = new Avaliacao(aluno10, portugues, 7);
		Avaliacao portugues40 = new Avaliacao(aluno10, portugues, 7);
		
		RepositorioDeAvaliacoes repositorioPortugues = new RepositorioDeAvaliacoes();
		
		repositorioPortugues.adicionar(portugues1);
		repositorioPortugues.adicionar(portugues2);
		repositorioPortugues.adicionar(portugues3);
		repositorioPortugues.adicionar(portugues4);
		repositorioPortugues.adicionar(portugues5);
		repositorioPortugues.adicionar(portugues6);
		repositorioPortugues.adicionar(portugues7);
		repositorioPortugues.adicionar(portugues8);
		repositorioPortugues.adicionar(portugues9);
		repositorioPortugues.adicionar(portugues10);
		repositorioPortugues.adicionar(portugues11);
		repositorioPortugues.adicionar(portugues12);
		repositorioPortugues.adicionar(portugues13);
		repositorioPortugues.adicionar(portugues14);
		repositorioPortugues.adicionar(portugues15);
		repositorioPortugues.adicionar(portugues16);
		repositorioPortugues.adicionar(portugues17);
		repositorioPortugues.adicionar(portugues18);
		repositorioPortugues.adicionar(portugues19);
		repositorioPortugues.adicionar(portugues20);
		repositorioPortugues.adicionar(portugues21);
		repositorioPortugues.adicionar(portugues22);
		repositorioPortugues.adicionar(portugues23);
		repositorioPortugues.adicionar(portugues24);
		repositorioPortugues.adicionar(portugues25);
		repositorioPortugues.adicionar(portugues26);
		repositorioPortugues.adicionar(portugues27);
		repositorioPortugues.adicionar(portugues28);
		repositorioPortugues.adicionar(portugues29);
		repositorioPortugues.adicionar(portugues30);
		repositorioPortugues.adicionar(portugues31);
		repositorioPortugues.adicionar(portugues32);
		repositorioPortugues.adicionar(portugues33);
		repositorioPortugues.adicionar(portugues34);
		repositorioPortugues.adicionar(portugues35);
		repositorioPortugues.adicionar(portugues36);
		repositorioPortugues.adicionar(portugues37);
		repositorioPortugues.adicionar(portugues38);
		repositorioPortugues.adicionar(portugues39);
		repositorioPortugues.adicionar(portugues40);
		
		//------------------------------------------------------------------------------------

		//Criando as avaliações de Artes
		Avaliacao artes1 = new Avaliacao(aluno01, artes, 6);
		Avaliacao artes2 = new Avaliacao(aluno01, artes, 6);
		Avaliacao artes3 = new Avaliacao(aluno01, artes, 6);
		Avaliacao artes4 = new Avaliacao(aluno01, artes, 7);
		
		Avaliacao artes5 = new Avaliacao(aluno02, artes, 7);
		Avaliacao artes6 = new Avaliacao(aluno02, artes, 6);
		Avaliacao artes7 = new Avaliacao(aluno02, artes, 7);
		Avaliacao artes8 = new Avaliacao(aluno02, artes, 5);
		
		Avaliacao artes9 = new Avaliacao(aluno03, artes, 7);
		Avaliacao artes10 = new Avaliacao(aluno03, artes, 6);
		Avaliacao artes11 = new Avaliacao(aluno03, artes, 7);
		Avaliacao artes12 = new Avaliacao(aluno03, artes, 5);
		
		Avaliacao artes13 = new Avaliacao(aluno04, artes, 8);
		Avaliacao artes14 = new Avaliacao(aluno04, artes, 8);
		Avaliacao artes15 = new Avaliacao(aluno04, artes, 8);
		Avaliacao artes16 = new Avaliacao(aluno04, artes, 8);
		
		Avaliacao artes17 = new Avaliacao(aluno05, artes, 7);
		Avaliacao artes18 = new Avaliacao(aluno05, artes, 6);
		Avaliacao artes19 = new Avaliacao(aluno05, artes, 6);
		Avaliacao artes20 = new Avaliacao(aluno05, artes, 5);
		
		Avaliacao artes21 = new Avaliacao(aluno06, artes, 8);
		Avaliacao artes22 = new Avaliacao(aluno06, artes, 5);
		Avaliacao artes23 = new Avaliacao(aluno06, artes, 7);
		Avaliacao artes24 = new Avaliacao(aluno06, artes, 6);
		
		Avaliacao artes25 = new Avaliacao(aluno07, artes, 8);
		Avaliacao artes26 = new Avaliacao(aluno07, artes, 9);
		Avaliacao artes27 = new Avaliacao(aluno07, artes, 6);
		Avaliacao artes28 = new Avaliacao(aluno07, artes, 5);
		
		Avaliacao artes29 = new Avaliacao(aluno08, artes, 2);
		Avaliacao artes30 = new Avaliacao(aluno08, artes, 4);
		Avaliacao artes31 = new Avaliacao(aluno08, artes, 1);
		Avaliacao artes32 = new Avaliacao(aluno08, artes, 2);
		
		Avaliacao artes33 = new Avaliacao(aluno09, artes, 1);
		Avaliacao artes34 = new Avaliacao(aluno09, artes, 1);
		Avaliacao artes35 = new Avaliacao(aluno09, artes, 3);
		Avaliacao artes36 = new Avaliacao(aluno09, artes, 0);
		
		Avaliacao artes37 = new Avaliacao(aluno10, artes, 2);
		Avaliacao artes38 = new Avaliacao(aluno10, artes, 1);
		Avaliacao artes39 = new Avaliacao(aluno10, artes, 2);
		Avaliacao artes40 = new Avaliacao(aluno10, artes, 2);
		
		RepositorioDeAvaliacoes repositorioArtes = new RepositorioDeAvaliacoes();
		
		repositorioArtes.adicionar(artes1);
		repositorioArtes.adicionar(artes2);
		repositorioArtes.adicionar(artes3);
		repositorioArtes.adicionar(artes4);
		repositorioArtes.adicionar(artes5);
		repositorioArtes.adicionar(artes6);
		repositorioArtes.adicionar(artes7);
		repositorioArtes.adicionar(artes8);
		repositorioArtes.adicionar(artes9);
		repositorioArtes.adicionar(artes10);
		repositorioArtes.adicionar(artes11);
		repositorioArtes.adicionar(artes12);
		repositorioArtes.adicionar(artes13);
		repositorioArtes.adicionar(artes14);
		repositorioArtes.adicionar(artes15);
		repositorioArtes.adicionar(artes16);
		repositorioArtes.adicionar(artes17);
		repositorioArtes.adicionar(artes18);
		repositorioArtes.adicionar(artes19);
		repositorioArtes.adicionar(artes20);
		repositorioArtes.adicionar(artes21);
		repositorioArtes.adicionar(artes22);
		repositorioArtes.adicionar(artes23);
		repositorioArtes.adicionar(artes24);
		repositorioArtes.adicionar(artes25);
		repositorioArtes.adicionar(artes26);
		repositorioArtes.adicionar(artes27);
		repositorioArtes.adicionar(artes28);
		repositorioArtes.adicionar(artes29);
		repositorioArtes.adicionar(artes30);
		repositorioArtes.adicionar(artes31);
		repositorioArtes.adicionar(artes32);
		repositorioArtes.adicionar(artes33);
		repositorioArtes.adicionar(artes34);
		repositorioArtes.adicionar(artes35);
		repositorioArtes.adicionar(artes36);
		repositorioArtes.adicionar(artes37);
		repositorioArtes.adicionar(artes38);
		repositorioArtes.adicionar(artes39);
		repositorioArtes.adicionar(artes40);
		
		//------------------------------------------------------------------------------------
		
		//Criando as avaliações de Português
		Avaliacao geografia1 = new Avaliacao(aluno01, geografia, 6);
		Avaliacao geografia2 = new Avaliacao(aluno01, geografia, 6);
		Avaliacao geografia3 = new Avaliacao(aluno01, geografia, 6);
		Avaliacao geografia4 = new Avaliacao(aluno01, geografia, 7);
		
		Avaliacao geografia5 = new Avaliacao(aluno02, geografia, 1);
		Avaliacao geografia6 = new Avaliacao(aluno02, geografia, 1);
		Avaliacao geografia7 = new Avaliacao(aluno02, geografia, 1);
		Avaliacao geografia8 = new Avaliacao(aluno02, geografia, 1);
		
		Avaliacao geografia9 = new Avaliacao(aluno03, geografia, 0);
		Avaliacao geografia10 = new Avaliacao(aluno03, geografia, 1);
		Avaliacao geografia11 = new Avaliacao(aluno03, geografia, 0);
		Avaliacao geografia12 = new Avaliacao(aluno03, geografia, 1);
		
		Avaliacao geografia13 = new Avaliacao(aluno04, geografia, 2);
		Avaliacao geografia14 = new Avaliacao(aluno04, geografia, 4);
		Avaliacao geografia15 = new Avaliacao(aluno04, geografia, 2);
		Avaliacao geografia16 = new Avaliacao(aluno04, geografia, 5);
		
		Avaliacao geografia17 = new Avaliacao(aluno05, geografia, 1);
		Avaliacao geografia18 = new Avaliacao(aluno05, geografia, 3);
		Avaliacao geografia19 = new Avaliacao(aluno05, geografia, 5);
		Avaliacao geografia20 = new Avaliacao(aluno05, geografia, 2);
		
		Avaliacao geografia21 = new Avaliacao(aluno06, geografia, 8);
		Avaliacao geografia22 = new Avaliacao(aluno06, geografia, 5);
		Avaliacao geografia23 = new Avaliacao(aluno06, geografia, 7);
		Avaliacao geografia24 = new Avaliacao(aluno06, geografia, 6);
		
		Avaliacao geografia25 = new Avaliacao(aluno07, geografia, 8);
		Avaliacao geografia26 = new Avaliacao(aluno07, geografia, 9);
		Avaliacao geografia27 = new Avaliacao(aluno07, geografia, 6);
		Avaliacao geografia28 = new Avaliacao(aluno07, geografia, 5);
		
		Avaliacao geografia29 = new Avaliacao(aluno08, geografia, 7);
		Avaliacao geografia30 = new Avaliacao(aluno08, geografia, 7);
		Avaliacao geografia31 = new Avaliacao(aluno08, geografia, 5);
		Avaliacao geografia32 = new Avaliacao(aluno08, geografia, 7);
		
		Avaliacao geografia33 = new Avaliacao(aluno09, geografia, 6);
		Avaliacao geografia34 = new Avaliacao(aluno09, geografia, 6);
		Avaliacao geografia35 = new Avaliacao(aluno09, geografia, 9);
		Avaliacao geografia36 = new Avaliacao(aluno09, geografia, 7);
		
		Avaliacao geografia37 = new Avaliacao(aluno10, geografia, 6);
		Avaliacao geografia38 = new Avaliacao(aluno10, geografia, 6);
		Avaliacao geografia39 = new Avaliacao(aluno10, geografia, 7);
		Avaliacao geografia40 = new Avaliacao(aluno10, geografia, 7);
		
		RepositorioDeAvaliacoes repositorioGeografia = new RepositorioDeAvaliacoes();
		
		repositorioGeografia.adicionar(geografia1);
		repositorioGeografia.adicionar(geografia2);
		repositorioGeografia.adicionar(geografia3);
		repositorioGeografia.adicionar(geografia4);
		repositorioGeografia.adicionar(geografia5);
		repositorioGeografia.adicionar(geografia6);
		repositorioGeografia.adicionar(geografia7);
		repositorioGeografia.adicionar(geografia8);
		repositorioGeografia.adicionar(geografia9);
		repositorioGeografia.adicionar(geografia10);
		repositorioGeografia.adicionar(geografia11);
		repositorioGeografia.adicionar(geografia12);
		repositorioGeografia.adicionar(geografia13);
		repositorioGeografia.adicionar(geografia14);
		repositorioGeografia.adicionar(geografia15);
		repositorioGeografia.adicionar(geografia16);
		repositorioGeografia.adicionar(geografia17);
		repositorioGeografia.adicionar(geografia18);
		repositorioGeografia.adicionar(geografia19);
		repositorioGeografia.adicionar(geografia20);
		repositorioGeografia.adicionar(geografia21);
		repositorioGeografia.adicionar(geografia22);
		repositorioGeografia.adicionar(geografia23);
		repositorioGeografia.adicionar(geografia24);
		repositorioGeografia.adicionar(geografia25);
		repositorioGeografia.adicionar(geografia26);
		repositorioGeografia.adicionar(geografia27);
		repositorioGeografia.adicionar(geografia28);
		repositorioGeografia.adicionar(geografia29);
		repositorioGeografia.adicionar(geografia30);
		repositorioGeografia.adicionar(geografia31);
		repositorioGeografia.adicionar(geografia32);
		repositorioGeografia.adicionar(geografia33);
		repositorioGeografia.adicionar(geografia34);
		repositorioGeografia.adicionar(geografia35);
		repositorioGeografia.adicionar(geografia36);
		repositorioGeografia.adicionar(geografia37);
		repositorioGeografia.adicionar(geografia38);
		repositorioGeografia.adicionar(geografia39);
		repositorioGeografia.adicionar(geografia40);
		
		//------------------------------------------------------------------------------------
		
		//Criando as avaliações de Português
		Avaliacao filosofia1 = new Avaliacao(aluno01, filosofia, 1);
		Avaliacao filosofia2 = new Avaliacao(aluno01, filosofia, 5);
		Avaliacao filosofia3 = new Avaliacao(aluno01, filosofia, 3);
		Avaliacao filosofia4 = new Avaliacao(aluno01, filosofia, 2);
		
		Avaliacao filosofia5 = new Avaliacao(aluno02, filosofia, 0);
		Avaliacao filosofia6 = new Avaliacao(aluno02, filosofia, 0);
		Avaliacao filosofia7 = new Avaliacao(aluno02, filosofia, 4);
		Avaliacao filosofia8 = new Avaliacao(aluno02, filosofia, 5);
		
		Avaliacao filosofia9 = new Avaliacao(aluno03, filosofia, 2);
		Avaliacao filosofia10 = new Avaliacao(aluno03, filosofia, 2);
		Avaliacao filosofia11 = new Avaliacao(aluno03, filosofia, 4);
		Avaliacao filosofia12 = new Avaliacao(aluno03, filosofia, 2);
		
		Avaliacao filosofia13 = new Avaliacao(aluno04, filosofia, 8);
		Avaliacao filosofia14 = new Avaliacao(aluno04, filosofia, 8);
		Avaliacao filosofia15 = new Avaliacao(aluno04, filosofia, 8);
		Avaliacao filosofia16 = new Avaliacao(aluno04, filosofia, 8);
		
		Avaliacao filosofia17 = new Avaliacao(aluno05, filosofia, 7);
		Avaliacao filosofia18 = new Avaliacao(aluno05, filosofia, 6);
		Avaliacao filosofia19 = new Avaliacao(aluno05, filosofia, 6);
		Avaliacao filosofia20 = new Avaliacao(aluno05, filosofia, 5);
		
		Avaliacao filosofia21 = new Avaliacao(aluno06, filosofia, 8);
		Avaliacao filosofia22 = new Avaliacao(aluno06, filosofia, 5);
		Avaliacao filosofia23 = new Avaliacao(aluno06, filosofia, 7);
		Avaliacao filosofia24 = new Avaliacao(aluno06, filosofia, 6);
		
		Avaliacao filosofia25 = new Avaliacao(aluno07, filosofia, 3);
		Avaliacao filosofia26 = new Avaliacao(aluno07, filosofia, 3);
		Avaliacao filosofia27 = new Avaliacao(aluno07, filosofia, 3);
		Avaliacao filosofia28 = new Avaliacao(aluno07, filosofia, 3);
		
		Avaliacao filosofia29 = new Avaliacao(aluno08, filosofia, 7);
		Avaliacao filosofia30 = new Avaliacao(aluno08, filosofia, 7);
		Avaliacao filosofia31 = new Avaliacao(aluno08, filosofia, 5);
		Avaliacao filosofia32 = new Avaliacao(aluno08, filosofia, 7);
		
		Avaliacao filosofia33 = new Avaliacao(aluno09, filosofia, 6);
		Avaliacao filosofia34 = new Avaliacao(aluno09, filosofia, 6);
		Avaliacao filosofia35 = new Avaliacao(aluno09, filosofia, 9);
		Avaliacao filosofia36 = new Avaliacao(aluno09, filosofia, 7);
		
		Avaliacao filosofia37 = new Avaliacao(aluno10, filosofia, 0);
		Avaliacao filosofia38 = new Avaliacao(aluno10, filosofia, 1);
		Avaliacao filosofia39 = new Avaliacao(aluno10, filosofia, 2);
		Avaliacao filosofia40 = new Avaliacao(aluno10, filosofia, 3);
		
		RepositorioDeAvaliacoes repositorioFilosofia = new RepositorioDeAvaliacoes();
		
		repositorioFilosofia.adicionar(filosofia1);
		repositorioFilosofia.adicionar(filosofia2);
		repositorioFilosofia.adicionar(filosofia3);
		repositorioFilosofia.adicionar(filosofia4);
		repositorioFilosofia.adicionar(filosofia5);
		repositorioFilosofia.adicionar(filosofia6);
		repositorioFilosofia.adicionar(filosofia7);
		repositorioFilosofia.adicionar(filosofia8);
		repositorioFilosofia.adicionar(filosofia9);
		repositorioFilosofia.adicionar(filosofia10);
		repositorioFilosofia.adicionar(filosofia11);
		repositorioFilosofia.adicionar(filosofia12);
		repositorioFilosofia.adicionar(filosofia13);
		repositorioFilosofia.adicionar(filosofia14);
		repositorioFilosofia.adicionar(filosofia15);
		repositorioFilosofia.adicionar(filosofia16);
		repositorioFilosofia.adicionar(filosofia17);
		repositorioFilosofia.adicionar(filosofia18);
		repositorioFilosofia.adicionar(filosofia19);
		repositorioFilosofia.adicionar(filosofia20);
		repositorioFilosofia.adicionar(filosofia21);
		repositorioFilosofia.adicionar(filosofia22);
		repositorioFilosofia.adicionar(filosofia23);
		repositorioFilosofia.adicionar(filosofia24);
		repositorioFilosofia.adicionar(filosofia25);
		repositorioFilosofia.adicionar(filosofia26);
		repositorioFilosofia.adicionar(filosofia27);
		repositorioFilosofia.adicionar(filosofia28);
		repositorioFilosofia.adicionar(filosofia29);
		repositorioFilosofia.adicionar(filosofia30);
		repositorioFilosofia.adicionar(filosofia31);
		repositorioFilosofia.adicionar(filosofia32);
		repositorioFilosofia.adicionar(filosofia33);
		repositorioFilosofia.adicionar(filosofia34);
		repositorioFilosofia.adicionar(filosofia35);
		repositorioFilosofia.adicionar(filosofia36);
		repositorioFilosofia.adicionar(filosofia37);
		repositorioFilosofia.adicionar(filosofia38);
		repositorioFilosofia.adicionar(filosofia39);
		repositorioFilosofia.adicionar(filosofia40);
		
		//------------------------------------------------------------------------------------
		
		System.out.println("Aprovados em matemática " + repositorioMatematica.obterAprovados(matematica));
		System.out.println("Aprovados em português " + repositorioPortugues.obterAprovados(portugues));
		System.out.println("Aprovados em artes " + repositorioArtes.obterAprovados(artes));
		System.out.println("Aprovados em geografia " + repositorioGeografia.obterAprovados(geografia));
		System.out.println("Aprovados em filosofia " + repositorioFilosofia.obterAprovados(filosofia));
	


	}
}
