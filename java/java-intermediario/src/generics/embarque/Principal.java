package generics.embarque;
import java.util.Scanner;

import generics.controle.Aeronaves;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		Aeronaves air = new Aeronaves();
		System.out.println("Informe o nr de aeronaves");
		int nrAeronaves = sc.nextInt();
		
		// adicionando voos
		for (int i = 0; i < nrAeronaves; i++) {
			int nrVoo = sc.nextInt();
			air.addVoo(nrVoo);	
		}
		System.out.println("O primeiro a decolar vai ser o nr : " + air.primeiroVoo());
		air.listaVoos();
		sc.close();
		
	}

}
