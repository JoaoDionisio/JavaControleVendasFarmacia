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
				System.out.println("== Digite uma das op��es a seguir: ==");
				System.out.println("==                                 ==");
				System.out.println("==  1 - CADASTRO DE FORNECEDOR     ==");
				System.out.println("==  2 - CADASTRO DE REM�DIO        ==");
				System.out.println("==  3 - CADASTRO DE FARM�CIA       ==");
				System.out.println("==  4 - CADASTRO DA SECRETARIA     ==");
				System.out.println("==  5 - SAIR                       ==");
				System.out.println("==                                 ==");
				System.out.println("=====================================");
				opcao = sc.nextInt();
		
				switch(opcao) { 
				case 1:{
					menu.menuFornecedor();
					menuPrincipal = 0; // com o valor 0, ele retornar� direto para o menu.
					break;
				}
				case 2:{
					menu.menuRemedio();
					menuPrincipal = 0; // com o valor -1, ele perguntar� se voc� deseja continuar.
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
					menuPrincipal = -1; // ir� entrar na condi��o if e ir� perguntar se voc� deseja continuar
					break;
				}
				}
				
			if(menuPrincipal == -1) {
				System.out.println("Tem certeza que deseja sair?");
				System.out.println("Digite -1 para sair ou outro n�mero para continuar: ");
				try{
					sair = sc.nextInt();
					if(sair != -1) { // se sair for igual a -1 ent�o ir� sair da aplica��o.
						sair = 0; // se o valor for igual a 0, ent�o ir� continuar.
					}
				} catch(InputMismatchException e) {
					System.out.println("Op��o inv�lida........");			
				}
			}
			
		}
	}
	
	
}
