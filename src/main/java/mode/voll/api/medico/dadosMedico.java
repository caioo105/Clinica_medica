package mode.voll.api.medico;

import mode.voll.api.endereco.dadosEndereco;

public record dadosMedico(String nome, String email, String crm, Especialidade especialidade, dadosEndereco endereco) {
}
