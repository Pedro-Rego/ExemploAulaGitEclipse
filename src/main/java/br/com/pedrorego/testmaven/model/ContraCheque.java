package br.com.pedrorego.testmaven.model;

import br.com.pedrorego.testmaven.util.Teclado;

public class ContraCheque {
	private String nome;
	private double salarioBruto;
	private double salarioLiquido;
	private double totalDescontos;
	public ContraCheque() {
		super();
	}
	public static ContraCheque questionario() {
		String nome = Teclado.lerTexto ("Informe o nome do funcionário: ");
		double sb = Teclado.lerDouble("Informe o salário bruto do funcionário: ");
		double td = Teclado.lerDouble("Informe o total de descontos: ");
		ContraCheque cc = new ContraCheque(nome, sb, td);
		return cc;
		}
	
	public ContraCheque(String nome, double salarioBruto, double salarioLiquido, double totalDescontos) {
		super();
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.salarioLiquido = salarioLiquido;
		this.totalDescontos = totalDescontos;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	public double getTotalDescontos() {
		return totalDescontos;
	}

	public void setTotalDescontos(double totalDescontos) {
		this.totalDescontos = totalDescontos;
	}
public ContraCheque(String nome, double salarioBruto, double totalDescontos) {
	super();
	this.nome = nome;
	this.salarioBruto = salarioBruto;
	this.totalDescontos = totalDescontos;
	this.salarioLiquido = this.salarioBruto - this.totalDescontos;
	}
public void relatorio() {
	System.out.println("---------------------------------------");
	System.out.println("Funcionário: " + this.getNome());
	System.out.println("Salário Bruto: R$ " + this.getSalarioBruto());
	System.out.println("Total de Descontos: R$" + this.getTotalDescontos());
	System.out.println("Salário Líquido: R$ " + this.getSalarioLiquido());
	System.out.println("---------------------------------------");
	}
}