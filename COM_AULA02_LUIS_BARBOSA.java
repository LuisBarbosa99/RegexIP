import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
/* Atividade de Compiladores
 * Programa para valida��o de IP com uso de express�es regulares
 * Aluno: Lu�s Barbosa 
 * 
 * 
 */

public class Main {


	private static Scanner scanner;
	public static boolean validarIP(String meuIP){ //fun��o para valida��o do IP 
		Pattern ptn = Pattern.compile("(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])");// padr�o utilizado para definir o IP como v�lido 
		Matcher mtch = ptn.matcher(meuIP); //  Compara o IP informado com o padr�o de IP informado
		return mtch.find(); //retorna um valor booleano de acordo com o resultado da compara��o feita 
		
	}
	public static void main(String[] args) {
	
		scanner = new Scanner(System.in);
		String meuIP  = scanner.next();//Recebe a entrada do IP informado pelo usu�rio 
		boolean ip = validarIP(meuIP); //recebe o valor booleano do resultado retornado pela fun��o de valida��o do IP
		
		if (ip==true) {	// mostra na tela o resultado obtido da valida��o
			System.out.println("IP valido");
		}else {
			System.out.println("IP invalido");
		}
		
	}

}
