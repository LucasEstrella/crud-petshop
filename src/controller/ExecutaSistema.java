package controller;

import java.util.Scanner;

import model.Cachorro;
import model.Gato;

public class ExecutaSistema {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Cachorro cachorro;
		Gato gato;
		
		System.out.println("*****************************");
		System.out.println("|    Cadastre o seu animal   |");
		System.out.println("*****************************");
		System.out.println("|1- Gato                    |");
		System.out.println("|2- Cachorro                |");
		System.out.println("*****************************");
		
		int opcao = Integer.parseInt(scan.nextLine());
		
		switch (opcao) {
		case 1:
			 gato= new Gato();
			 System.out.println("Digite o nome do seu gato: ");
			 gato.setNome(scan.nextLine());
			
			 System.out.println("Digite a idade do gato: ");
			 gato.setIdade(Integer.parseInt(scan.nextLine()));
			
			 
			 System.out.println("Digite a raça do seu gato: ");
			 gato.setRaca(scan.nextLine());
			break;
				
		case 2:
			cachorro = new Cachorro();
			 System.out.println("Digite o nome do seu cachorro: ");
			 cachorro.setNome(scan.nextLine());
			
			 System.out.println("Digite a idade do cachorro: ");
			 cachorro.setIdade(Integer.parseInt(scan.nextLine()));
			
			 
			 System.out.println("Digite a raça do seu cachorro: ");
			 cachorro.setRaca(scan.nextLine());
			
			break;
		}
	}

}
