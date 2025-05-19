package mode.voll.api.paciente;

import jakarta.validation.constraints.NotNull;
import mode.voll.api.endereco.dadosEndereco;

public record dadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        dadosEndereco endereco){

}
