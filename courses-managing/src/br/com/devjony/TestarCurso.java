package br.com.devjony;

import java.util.List;

public class TestarCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as colecoes do java", "Paulo Silveira");
		List<Aula> aulas = javaColecoes.getAulas();
		
//		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 24));
		
		System.out.println(javaColecoes.getAulas());
	} 

}
