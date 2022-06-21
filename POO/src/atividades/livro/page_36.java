package atividades.livro;

// programa que utiliza classe sacnner
import java.util.Scanner;



public class page_36 {

	public static void main(String[] args) {
	
	//Criar um scanner para obter entrada a partir da janela de comando
	
		Scanner input = new Scanner(System.in);
	//Primeiro e segundo numero para soma
	int number1;
	int number2;
	// Soma
	int sum;
	
	// Prompt
	System.out.print("Qual o primeiro numero?");
	//n1
	number1 = input.nextInt(); 
	//n2
	System.out.print("Qual o segundo numero?");
	number2 = input.nextInt();
	sum = number1 + number2; // soma dos dois numeros
	System.out.printf("A soma é %d%n", sum ); // exibe a soma		

	}//fim do metodo

}//fim da class page_36