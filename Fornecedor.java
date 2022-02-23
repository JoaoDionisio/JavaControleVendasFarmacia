import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Fornecedor {
	private List<Fornecedor> fornecedor = new ArrayList<Fornecedor>();
	private String codigo;
	private String razao_social;
	private String contato;
	private String seguimento;
	
	Fornecedor() {
		
	}
	Fornecedor(String codigo, String razao_social, String contato, String seguimento) {
		this.codigo = codigo;
		this.razao_social = razao_social;
		this.contato = contato;
		this.seguimento = seguimento;
		
	}	
	
	public List<Fornecedor> getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(List<Fornecedor> fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getRazao_social() {
		return razao_social;
	}
	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getSeguimento() {
		return seguimento;
	}
	public void setSeguimento(String seguimento) {
		this.seguimento = seguimento;
	}
	
	public void imprimirFornecedores() {
		for(Fornecedor f: getFornecedor()) { // Objeto f recebe cada elemento da lista.  
			System.out.println(f.getCodigo() + f.getRazao_social() + f.getContato() + f.getSeguimento());
		}
	}
	
	public void cadastrarFornecedor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual é o código do fornecedor?");
		this.codigo = sc.next();
		System.out.println("Qual a razão social do fornecedor?");
		this.razao_social = sc.next();
		System.out.println("Qual o contato do fornecedor?");
		this.contato = sc.next();
		System.out.println("Qual o seguimento do fornecedor?");
		this.seguimento = sc.next();
		
	}
	
}
