import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Secretaria {
	private List<Secretaria> secretaria = new ArrayList<Secretaria>();
	private String codigo;
	private String secretario;
	private List<Fornecedor> fornecedores= new ArrayList<Fornecedor>();
	private List<Remedio> remedios = new ArrayList<Remedio>();
	private List<Farmacia> farmacias = new ArrayList<Farmacia>();
	
	Secretaria(){
		
	}
	Secretaria(String codigo, String secretario) {
		this.codigo = codigo;
		this.secretario = secretario;		 
	}
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getSecretario() {
		return secretario;
	}
	public void setSecretario(String secretario) {
		this.secretario = secretario;
	}
	
	public List<Secretaria> getSecretaria() {
		return secretaria;
	}
	public void setSecretaria(List<Secretaria> secretaria) {
		this.secretaria = secretaria;
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
	public List<Farmacia> getFarmacias() {
		return farmacias;
	}
	public void setFarmacias(List<Farmacia> farmacias) {
		this.farmacias = farmacias;
	}
	
	public void cadastrarSecretaria() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código da Secretaria: ");
		this.codigo = sc.next();
		System.out.println("Digite o nome do Secretário: ");
		this.secretario = sc.next();
	}
	
	
	
}



//código, secretario, fornecedores, remédios, farmácias