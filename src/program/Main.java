package program;

/*
beecrowd | 1019 - Conversão de Tempo

Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica,
e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos,
conforme exemplo fornecido.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int segundos = sc.nextInt();
		int horas = segundos / 3600;
		segundos = segundos % 3600;
		int minutos = segundos / 60;
		segundos = segundos % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		sc.close();
	}
}
