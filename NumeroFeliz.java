package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 
 * desafio: N�meros Felizes
 * url: https://dojopuzzles.com/problems/numeros-felizes/
 * Autor do desafio: Marianna Reis
 * 
 */

public class NumeroFeliz {

	public static void main(String[] args) {

		try (Scanner scn = new Scanner(System.in)){
			
			System.out.print("Digite um n�mero para saber se � triste ou feliz: ");
			Integer numero = scn.nextInt();
			
			verificarNumero(numero);
			
		} catch (Exception e) {
           System.out.println("Digite um numero v�lido.");
		}

	}

	public static void verificarNumero(Integer num) {
		
		Integer numParaExibir = num;
		
		List<Integer> verificarNumero = new ArrayList<>();

		Integer aux = 0;
		while (num > 1) {

			if (verificarNumero.contains(num)) {
				System.out.println("O n�mero " + numParaExibir + " � triste.");
				break;
			}

			aux = 0;

			verificarNumero.add(num);

			while (num != 0) {
				aux = aux + ((int) Math.pow((num % 10), 2));
				num = (int) num / 10;
			}
			num = aux;
		}

		if (num == 1) {
			System.out.println("O n�mero " + numParaExibir + " � feliz.");
		}
	}

}
