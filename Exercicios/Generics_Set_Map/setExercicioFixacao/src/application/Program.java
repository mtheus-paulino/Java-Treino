package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import entities.Aluno;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Aluno> instrutor = new HashSet<Aluno>();
		List<String> curso = new ArrayList<>();
		
		curso.add("A");
		curso.add("B");
		curso.add("C");
		
		for(String cursos : curso) {
			System.out.println("Qual a quantidade de aluno no curso? " + cursos);
			int qtd = sc.nextInt();
			
			for(int i = 0; i < qtd; i++) {
				System.out.println("ID do Aluno:");
				int id = sc.nextInt();
				sc.nextLine();
				
				instrutor.add(new Aluno(id));
			}
			
		}
		
		System.out.println("\nTotal Aluno: " + instrutor.size());
		
		
	}

}
