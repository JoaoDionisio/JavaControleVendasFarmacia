import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Farmacia {
	private List<Farmacia> farmacias = new ArrayList<Farmacia>();
	private List<String> endereco = new ArrayList<String>();	
	private String codigo;
	private String telefone;
	
	Farmacia(){
		
	}
	Farmacia(String codigo, String telefone) {
		this.codigo = codigo;
		this.telefone = telefone;
		//this.endereco 
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public List<String> getEndereco() {
		return endereco;
	}
	public void setEndereco(List<String> endereco) {
		this.endereco = endereco;
	}	
	public List<Farmacia> getFarmacias() {
		return farmacias;
	}
	public void setFarmacias(List<Farmacia> farmacias) {
		this.farmacias = farmacias;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void cadastrarFarmacia() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual é o código da farmácia?");
		this.codigo = sc.next();
		System.out.println("Qual o telefone da farmácia?");
		this.telefone = sc.next();
	}
	
}
