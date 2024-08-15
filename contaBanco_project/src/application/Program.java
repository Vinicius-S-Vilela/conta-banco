package application;

import entities.ContaBanco;

public class Program {

	public static void main(String[] args) {
		ContaBanco c1 = new ContaBanco();
		ContaBanco c2 = new ContaBanco();
		
		c1.setConta(5648);
		c1.setDono("Vinicius Vilela");
		c1.abrirConta("CC");
		
		c2.setConta(3546);
		c2.setDono("Maria Silva");
		c2.abrirConta("CP");
		
		c1.depositar(300.00);
		c2.depositar(500.00);
		
		c1.sacar(350.00);
		c2.sacar(150.00);
		
		c1.fecharConta();

		c1.estadoAtual();
		c2.estadoAtual();

	}

}
