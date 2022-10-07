package sistema;

import java.math.BigDecimal;

public class Terceirizado extends Funcionario{
	private String empresaOrigem;

	public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		super(nome, cpf, cargo, salario);
	}

	public String getEmpresaOrigem() {
		return empresaOrigem;
	}

	public void setEmpresaOrigem(String empresaOrigem) {
		this.empresaOrigem = empresaOrigem;
	}
	

}
