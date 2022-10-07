package service;

import java.math.BigDecimal;

import sistema.Funcionario;

public interface ValidacaoReajustes {
	void validar(Funcionario funcionario, BigDecimal aumento);
}
