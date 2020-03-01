package br.com.devjony;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String curso1 = "Conhecendo mais de listas";
		String curso2 = "Modelando a classe Aula";
		String curso3  = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		
		System.out.println(cursos);
		cursos.remove(0);
		System.out.println(cursos);
		for (String aula : cursos) {
			System.out.println("Aula: " + aula);
		}
		
		String primeiraAula = cursos.get(0);
		System.out.println("A primeira aula é: " + primeiraAula);
		for (int i = 0; i < cursos.size(); i++) {
			System.out.println("Aula: " + cursos.get(i));
		}
		
		System.out.println(cursos.size());
		
		System.out.println("Percorrendo: ");
		cursos.forEach(aula -> {
			System.out.println("Aula " + aula);
		});
		
		cursos.add("Aumentando nosso conhecimento");
		System.out.println(cursos);
		
		System.out.println("Depois de ordenado: ");
		Collections.sort(cursos);
		System.out.println(cursos);
	}
}