import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Remedio {
	private List<Remedio> remedios = new ArrayList<Remedio>();
	private List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
	private String codigo;
	private String nome;
	private String nome_cientifico;	 
	private String natureza;
	
	Remedio(){
		
	}
	// EU PASSO SOMENTE OS ATRIBUTOS E CRIO A LISTA DE FORNECEDORES NO CONSTRUTOR.
		// DEPOIS PASSO A LISTA DE FORNECEDORES UM POR UM.
	Remedio(String codigo, String nome, String nome_cientifico, String natureza) {
		this.codigo = codigo;
		this.nome = nome;
		this.nome_cientifico = nome_cientifico;
		this.natureza = natureza;
		//this.fornecedores =  // cada objeto terá sua lista de fornecedores
		
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome_cientifico() {
		return nome_cientifico;
	}
	public void setNome_cientifico(String nome_cientifico) {
		this.nome_cientifico = nome_cientifico;
	}
	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}
	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}	
	public List<Remedio> getRemedios() {
		return remedios;
	}
	public void setRemedios(List<Remedio> remedios) {
		this.remedios = remedios;
	}
	public String getNatureza() {
		return natureza;
	}
	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}
	public void cadastrarRemedio() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite é o código do remédio: ");
		this.codigo = sc.next();
		System.out.println("Digite o nome do remédio: ");
		this.nome = sc.next();
		System.out.println("Digite o nome científico do remédio: ");
		this.nome_cientifico = sc.next();
		System.out.println("Digite a natureza do remédio: ");
		this.natureza = sc.next();
	}
	// String codigo, String nome, String nome_cientifico, String natureza
}
