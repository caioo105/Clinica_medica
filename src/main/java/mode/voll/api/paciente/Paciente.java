package mode.voll.api.paciente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import mode.voll.api.endereco.Endereco;

@Table(name = "pacientes")
@Entity(name = "Paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String cpf;


    public Paciente(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Embedded
    private Endereco endereco;

    private String telefone;

    private Boolean ativo;


    public Paciente(dadosPaciente dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.cpf = dados.cpf();
        this.email = dados.email();
        this.endereco = new Endereco(dados.endereco());
        this.telefone = dados.telefone();
    }

    public void atualizarInformacoes(dadosAtualizacaoPaciente dados) {
        if(dados.nome()!= null){
            this.nome = dados.nome();
        }

        if(dados.telefone() != null) {
            this.telefone = dados.telefone();
        }

        if(dados.endereco() != null) {
            this.endereco.atualizarInformacoes(dados.endereco());
        }

    }

    public void excluir(){
        this.ativo = false;
    }
}
