package service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import sistema.Funcionario;
import sistema.ValidacaoException;

public class ReajusteService {
	
	private List<ValidacaoReajustes> validacoes;
	public ReajusteService(List<ValidacaoReajustes> validacoes) {
		this.validacoes = validacoes;
	}
	
	public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
		this.validacoes.forEach(v -> v.validar(funcionario,aumento));
		BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
		funcionario.atualizarSalario(salarioReajustado);
	}
}
