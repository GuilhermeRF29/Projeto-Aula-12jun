package model;

public abstract class Funcionario {
	private String nome;
	private String endereco;
	private String bairro;
	private int cep;
	private String cidade;
	private String estado;
	private long rg;
	private long cpf;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public long getRg() {
		return rg;
	}
	public void setRg(long rg) {
		this.rg = rg;
	}
	
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public double aumentosSalarial (double salario, double aumento) {
		double total = salario + (salario * (aumento / 100));
		return total;
	}
	public double aumentoSalarial(double horaAula, double aumento) {
		double total = horaAula + (horaAula + (aumento / 100) + (horaAula * 30 / 100));
		return total;
	}
}
