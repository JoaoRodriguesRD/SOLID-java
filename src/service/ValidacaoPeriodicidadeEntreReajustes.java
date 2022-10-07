package service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import sistema.Funcionario;
import sistema.ValidacaoException;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajustes{
	public void validar(Funcionario funcionario, BigDecimal aumento) {
		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		LocalDate dataAtual = LocalDate.now();
		long mesesDeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
		if (mesesDeUltimoReajuste < 6) {
			throw new ValidacaoException("Intervalo entre reajuste deve ser no min 6 meses!");
		}
	}
}
