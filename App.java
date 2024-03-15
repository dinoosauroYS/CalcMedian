package main;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = 1;
		while(c==1) {
		
		System.out.println("Qual o primeiro numero da media?");
		double y = sc.nextInt();
		System.out.println("Qual o segundo numero da media?");
		double x = sc.nextInt();
		double z = (x+y)/2;
		System.out.println("sua media é:"+z);
		System.out.println("Voce deseja continuar? 0 ou 1");
		int n = sc.nextInt();
		if(n==0) {
			System.out.println("Obrigado por utilizar!");
			c = 0;
		
		
		}
		}
	}

}
