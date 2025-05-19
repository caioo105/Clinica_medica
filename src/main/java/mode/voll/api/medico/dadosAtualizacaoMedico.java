package mode.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import mode.voll.api.endereco.dadosEndereco;

public record dadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        dadosEndereco endereco) {
}
