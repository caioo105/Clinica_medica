package mode.voll.api.paciente;

public record dadosListagemPaciente(Long id, String nome, String email, String cpf) {

    public dadosListagemPaciente(Paciente paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }
}
