import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	Farmacia listaFarmacias = new Farmacia();
	int opcao;
	int sair = 0;

	public void menuFornecedor() {
		Fornecedor listaFornecedores = new Fornecedor(); // LISTA DE FORNECEDORES
		int opcaoFornecedor;
		int sair = 0;

		while (sair != -1) {
			System.out.println("=====================================");
			System.out.println("== Digite uma das op��es a seguir: ==");
			System.out.println("==                                 ==");
			System.out.println("==     1 - INCLUIR FORNECEDOR      ==");
			System.out.println("==     2 - ALTERAR FORNECEDOR      ==");
			System.out.println("==     3 - EXCLUIR FORNECEDOR      ==");
			System.out.println("==     4 - CONSULTAR FORNECEDOR    ==");
			System.out.println("==     5 - IMPRIMIR FORNECEDORES   ==");
			System.out.println("==     6 - SAIR                    ==");
			System.out.println("==                                 ==");
			System.out.println("=====================================");
			opcaoFornecedor = sc.nextInt();

			switch (opcaoFornecedor) {
			case 1: { // incluir
				Fornecedor f = new Fornecedor(); // Criado e fornecedor
				f.cadastrarFornecedor(); // Cadastrando o fornecedor com suas informa��es.
				listaFornecedores.getFornecedor().add(f); // Adicionando o fornecedor a lista de fornecedores.
				break;
			}
			case 2: { // alterar
				if (listaFornecedores.getFornecedor().isEmpty()) {
					System.out.println("A lista de fornecedor est� vazia.");
				} else {
					Fornecedor f1 = new Fornecedor();
					f1.cadastrarFornecedor();
					System.out.println("Informe a posi��o para o fornecedor ser adicionado: ");
					int posicao = sc.nextInt();
					listaFornecedores.getFornecedor().remove(posicao);
					listaFornecedores.getFornecedor().add(posicao, f1);
					
				}
				break;
			}
			case 3: { // excluir
				if (listaFornecedores.getFornecedor().isEmpty()) {
					System.out.println("A lista de fornecedor est� vazia.");
				} else {
					System.out.println("Informe a posi��o do fornecedor para ser exclu�do: ");
					int posicaoExcluir = sc.nextInt();
					listaFornecedores.getFornecedor().remove(posicaoExcluir);
				}
				break;
			}
			case 4: { // consultar
				System.out.println("Digite o c�digo do fornecedor para consultar no sistema: ");
				String codigoF = sc.next();
				String opcao = "nao";
				int cont = -1;
				int posicao = 0;
				for (Fornecedor f : listaFornecedores.getFornecedor()) {
					cont++;
					if (codigoF.equals(f.getCodigo())) {
						opcao = "sim";
						posicao = cont;
					}
				}
				if (listaFornecedores.getFornecedor().isEmpty()) {
					System.out.println("A lista de fornecedores est� vazia");
				} else if (opcao.equals("nao")) {
					System.out.println("O fornecedor n�o est� na lista.");
				} else {
					System.out.println("Achado o fornecedor e sua posi��o �: " + posicao);
				}
				break;
			}
			case 5: {
				if (listaFornecedores.getFornecedor().isEmpty()) {
					System.out.println("A lista de fornecedores est� vazia");
				} else {
					for (Fornecedor f : listaFornecedores.getFornecedor()) {
						System.out.println("Codigo: " + f.getCodigo() + " Raz�o social: " + f.getRazao_social());
					}
				}
				break;
			}
			case 6: {
				System.out.println("Saindo....");
				break;
			}
			default: {
				System.out.println("Voc� n�o digitou a op��o correta.");
			}
			}
			System.out.println("Digite -1 para sair ou outro n�mero para continuar no menu Fornecedor: ");
			try {
				sair = sc.nextInt();
				if (sair != -1) {
					sair = 0;
				}
			} catch (InputMismatchException e) {
				System.out.println("Op��o inv�lida........");
			}
		}
	}

	public void menuRemedio() {
		Remedio listaRemedios = new Remedio(); // Lista de rem�dios
		int opcaoRemedio;
		int sair = 0;

		while (sair != -1) {
			System.out.println("=====================================");
			System.out.println("== Digite uma das op��es a seguir: ==");
			System.out.println("==                                 ==");
			System.out.println("==   1 - INCLUIR REM�DIO           ==");
			System.out.println("==    11 - INCLUIR NOVO FORNECEDOR ==");
			System.out.println("==    12 - IMPRIMIR FORNECEDOR(ES) ==");
			System.out.println("==   2 - ALTERAR REM�DIO           ==");
			System.out.println("==   3 - EXCLUIR REM�DIO           ==");
			System.out.println("==   4 - CONSULTAR REM�DIO         ==");
			System.out.println("==   5 - SAIR                      ==");
			System.out.println("==                                 ==");
			System.out.println("=====================================");
			opcaoRemedio = sc.nextInt();

			switch (opcaoRemedio) {
			case 1: { // INCLUR
				Remedio remedio01 = new Remedio();
				remedio01.cadastrarRemedio();
				listaRemedios.getRemedios().add(remedio01);
				break;
			}
			case 2: { // ALTERAR
				if (listaRemedios.getRemedios().isEmpty()) {
					System.out.println("A lista de rem�dios est� vazia.");
				} else {
					Remedio remedio02 = new Remedio();
					remedio02.cadastrarRemedio();
					System.out.println("Informe a posi��o para o rem�dio ser adicionado: ");
					int posicao = sc.nextInt();
					listaRemedios.getRemedios().remove(posicao);
					listaRemedios.getRemedios().add(posicao, remedio02);
				}
				break;
			}
			case 3: { // EXCLUIR
				if (listaRemedios.getRemedios().isEmpty()) {
					System.out.println("A lista de rem�dios est� vazia.");
				} else {
					System.out.println("Informe a posi��o do rem�dio para ser exclu�do: ");
					int posicaoExcluir = sc.nextInt();
					listaRemedios.getRemedios().remove(posicaoExcluir);
				}
				break;
			}
			case 4: { // CONSULTAR
				System.out.println("Digite o c�digo do rem�dio: ");
				String opcaoCodigo = sc.next();
				String opcao = "nao";
				int cont = -1;
				int posicao = 0;
				for (Remedio r : listaRemedios.getRemedios()) {
					cont++;
					if (opcaoCodigo.equals(r.getCodigo())) {
						opcao = "sim";
						posicao = cont;
					}
					if (listaRemedios.getRemedios().isEmpty()) {
						System.out.println("A lista de rem�dios est� vazia.");
					} else if (opcao.equals("nao")) {
						System.out.println("O rem�dio n�o foi encontrado.");
					} else {
						System.out.println("O rem�dio foi encontrado e a sua posi��o �: " + posicao);
					}
				}
				break;
			}
			case 5: {
				System.out.println("Saindo...");
				break;
			}
			case 11: { // Adicionar um fornecedor para um rem�dio.
				if (listaRemedios.getRemedios().isEmpty()) {
					System.out.println("A lista de rem�dios est� vazia.");
				} else {
					System.out.println("Qual o c�digo do rem�dio?");
					String codigo02 = sc.next();
					for (Remedio r : listaRemedios.getRemedios()) {
						if (codigo02.equals(r.getCodigo())) {
							System.out.println("Rem�dio achado.");
							System.out.println("Vamos adicionar o novo fornecedor para este rem�dio.");
							System.out.println("**********");
							Fornecedor x = new Fornecedor();
							x.cadastrarFornecedor();
							// System.out.println("Lista de fornecedores: " + r.getFornecedores());
							r.getFornecedores().add(x);

						}
					}
				}
				break;
			}
			case 12: {
				if (listaRemedios.getRemedios().isEmpty()) {
					System.out.println("A lista de rem�dios est� vazia.");
				} else {
					System.out.println("Qual o c�digo do rem�dio?");
					String codigo03 = sc.next();
					for (Remedio r : listaRemedios.getRemedios()) {
						if (codigo03.equals(r.getCodigo())) {
							System.out.println("Rem�dio achado.");
							for (Fornecedor f : r.getFornecedores()) {
								System.out.println("Fornecedor c�digo: " + f.getCodigo() + " fornecedor raz�o social: "
										+ f.getRazao_social());
							}
						}
					}
				}
				break;
			}
			default: {
				System.out.println("Voc� n�o digitou a op��o correta.");
				break;
			}
			}
			System.out.println("Digite -1 para sair ou outro n�mero para continuar no menu Rem�dio: ");
			try {
				sair = sc.nextInt();
				if (sair != -1) {
					sair = 0;
				}
			} catch (InputMismatchException e) {
				System.out.println("Op��o inv�lida........");
			}
		}

	}

	public void menuFarmacia() {
		int opcaoFarmacia;
		int sair = 0;

		while (sair != -1) {
			System.out.println("=====================================");
			System.out.println("== Digite uma das op��es a seguir: ==");
			System.out.println("==                                 ==");
			System.out.println("==   1 - INCLUIR FARM�CIA          ==");
			System.out.println("==    11 - INCLUIR ENDERE�O        ==");
			System.out.println("==    12 - IMPRIMIR ENDERE�O(S)    ==");
			System.out.println("==   2 - ALTERAR FARM�CIA          ==");
			System.out.println("==   3 - EXCLUIR FARM�CIA          ==");
			System.out.println("==   4 - CONSULTAR FARM�CIA        ==");
			System.out.println("==   5 - SAIR                      ==");
			System.out.println("==                                 ==");
			System.out.println("=====================================");
			opcaoFarmacia = sc.nextInt();

			switch (opcaoFarmacia) {
			case 1: { // INCLUIR
				Farmacia farmacia01 = new Farmacia();
				farmacia01.cadastrarFarmacia();
				listaFarmacias.getFarmacias().add(farmacia01);
				break;
			}
			case 2: { // ALTERAR
				if (listaFarmacias.getFarmacias().isEmpty()) {
					System.out.println("A lista de farm�cias est� vazia.");
				} else {
					Farmacia farmacia02 = new Farmacia();
					farmacia02.cadastrarFarmacia();
					System.out.println("Informe a posi��o para o rem�dio ser adicionado: ");
					int posicao = sc.nextInt();
					listaFarmacias.getFarmacias().remove(posicao);
					listaFarmacias.getFarmacias().add(posicao, farmacia02);
				}
				break;
			}
			case 3: { // EXCLUIR
				if (listaFarmacias.getFarmacias().isEmpty()) {
					System.out.println("A lista de farm�cias est� vazia.");
				} else {
					System.out.println("Informe a posi��o da farm�cia para ser exclu�da: ");
					int posicaoExcluir = sc.nextInt();
					listaFarmacias.getFarmacias().remove(posicaoExcluir);
				}
				break;
			}
			case 4: { // CONSULTAR
				System.out.println("Digite o c�digo da farm�cia: ");
				String opcaoCodigo = sc.next();
				String opcao = "nao";
				int cont = -1;
				int posicao = 0;
				for (Farmacia f : listaFarmacias.getFarmacias()) {
					cont++;
					if (opcaoCodigo.equals(f.getCodigo())) {
						opcao = "sim";
						posicao = cont;
					}
					if (listaFarmacias.getFarmacias().isEmpty()) {
						System.out.println("A lista de farm�cias est� vazia.");
					} else if (opcao.equals("nao")) {
						System.out.println("A farm�cia n�o foi encontrada.");
					} else {
						System.out.println("A farm�cia foi encontrada e a sua posi��o �: " + posicao);
					}
				}
				break;
			}
			case 5: {
				System.out.println("Saindo...");
				break;
			}
			case 11: {
				if (listaFarmacias.getFarmacias().isEmpty()) {
					System.out.println("A lista de farm�cias est� vazia.");
				} else {
					System.out.println("Qual o c�digo do farm�cia?");
					String codigo01 = sc.next();
					for (Farmacia f : listaFarmacias.getFarmacias()) {
						if (codigo01.equals(f.getCodigo())) {
							System.out.println("Achado a farm�cia.");
							System.out.println("Vamos adicionar um novo endere�o para esta farm�cia.");
							System.out.println("**********");
							System.out.println("Qual � o endere�o da farm�cia?");
							String endereco = sc.next();
							// System.out.println(f.getEndereco());
							f.getEndereco().add(endereco);
							// listaFarmacias.getFarmacias().get(posicao).
						}
					}
				}
				break;
			}
			case 12: {
				if (listaFarmacias.getFarmacias().isEmpty()) {
					System.out.println("A lista de farm�cias est� vazia.");
				} else {
					System.out.println("Qual o c�digo do farm�cia?");
					String codigo02 = sc.next();
					for (Farmacia f : listaFarmacias.getFarmacias()) { // f recebe a lista de farm�cias um por um.
						if (codigo02.equals(f.getCodigo())) {
							System.out.println("Achado a farm�cia.");
							for (String endereco : f.getEndereco()) {
								System.out.println("Farm�cia c�digo: " + f.getCodigo() + " endere�o: " + endereco);
							}
						}
					}
				}
				break;
			}
			default: {
				System.out.println("Voc� n�o digitou a op��o correta.");
			}
			}
			System.out.println("Digite -1 para sair ou outro n�mero para continuar no menu Farm�cia: ");
			try {
				sair = sc.nextInt();
				if (sair != -1) {
					sair = 0;
				}
			} catch (InputMismatchException e) {
				System.out.println("Op��o inv�lida........");
			}
		}

	}

	public void menuSecretaria() {
		Secretaria listaSecretarias = new Secretaria();
		int opcaoSecretaria;
		int sair = 0;

		while (sair != -1) {
			System.out.println("=====================================");
			System.out.println("== Digite uma das op��es a seguir: ==");
			System.out.println("==                                 ==");
			System.out.println("==   1 - INCLUIR SECRETARIA        ==");
			System.out.println("==    11 - INCLUIR FORNECEDOR      ==");
			System.out.println("==    12 - INCLUIR REM�DIO         ==");
			System.out.println("==    13 - INCLUIR FARM�CIA        ==");
			System.out.println("==   2 - ALTERAR SECRETARIA        ==");
			System.out.println("==    21 - ALTERAR FORNECEDOR      ==");
			System.out.println("==    22 - ALTERAR REM�DIO         ==");
			System.out.println("==    23 - ALTERAR FARM�CIA        ==");
			System.out.println("==   3 - EXCLUIR SECRETARIA        ==");
			System.out.println("==    31 - EXCLUIR FORNECEDOR      ==");
			System.out.println("==    32 - EXCLUIR REM�DIO         ==");
			System.out.println("==    33 - EXCLUIR FARM�CIA        ==");
			System.out.println("==   4 - CONSULTAR SECRETARIA      ==");
			System.out.println("==    41 - CONSULTAR FORNECEDOR    ==");
			System.out.println("==    42 - CONSULTAR REM�DIO       ==");
			System.out.println("==    43 - CONSULTAR FARM�CIA      ==");
			System.out.println("==   5 - SAIR                      ==");
			System.out.println("==                                 ==");
			System.out.println("=====================================");
			opcaoSecretaria = sc.nextInt();

			switch (opcaoSecretaria) {
			case 1: { // Incluir
				Secretaria secretaria01 = new Secretaria();
				secretaria01.cadastrarSecretaria();
				listaSecretarias.getSecretaria().add(secretaria01);
				break;
			}
			case 2: { // Alterar
				if (listaSecretarias.getSecretaria().isEmpty()) {
					System.out.println("A lista de secretaria est� vazia.");
				} else {
					Secretaria secretaria02 = new Secretaria();
					secretaria02.cadastrarSecretaria();
					System.out.println("Informe a posi��o para a Secretaria ser adicionada: ");
					int posicao = sc.nextInt();
					listaSecretarias.getSecretaria().remove(posicao);
					listaSecretarias.getSecretaria().add(posicao, secretaria02);
				}
				break;
			}
			case 3: { // Excluir
				if (listaSecretarias.getSecretaria().isEmpty()) {
					System.out.println("A lista de secretaria est� vazia.");
				} else {
					System.out.println("Informe a posi��o da Secretaria para ser exclu�da: ");
					int posicaoExcluir = sc.nextInt();
					listaSecretarias.getSecretaria().remove(posicaoExcluir);
				}
				break;
			}
			case 4: { // Consultar
				System.out.println("Digite o c�digo da Secretaria para consultar no sistema: ");
				String codigoF = sc.next();
				String opcao = "nao";
				int cont = -1;
				int posicao = 0;
				for (Secretaria s : listaSecretarias.getSecretaria()) {
					cont++;
					if (codigoF.equals(s.getCodigo())) {
						opcao = "sim";
						posicao = cont;
					}
				}
				if (listaSecretarias.getSecretaria().isEmpty()) {
					System.out.println("A lista de secretaria est� vazia.");
				} else if (opcao.equals("nao")) {
					System.out.println("A secretaria n�o est� na lista.");
				} else {
					System.out.println("Achado a secretaria e sua posi��o �: " + posicao);
				}
				break;
			}
			case 5: {
				System.out.println("Saindo...");
				break;
			}
			case 11: { // INCLUIR FORNECEDOR
				if (listaSecretarias.getSecretaria().isEmpty()) {
					System.out.println("A lista de secretaria est� vazia.");
				} else {
					System.out.println("Qual o c�digo da Secretaria?");
					String codigo01 = sc.next();
					for (Secretaria s : listaSecretarias.getSecretaria()) {
						if (codigo01.equals(s.getCodigo())) {
							System.out.println("Achado a Secretaria.");
							System.out.println("Vamos adicionar um novo fornecedor para esta Secretaria.");
							System.out.println("**********");
							Fornecedor x = new Fornecedor();
							x.cadastrarFornecedor();
							s.getFornecedores().add(x);
						}
					}
				}
				break;
			}
			case 12: { // INCLUIR REM�DIO
				if (listaSecretarias.getSecretaria().isEmpty()) {
					System.out.println("A lista de secretaria est� vazia.");
				} else {
					System.out.println("Qual o c�digo da Secretaria?");
					String codigo01 = sc.next();
					for (Secretaria s : listaSecretarias.getSecretaria()) {
						if (codigo01.equals(s.getCodigo())) {
							System.out.println("Achado a Secretaria.");
							System.out.println("Vamos adicionar um novo rem�dio para esta Secretaria.");
							System.out.println("**********");
							Remedio r = new Remedio();
							r.cadastrarRemedio();
							s.getRemedios().add(r);
						}
					}
				}
				break;
			}
			case 13: { // INCLUIR FARM�CIA
				if (listaSecretarias.getSecretaria().isEmpty()) {
					System.out.println("A lista de secretaria est� vazia.");
				} else {
					System.out.println("Qual o c�digo da Secretaria?");
					String codigo01 = sc.next();
					for (Secretaria s : listaSecretarias.getSecretaria()) {
						if (codigo01.equals(s.getCodigo())) {
							System.out.println("Achado a Secretaria.");
							System.out.println("Vamos adicionar uma nova farm�cia para esta Secretaria.");
							System.out.println("**********");
							Farmacia f = new Farmacia();
							f.cadastrarFarmacia();
							s.getFarmacias().add(f);
						}
					}
				}
				break;
			}
			case 21: { // Alterar FORNECEDOR
				if (listaSecretarias.getSecretaria().isEmpty()) {
					System.out.println("A lista de secretaria est� vazia.");
				} else {
					System.out.println("Qual o c�digo da Secretaria?");
					String codigo = sc.next();
					for (Secretaria s : listaSecretarias.getSecretaria()) {
						if (codigo.equals(s.getCodigo())) {
							System.out.println("A secretaria foi achada.");
							System.out.println("Informe a posi��o do fornecedor para ser adicionado: ");
							int posicao = sc.nextInt();
							Fornecedor x = new Fornecedor();
							x.cadastrarFornecedor();
							s.getFornecedores().remove(posicao);
							s.getFornecedores().add(posicao, x);
						}
					}
				} // end else
				break;
			}
			case 22: { // Alterar REM�DIO
				if (listaSecretarias.getSecretaria().isEmpty()) {
					System.out.println("A lista de secretaria est� vazia.");
				} else {
					System.out.println("Qual o c�digo da Secretaria?");
					String codigo = sc.next();
					for (Secretaria s : listaSecretarias.getSecretaria()) {
						if (codigo.equals(s.getCodigo())) {
							System.out.println("A secretaria foi achada.");
							System.out.println("Informe a posi��o do rem�dio para ser adicionado: ");
							int posicao = sc.nextInt();
							Remedio x = new Remedio();
							x.cadastrarRemedio();
							s.getRemedios().remove(posicao);
							s.getRemedios().add(posicao, x);
						}
					}
				} // end else
				break;
			}
			case 23: { // Alterar FARM�CIA
				if (listaSecretarias.getSecretaria().isEmpty()) {
					System.out.println("A lista de secretaria est� vazia.");
				} else {
					System.out.println("Qual o c�digo da Secretaria?");
					String codigo = sc.next();
					for (Secretaria s : listaSecretarias.getSecretaria()) {
						if (codigo.equals(s.getCodigo())) {
							System.out.println("A secretaria foi achada.");
							System.out.println("Informe a posi��o da farm�cia para ser adicionado: ");
							int posicao = sc.nextInt();
							Farmacia x = new Farmacia();
							x.cadastrarFarmacia();
							s.getFarmacias().remove(posicao);
							s.getFarmacias().add(posicao, x);
						}
					}
				} // end else
				break;
			}
			case 31: { // Excluir FORNECEDOR
				if (listaSecretarias.getSecretaria().isEmpty()) {
					System.out.println("A lista de secretaria est� vazia.");
				} else {
					System.out.println("Qual o c�digo da Secretaria?");
					String codigo = sc.next();
					for (Secretaria s : listaSecretarias.getSecretaria()) {
						if (codigo.equals(s.getCodigo())) {
							System.out.println("A secretaria foi achada.");
							System.out.println("Informe a posi��o do fornecedor para ser exclu�do: ");
							int posicaoExcluir = sc.nextInt();
							s.getFornecedores().remove(posicaoExcluir);
						}
					}
				}
				break;
			}
			case 32: { // Excluir REM�DIO
				if (listaSecretarias.getSecretaria().isEmpty()) {
					System.out.println("A lista de secretaria est� vazia.");
				} else {
					System.out.println("Qual o c�digo da Secretaria?");
					String codigo = sc.next();
					for (Secretaria s : listaSecretarias.getSecretaria()) {
						if (codigo.equals(s.getCodigo())) {
							System.out.println("A secretaria foi achada.");
							System.out.println("Informe a posi��o do rem�dio para ser exclu�do: ");
							int posicaoExcluir = sc.nextInt();
							s.getRemedios().remove(posicaoExcluir);
						}
					}
				}
				break;
			}
			case 33: { // Excluir FARM�CIA
				if (listaSecretarias.getSecretaria().isEmpty()) {
					System.out.println("A lista de secretaria est� vazia.");
				} else {
					System.out.println("Qual o c�digo da Secretaria?");
					String codigo = sc.next();
					for (Secretaria s : listaSecretarias.getSecretaria()) {
						if (codigo.equals(s.getCodigo())) {
							System.out.println("A secretaria foi achada.");
							System.out.println("Informe a posi��o da farm�cia para ser exclu�da: ");
							int posicaoExcluir = sc.nextInt();
							s.getFarmacias().remove(posicaoExcluir);
						}
					}
				}
				break;
			}
			case 41: { // Consultar FORNECEDOR
				String opcao = "";
				int posicao = 0;
				int cont;
				if (listaSecretarias.getSecretaria().isEmpty()) {
					System.out.println("A lista de secretaria est� vazia.");
				} else {
					System.out.println("Qual o c�digo da Secretaria?");
					String codigo = sc.next();
					for (Secretaria s : listaSecretarias.getSecretaria()) {
						if (codigo.equals(s.getCodigo())) {
							System.out.println("A secretaria foi achada.");
							System.out.println("Digite o c�digo do Fornecedor para consultar no sistema: ");
							String codigoF = sc.next();
							opcao = "nao";
							posicao = 0;
							cont = -1;
							for (Fornecedor f : s.getFornecedores()) {
								cont++;
								if (codigoF.equals(f.getCodigo())) {
									opcao = "sim";
									posicao = cont;
								}
							} // end for Fornecedor
						} // end if
					} // end for Secretaria
				} // end else
				if (opcao.equals("nao")) {
					System.out.println("O Fornecedor n�o est� na lista.");
				} else {
					System.out.println("Achado o fonecedor e sua posi��o �: " + posicao);
				}
				break;
			}
			case 42: { // Consultar REM�DIO
				String opcao = "";
				int posicao = 0;
				int cont;
				if (listaSecretarias.getSecretaria().isEmpty()) {
					System.out.println("A lista de secretaria est� vazia.");
				} else {
					System.out.println("Qual o c�digo da Secretaria?");
					String codigo = sc.next();
					for (Secretaria s : listaSecretarias.getSecretaria()) {
						if (codigo.equals(s.getCodigo())) {
							System.out.println("A secretaria foi achada.");
							System.out.println("Digite o c�digo do Rem�dio para consultar no sistema: ");
							String codigoF = sc.next();
							opcao = "nao";
							posicao = 0;
							cont = -1;
							for (Remedio r : s.getRemedios()) {
								cont++;
								if (codigoF.equals(r.getCodigo())) {
									opcao = "sim";
									posicao = cont;
								}
							} // end for Rem�dio
						} // end if
					} // end for Secretaria
				} // end else
				if (opcao.equals("nao")) {
					System.out.println("O Fornecedor n�o est� na lista.");
				} else {
					System.out.println("Achado o fonecedor e sua posi��o �: " + posicao);
				}
				break;

			}
			case 43: { // Consultar FARM�CIA
				String opcao = "";
				int posicao = 0;
				int cont;
				if (listaSecretarias.getSecretaria().isEmpty()) {
					System.out.println("A lista de secretaria est� vazia.");
				} else {
					System.out.println("Qual o c�digo da Secretaria?");
					String codigo = sc.next();
					for (Secretaria s : listaSecretarias.getSecretaria()) {
						if (codigo.equals(s.getCodigo())) {
							System.out.println("A secretaria foi achada.");
							System.out.println("Digite o c�digo da Farm�cia para consultar no sistema: ");
							String codigoF = sc.next();
							opcao = "nao";
							posicao = 0;
							cont = -1;
							for (Farmacia f : s.getFarmacias()) {
								cont++;
								if (codigoF.equals(f.getCodigo())) {
									opcao = "sim";
									posicao = cont;
								}
							} // end for Farm�cia
						} // end if
					} // end for Secretaria
				} // end else
				if (opcao.equals("nao")) {
					System.out.println("A Farm�cia n�o est� na lista.");
				} else {
					System.out.println("Achado a farm�cia e sua posi��o �: " + posicao);
				}
				break;
			}
			default: {
				System.out.println("Voc� n�o digitou a op��o correta.");
			}
			}
			System.out.println("Digite -1 para sair ou outro n�mero para continuar no menu Secretaria: ");
			try {
				sair = sc.nextInt();
				if (sair != -1) {
					sair = 0;
				}
			} catch (InputMismatchException e) {
				System.out.println("Op��o inv�lida........");
			}
		} // end while.

	}
}
