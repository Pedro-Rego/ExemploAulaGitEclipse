package br.com.pedrorego.testmaven.model;

public class ContraChequeTest2 {
	
	public static void main(String[] args) {
		// Cenario
		String nomeTest = "Manuel";
		double salarioBrutoTest = 6000.00;
		double totalDescontosTest = 1000.00;
		ContraCheque c1 = new ContraCheque(nomeTest, salarioBrutoTest, totalDescontosTest);
		
		//Ação
		c1.relatorio();
		
		//Verificação
		System.out.println(c1.getNome().equals(nomeTest));
		System.out.println(c1.getSalarioBruto() == salarioBrutoTest);
		System.out.println(c1.getTotalDescontos() == totalDescontosTest);
		System.out.println(c1.getSalarioLiquido() == (salarioBrutoTest - totalDescontosTest));
		
	}

}