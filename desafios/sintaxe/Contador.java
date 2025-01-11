
import java.util.Scanner;

public class Contador {
    
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
        System.out.println();
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {

			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
            System.err.println("Erro: "+exception.getMessage());
		}
        terminal.close();
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroDois <= parametroUm) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro: ["+parametroUm+", "+parametroDois+"]");
        }   
		
		int contagem = parametroDois - parametroUm;

		for(int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
	}
}