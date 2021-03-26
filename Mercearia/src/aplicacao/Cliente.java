package aplicacao;
import java.util.ArrayList;

public class Cliente {
	private String CPF;
	private String nome;
	private String telefone;
	private String endereço;
	private ArrayList <Compra> compras;
	private ArrayList <Compra> dividas;
	
	
	public Cliente(String CPF, String nome) {
		this.CPF = CPF;
		this.nome = nome;
		this.compras = new ArrayList<Compra>();
		this.dividas = new ArrayList<Compra>();
	}
	
	public String getCPF() {
		return CPF;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public void addCompra(Compra c) {
		compras.add(c);
	}
	public void comprarFiado(Compra c) {
		dividas.add(c);
	}
	//public pagarDívida(Compra c) {	}
	@Override
	public String toString() {
		String results =  "[ CPF: " + this.getCPF() + " - Nome: " + this.getNome();
		if(this.getTelefone() != null) results += " - Telefone: " + this.getTelefone();
		else results += " - Telefone: Desconhecido ";
		
		if(this.getEndereço() != null) results += " - Endereço: " + this.getEndereço();
		else results += " - Endereço: Desconhecido";
		
		results += "]";
		
		return results;
	}
}
