package Execution;

import Program.Aluno;
import Program.Avaliacao;
import Program.Disciplina;
import Program.Curso;
import Program.DisciplinaOfertada;
import Program.Fase;
import Program.Frequencia;
import Program.Professor;
import Program.Pessoa;


public class Execute {
	
	public static void main(String[] args) {
		
		//INSTÂNCIAS 
		
		Pessoa pessoa =  new Pessoa();
		Professor professor1 =  new Professor();
		Avaliacao avaliacao = new Avaliacao();
		Frequencia frequencia1 =  new Frequencia();
		Aluno aluno1 = new Aluno();
		Disciplina disciplina =  new Disciplina(1,"Programação Orientada a Objetos II");
		Fase fase =  new Fase(1);
		Curso curso = new Curso(1,"Ciência da Computação");
		DisciplinaOfertada  disciplinaOfertada = new DisciplinaOfertada(disciplina);
		
		//INICIALIZAÇÃO
		
		fase.AdiconaDisciplina(disciplina);
		
		//PROFESSOR 1
		pessoa =new Pessoa("Rodirgo","Curvelo",344636);
		professor1 = new Professor(1,pessoa);
		avaliacao = new Avaliacao(1,professor1);
		frequencia1 = new Frequencia(1,professor1);
		disciplinaOfertada.AdiconaProfessores(professor1);
		disciplinaOfertada.AdicionaAvalicao(avaliacao);
		disciplinaOfertada.AdicionaFrequencia(frequencia1);
		
		
		//PROFESSOR2
		pessoa =new Pessoa("Christian","Heck",356358);
		Professor professor2 = new Professor(2,pessoa);
		avaliacao = new Avaliacao(2,professor2);
		Frequencia frequencia2 = new Frequencia(2,professor2);
		disciplinaOfertada.AdiconaProfessores(professor2);
		disciplinaOfertada.AdicionaAvalicao(avaliacao);
		disciplinaOfertada.AdicionaFrequencia(frequencia2);
		
		//ALUNO1
		pessoa = new Pessoa("Mateus", "Sebold",666936);
		aluno1 =  new Aluno(pessoa,1,"Matricula 1");
		curso.AdiconaAlunos(aluno1);
		disciplinaOfertada.AdiconaAlunos(aluno1);
		aluno1.AdicionaFrequencia(frequencia1);
		aluno1.AdicionaFrequencia(frequencia2);
		avaliacao = new Avaliacao(1,(float)7.5,professor1);
		aluno1.AdicionaAvalicao(avaliacao);
		avaliacao = new Avaliacao(2,(float)5.5,professor2);
		aluno1.AdicionaAvalicao(avaliacao);
		
		
		//ALUNO2
		pessoa = new Pessoa("Rafael", "Colaço",7827776);
		Aluno aluno2 =  new Aluno(pessoa,2,"Matricula 2");
		curso.AdiconaAlunos(aluno2);
		disciplinaOfertada.AdiconaAlunos(aluno2);
		aluno2.AdicionaFrequencia(frequencia1);
		aluno2.AdicionaFrequencia(frequencia2);
		avaliacao = new Avaliacao(1,(float)4.0,professor1);
		aluno2.AdicionaAvalicao(avaliacao);
		avaliacao = new Avaliacao(2,(float)8.0,professor2);
		aluno2.AdicionaAvalicao(avaliacao);
		
		
		Disciplina disci2 = new Disciplina(2,"Desenvolvimento Web");
		Fase fase2 = new Fase(2);
		fase2.AdiconaDisciplina(disci2);
		curso.AdiconaFases(fase);
		curso.AdiconaFases(fase2);
		
		
		System.out.println(curso.toString());
		System.out.println("");
		System.out.println(fase.toString());
		System.out.println("");
		System.out.println(fase2.toString());
		System.out.println("");
		System.out.println(disciplinaOfertada.toString());
		System.out.println("");
		System.out.println(aluno1.toString());
		System.out.println("");
		System.out.println(aluno2.toString());
		
		
	}
}
