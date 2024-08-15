package entities;

public class ContaBanco {

	// Atributos

	public int conta;
	protected String tipo;
	private String dono;
	private Double saldo;
	private Boolean status;

	// Métodos Personalizados

	public void estadoAtual() {
		System.out.println("--------------------------");
		System.out.println("Conta: " + this.getConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}

	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if (tipo == "CC") {
			this.setSaldo(50.00);
		} else if (tipo == "CP") {
			this.setSaldo(150.00);
		}
		System.out.println("Conta aberta com sucesso!");
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada pois ainda tem dinheiro!");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada pois tem débitos pendentes!");
		} else {
			this.setStatus(false);
			;
		}
	}

	public void depositar(Double deposito) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + deposito);
			System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
		} else {
			System.out.println("Impossível depositar em uma conta fechada");
		}
	}

	public void sacar(Double sacar) {
		if (this.getStatus()) {
			if (this.getSaldo() >= sacar) {
				this.setSaldo(this.getSaldo() - sacar);
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("Impossível sacar de uma conta fechada!");
		}
	}

	public void pagarMensal() {
		int pagar = 0;

		if (this.getTipo() == "CC") {
			pagar = 12;
		} else if (this.getTipo() == "CP") {
			pagar = 20;
		}
		if (this.getStatus()) {
			if (this.getSaldo() > pagar) {
				this.setSaldo(this.getSaldo() - pagar);
				System.out.println("Saque realizado com sucesso na conta de " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("Impossível uma conta fechada pagar");
		}
	}

	// Métodos Especiais

	public ContaBanco() {
		this.setSaldo(0.0);
		this.setStatus(false);
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
