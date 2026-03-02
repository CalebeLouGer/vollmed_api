package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;

import java.time.Duration;
import java.time.LocalDateTime;

public class ValidadorHorarioAntecedencia {

    public void validar(DadosAgendamentoConsulta dadosAgendamentoConsulta){
        var dataConsulta = dadosAgendamentoConsulta.data();
        var agora = LocalDateTime.now();
        var diferençaEmMinutos = Duration.between(agora,dataConsulta).toMinutes();

        if (diferençaEmMinutos < 30){
            throw new ValidacaoException("Consulta deve ser agendada com antecedência miníma de 30 minutos");
        }
    }
}
