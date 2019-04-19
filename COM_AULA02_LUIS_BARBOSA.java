import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
/* Atividade de Compiladores
 * Programa para validação de IP com uso de expressões regulares
 * Aluno: Luís Barbosa 
 * 
 * 
 */

public class Main {


	private static Scanner scanner;
	public static boolean validarIP(String meuIP){ //função para validação do IP 
		Pattern ptn = Pattern.compile("(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])");// padrão utilizado para definir o IP como válido 
		Matcher mtch = ptn.matcher(meuIP); //  Compara o IP informado com o padrão de IP informado
		return mtch.find(); //retorna um valor booleano de acordo com o resultado da comparação feita 
		
	}
	public static void main(String[] args) {
	
		scanner = new Scanner(System.in);
		String meuIP  = scanner.next();//Recebe a entrada do IP informado pelo usuário 
		boolean ip = validarIP(meuIP); //recebe o valor booleano do resultado retornado pela função de validação do IP
		
		if (ip==true) {	// mostra na tela o resultado obtido da validação
			System.out.println("IP valido");
		}else {
			System.out.println("IP invalido");
		}
		
	}

}
