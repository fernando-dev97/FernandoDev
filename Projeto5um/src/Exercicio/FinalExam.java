package Exercicio;

import java.util.Scanner;

public class FinalExam {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
	int x = 7, y = 0, z = 7;
	
	String resposta = x <=7 ? "Verdadeiro" : "Falso";
	System.out.println(resposta);
	
    int resp = x <=7 ? 1 : 0;
	
	if(resp == 1) {
		System.out.println("Verdadeiro");		
	}
	else if(resp ==0){
		System.out.println("Falso");
	}
	
	
	
	}
	
}
