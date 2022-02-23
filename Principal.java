import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		int opcao = 0;
		int sair = 1;
		int menuPrincipal = 0;
		
		
		while(sair != -1) {
			//public void menuPrincipal() {
				System.out.println("=====================================");
				System.out.println("== Digite uma das opções a seguir: ==");
				System.out.println("==                                 ==");
				System.out.println("==  1 - CADASTRO DE FORNECEDOR     ==");
				System.out.println("==  2 - CADASTRO DE REMÉDIO        ==");
				System.out.println("==  3 - CADASTRO DE FARMÁCIA       ==");
				System.out.println("==  4 - CADASTRO DA SECRETARIA     ==");
				System.out.println("==  5 - SAIR                       ==");
				System.out.println("==                                 ==");
				System.out.println("=====================================");
				opcao = sc.nextInt();
		
				switch(opcao) { 
				case 1:{
					menu.menuFornecedor();
					menuPrincipal = 0; // com o valor 0, ele retornará direto para o menu.
					break;
				}
				case 2:{
					menu.menuRemedio();
					menuPrincipal = 0; // com o valor -1, ele perguntará se você deseja continuar.
					break;
				}
				case 3:{
					menu.menuFarmacia();
					menuPrincipal = 0;
					break;
				}
				case 4:{
					menu.menuSecretaria();
					menuPrincipal = 0;
					break;
				}
				case 5:{
					System.out.println("Saindo do programa...");
					menuPrincipal = -1; // irá entrar na condição if e irá perguntar se você deseja continuar
					break;
				}
				}
				
			if(menuPrincipal == -1) {
				System.out.println("Tem certeza que deseja sair?");
				System.out.println("Digite -1 para sair ou outro número para continuar: ");
				try{
					sair = sc.nextInt();
					if(sair != -1) { // se sair for igual a -1 então irá sair da aplicação.
						sair = 0; // se o valor for igual a 0, então irá continuar.
					}
				} catch(InputMismatchException e) {
					System.out.println("Opção inválida........");			
				}
			}
			
		}
	}
	
	
}
